package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Intervenant salarie1 = new Salarie("Dupont", "Jean", 1200);
		System.out.println("Résultat retourné par la méthode getSalaire() : " + salarie1.getSalaire());
		salarie1.afficherDonnees();
		
		System.out.println();
		
		Intervenant pigiste1 = new Pigiste("Martin", "Pierre", 10, 60);
		System.out.println("Résultat retourné par la méthode getSalaire() : " + pigiste1.getSalaire());
		pigiste1.afficherDonnees();

	}

}
