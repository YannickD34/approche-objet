package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre thABC = new Theatre("Théâtre ABC", 1200);
		System.out.println(thABC);
		thABC.inscrire(100, 10.5);
		System.out.println(thABC);
		thABC.inscrire(500, 15);
		System.out.println(thABC);
		thABC.inscrire(500, 20.5);
		System.out.println(thABC);
		thABC.inscrire(101, 10000);
		System.out.println(thABC);
		
		System.out.println("\nNombre de clients inscrits : " + thABC.getNbClientsInscrits());
		System.out.println("Recette totale de l'établissement : " + thABC.getRecetteTotale() + "€");

	}

}
