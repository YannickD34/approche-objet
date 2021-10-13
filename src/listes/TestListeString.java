package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		
		ArrayList<String> liste = new ArrayList<>(Arrays.asList("Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"));
		
		String villeLaPlusGrande = liste.get(0);
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i).length() > villeLaPlusGrande.length()) {
				villeLaPlusGrande = liste.get(i);
			}
		}
		System.out.println("Ville qui a le plus grand nombre de lettres : " + villeLaPlusGrande);
		
		System.out.println("\nModification de la liste pour que toutes les villes soient en majuscules...");
		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		System.out.println("Liste : " + liste);
		
		System.out.println("\nSuppression de toutes les villes dont le nom commence par N...");
		Iterator<String> iter = liste.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.charAt(0) == 'N') {
				iter.remove();
			}
		}
		
		System.out.println("Liste résultante : " + liste);

		
	}

}
