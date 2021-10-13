package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private int nbJoursTravailles;
	private double salaireJournalier;
	
	public Pigiste(String nom, String prenom, int nbJoursTravailles, double salaireJournalier) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public double getSalaire() {
		return nbJoursTravailles * salaireJournalier;
	}

	public int getNbJoursTravailles() {
		return nbJoursTravailles;
	}

	public void setNbJoursTravailles(int nbJoursTravailles) {
		this.nbJoursTravailles = nbJoursTravailles;
	}

	public double getSalaireJournalier() {
		return salaireJournalier;
	}

	public void setSalaireJournalier(double salaireJournalier) {
		this.salaireJournalier = salaireJournalier;
	}

}
