package fr.formation.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	public static final MySqlConnection INSTANCE = new MySqlConnection();
	private Connection conn;

	public static MySqlConnection getInstance() {
		return MySqlConnection.INSTANCE;
	}

	public MySqlConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proxi2?serverTimezone=Europe/Paris",
					"root", "root");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("aucune connexion");
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

}
