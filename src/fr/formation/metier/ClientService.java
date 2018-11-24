package fr.formation.metier;

import java.util.List;

import fr.formation.persistence.ClientDao;

public class ClientService {
	
	public static final ClientService INSTANCE = new ClientService();
	
	private ClientDao dao = ClientDao.getInstance();

	
	
	public static ClientService getInstance() {
		return ClientService.INSTANCE;
	}
	
	public ClientService() {
	}
	
	public List<Client> getAll(){
		return this.dao.readAll();
	}

}
