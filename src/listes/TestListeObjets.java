package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeObjets {

	public static void main(String[] args) {
		
		ArrayList<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));
		
		System.out.println("Liste : " + liste);
		
		Ville villeLaPlusPeuplee = liste.get(0);
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i).getNbHabitants() > villeLaPlusPeuplee.getNbHabitants()) {
				villeLaPlusPeuplee = liste.get(i);
			}
		}
		System.out.println("\nVille la plus peuplée : " + villeLaPlusPeuplee.getNom());
		
		Ville villeLaMoinsPeuplee = liste.get(0);
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i).getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
				villeLaMoinsPeuplee = liste.get(i);
			}
		}
		System.out.println("\nVille la moins peuplée : " + villeLaMoinsPeuplee.getNom());
		
		System.out.println("\nSuppression de la ville la moins peuplée (" + villeLaMoinsPeuplee.getNom() + ")..."); 
		Iterator<Ville> iter = liste.iterator();
		while (iter.hasNext()) {
			Ville ville = iter.next();
			if (ville.equals(villeLaMoinsPeuplee)) {
				iter.remove();
			}
		}
		System.out.println("Liste : " + liste);
		
		System.out.println("\nModification des villes de plus de 100 000 habitants en majuscules...");
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNbHabitants() > 100000) {
				liste.get(i).setNom(liste.get(i).getNom().toUpperCase());
			}
		}
		System.out.println("Liste résultante : " + liste);
	}

}
