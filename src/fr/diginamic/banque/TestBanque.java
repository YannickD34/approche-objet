package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		// Compte cpt = new Compte("FR123456", 1250.50);
		// System.out.println(cpt);
		
		Compte[] tableauDeComptes = {new Compte("FR000001", 123.5), new CompteTaux("FR000099", 546, 1.2)};
		for (int i = 0; i < tableauDeComptes.length; i++) {
			System.out.println(tableauDeComptes[i] + "\n");
		}

	}

}
