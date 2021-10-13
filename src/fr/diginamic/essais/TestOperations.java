package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		System.out.println(Operations.calcul(2.1, 3.5, '+'));
		System.out.println(Operations.calcul(7.7, 4.4, '-'));
		System.out.println(Operations.calcul(5.2, 10, '*'));
		System.out.println(Operations.calcul(12.5, 3, '/'));
		//System.out.println(Operations.calcul(12.5, 3, '.'));

	}

}
