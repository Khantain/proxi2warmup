package fr.formation.persistence;

public class SqlBuilder {

	public static final SqlBuilder INSTANCE = new SqlBuilder();

	public static SqlBuilder getInstance() {
		return SqlBuilder.INSTANCE;
	}

	private String query;

	private SqlBuilder() {
		this.query = "";
	}

	public SqlBuilder selectFromClient(String colName) {
		this.query += "SELECT " + colName;
		this.addSpace();
		this.query += "FROM client";
		this.addSpace();
		return SqlBuilder.INSTANCE;
	}
	public SqlBuilder selectFromClient(String colName, String colName2) {
		this.query += "SELECT " + colName;
		this.addSpace();
		this.query += colName2;
		this.addSpace();
		this.query += "FROM client";
		return SqlBuilder.INSTANCE;
	}

	public SqlBuilder whereIdIs(Integer id) {
		this.query += "WHERE id = " + id;
		return SqlBuilder.INSTANCE;
	}
	
	public SqlBuilder whereLastnameIs(String nom) {
		this.query += "WHERE nom = " + nom;
		return SqlBuilder.INSTANCE;
	}
	public SqlBuilder whereFirstnameIs(String prenom) {
		this.query += "WHERE nom = " + prenom;
		return SqlBuilder.INSTANCE;
	}

	private void addSpace() {
		this.query += " ";
	}

	public String getQuery() {
		return query;
	}

}
