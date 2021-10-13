package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		
		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(5,10);
		Carre carre = new Carre(5);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);
		
	}

}
