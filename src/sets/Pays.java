package sets;

public class Pays {
	
	private String nom;
	private long nbHabitants;
	private long pibParHabitants;
	
	public Pays(String nom, int nbHabitants, long pibParHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitants = pibParHabitants;
	}
	
	public long getPibTotal() {
		return pibParHabitants * nbHabitants;
	}
	
	@Override
	public String toString() {
		return this.nom + " -  PIB/hab : " + this.pibParHabitants + " $ - Population : " + this.nbHabitants;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public double getPibParHabitants() {
		return pibParHabitants;
	}
	public void setPibParHabitants(long pibParHabitants) {
		this.pibParHabitants = pibParHabitants;
	}	

}
