package fr.formation.metier;

public class Client {

	private int id;
	private String prenom;
	private String nom;
	private Conseiller conseiller;

	public Client(int id, String prenom, String nom) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	public Client(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	public Client() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

}
