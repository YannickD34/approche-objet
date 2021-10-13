package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Longueur de la chaine : " + chaine.length());
		System.out.println("Index du premier \";\" : " + chaine.indexOf(';'));
		String nomFamille = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("Nom de famille : " + nomFamille);
		System.out.println("Nom de famille en majuscules : " + nomFamille.toUpperCase());
		System.out.println("Nom de famille en minuscules : " + nomFamille.toLowerCase());
		System.out.println("Tableau découpé : " + Arrays.toString(chaine.split(";")) + "\n");
		
		String[] tab = chaine.split(";");
		String salaireSansEspace = tab[2].replace(" ", "");
		double salaire = Double.parseDouble(salaireSansEspace);
		Salarie s1 = new Salarie(tab[0], tab[1], salaire);
		System.out.print(s1.getNom() + " ");
		System.out.print(s1.getPrenom() + " ");
		System.out.println(s1.getSalaire());

	}

}
