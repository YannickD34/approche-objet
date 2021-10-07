package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(12, "avenue de Toulouse", 75000, "Paris");
		AdressePostale adr2 = new AdressePostale(58, "rue des Mirtilles", 34000, "Montpellier");

		Personne pers1 = new Personne("Dupont", "Jean", adr1);
		Personne pers2 = new Personne("Martin", "Pierre", adr2);
		
	}

}
