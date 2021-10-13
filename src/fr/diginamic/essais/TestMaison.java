package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		
		Piece[] pieces = new Piece[0];
		Maison maison1 = new Maison(pieces); 		// Création maison
		
		maison1.ajouterPiece(new Salon(12.5, 0)); 	// Rez de chaussée (étage 0)
		maison1.ajouterPiece(new Cuisine(10.0, 0));
		maison1.ajouterPiece(new Wc(2,0));

		maison1.ajouterPiece(new Chambre(9.5, 1)); 	// Premier étage (étage 1)
		maison1.ajouterPiece(new Wc(2, 1));
		maison1.ajouterPiece(new Chambre(11, 1));
		maison1.ajouterPiece(new Chambre(10,1));
		maison1.ajouterPiece(null); 				// Impossible (non pris en compte)
		maison1.ajouterPiece(new Chambre(-11, -1)); // Impossible (non pris en compte)
		
		System.out.println(maison1 + "\n");				// Affichage de la liste des pièces créées

		System.out.println("Superficie du rez de chaussée (étage 0) : " + maison1.superficieEtage(0));
		System.out.println("Superficie du premier étage   (étage 1) : " + maison1.superficieEtage(1));
		System.out.println("Superficie totale de la maison : " + maison1.superficieTotale());
		System.out.println("Nombre de pièces de la maison : " + maison1.getPieces().length + "\n");
		System.out.println("Superficie globale des chambres : " + maison1.superficiePieceDonnee("Chambre"));
		System.out.println("Superficie globale des wc : " + maison1.superficiePieceDonnee("Wc"));
		System.out.println("Nombre total de chambres : " + maison1.nombreDePieces("Chambre"));
		System.out.println("Nombre total de wc : " + maison1.nombreDePieces("Wc"));

	}

}
