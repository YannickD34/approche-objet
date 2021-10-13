package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capacitéMax;
	private int nbClientsInscrits;
	private double recetteTotale;
	
	public Theatre(String nom, int capacitéMax) {
		super();
		this.nom = nom;
		this.capacitéMax = capacitéMax;
		this.nbClientsInscrits = 0;
		this.recetteTotale = 0.0d;
	}

	public void inscrire(int nbClients, double prixPlace) {
		if (nbClientsInscrits+nbClients <= capacitéMax) {
			nbClientsInscrits += nbClients;
			recetteTotale += nbClients * prixPlace;
		}
		else {
			System.out.println("L'incription de " + nbClients + " nouveaux clients est impossible car la capacité maximale du théâtre est de " + capacitéMax + " personnes.");
		}
	}

	@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", capacitéMax=" + capacitéMax + ", nbClientsInscrits=" + nbClientsInscrits
				+ ", recetteTotale=" + recetteTotale + "€]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacitéMax() {
		return capacitéMax;
	}

	public void setCapacitéMax(int capacitéMax) {
		this.capacitéMax = capacitéMax;
	}

	public int getNbClientsInscrits() {
		return nbClientsInscrits;
	}

	public void setNbClientsInscrits(int nbClientsInscrits) {
		this.nbClientsInscrits = nbClientsInscrits;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}

}
