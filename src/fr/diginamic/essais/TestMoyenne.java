package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne calcMoy = new CalculMoyenne();
		System.out.println(calcMoy);
		calcMoy.ajout(1.7);
		System.out.println(calcMoy);
		calcMoy.ajout(2.5);
		System.out.println(calcMoy);
		calcMoy.ajout(42.3);
		System.out.println(calcMoy);
		System.out.println("La moyenne des éléments du tableau est " + String.format("%.2f", calcMoy.calcul()));

		calcMoy.ajout(12.3);
		System.out.println("\n" + calcMoy);
		System.out.println("La moyenne des éléments du tableau est " + String.format("%.2f", calcMoy.calcul()));
		
	}

}
