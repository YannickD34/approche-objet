package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cpt = new Compte("FR123456", 1250.50);
		System.out.println(cpt);

	}

}
