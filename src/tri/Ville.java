package tri;

public class Ville implements Comparable<Ville> {
	
	private String nom;
	private int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	/*@Override
	public int compareTo(Ville o) {
		int res = this.nom.compareTo(o.getNom());
		return res;	
	}*/
	
	@Override
	public int compareTo(Ville o) {
		if (this.nbHabitants < o.getNbHabitants()) {
			return -1;
		}
		if (this.nbHabitants > o.getNbHabitants()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() { // Sert pour l'affichage de la liste des villes
		return nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
