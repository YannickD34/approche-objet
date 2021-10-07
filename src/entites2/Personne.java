package entites2;

import entites.AdressePostale;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void afficherPersonne() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	public void modifierNomPersonne(String nouveauNom) {
		this.nom = nouveauNom;
	}
	
	public void modifierPrenomPersonne(String nouveauPrenom) {
		this.prenom = nouveauPrenom;
	}
	
	public void modifierAdresse(AdressePostale nouvelleAdresse) {
		this.adresse = nouvelleAdresse;
	}
	
	public String retournerNom() {
		return this.nom;
	}
	
	public String retournerPrenom() {
		return this.prenom;
	}
	
	public AdressePostale retournerAdresse() {
		return this.adresse;
	}

}
