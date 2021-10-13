package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle c5 = new Cercle(5);
		System.out.println(c5.calculPerimetre());
		System.out.println(c5.calculSurface());
		
		Cercle c10 = new Cercle(10);
		System.out.println(c10.calculPerimetre());
		System.out.println(c10.calculSurface());
		
		CercleFactory.creerCercle(15);

	}

}
