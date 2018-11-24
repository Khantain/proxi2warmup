package fr.formation.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.metier.Client;

public class ClientDao implements Dao<Client> {
	
	public static final ClientDao INSTANCE = new ClientDao();
	
	public static ClientDao getInstance() {
		return ClientDao.INSTANCE;
	}
	
	private ClientDao() {
	}

	@Override
	public void create(Client entity) {
		
	}

	@Override
	public void update(Client entity) {
		
	}

	@Override
	public Client read(int id) {
		Client client = null;
		Connection conn = MySqlConnection.getInstance().getConn();
		
		
		return client;
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public List<Client> readAll() {
		List<Client> customers = new ArrayList<>();
		Connection conn = MySqlConnection.getInstance().getConn();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SqlQueries.SELECT_CUSTOMER);
			
			while (rs.next()) {
				Integer id = rs.getInt("idclient");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				customers.add(new Client(id,prenom,nom));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customers;
	}

}
