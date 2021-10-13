package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println("Périmètre : " + String.format("%.4f", forme.calculerPerimetre()) + " --- Surface : " + String.format("%.4f",forme.calculerSurface()));
	}

}
