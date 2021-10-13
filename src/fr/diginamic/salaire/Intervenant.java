package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public void afficherDonnees() {
		String statut;
		if (this instanceof Salarie) {
			statut = "salarié";
		}
		else {
			statut = "pigiste";
		}
		System.out.println("Nom : " + this.nom + "\nPrénom : " + this.prenom + "\nSalaire : " + this.getSalaire() + "\nStatut : " + statut);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
