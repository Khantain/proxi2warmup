package fr.formation.persistence;

public class SqlQueries {
	
	public static final String CREATE_CUSTOMER = "INSERT INTO client VALUES (null, '%s', '%s')";
	public static final String SELECT_CUSTOMER = "SELECT * FROM client";
	public static final String READ_CUSTOMER = "SELECT * FROM client where id=%s";

}
