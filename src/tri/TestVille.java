package tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		/*System.out.println("Liste des villes non triées            " + villes);
		Collections.sort(villes);
		System.out.println("\nVilles triées par ordre alphabétique   " + villes);*/
		
		/*System.out.println("Liste des villes non triées            " + villes);
		Collections.sort(villes);
		System.out.println("\nVilles triées par nombre d'habitants   " + villes);*/
		

		
		
		System.out.println("Liste des villes non triées            " + villes);
		Collections.sort(villes, new ComparatorHabitant());
		System.out.println("\nVilles triées par nombre d'habitants   " + villes);
		
		System.out.println("\n----------");

		System.out.println("\nListe des villes non triées            " + villes);
		Collections.sort(villes, new ComparatorNom());
		System.out.println("\nVilles triées par ordre alphabétique   " + villes);

	}

}
