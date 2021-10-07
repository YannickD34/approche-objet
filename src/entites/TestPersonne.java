package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne pers1 = new Personne();
		pers1.nom = "Dupont";
		pers1.prenom = "Jean";
		pers1.adresse.numeroRue = 12;
		pers1.adresse.libelleRue = "avenue de Toulouse";
		pers1.adresse.codePostal = 75000;
		pers1.adresse.ville = "Paris";
		
		Personne pers2 = new Personne();
		pers2.nom = "Martin";
		pers2.prenom = "Pierre";
		pers2.adresse.numeroRue = 58;
		pers2.adresse.libelleRue = "rue des Mirtilles";
		pers2.adresse.codePostal = 34000;
		pers2.adresse.ville = "Montpellier";
		
	}

}
