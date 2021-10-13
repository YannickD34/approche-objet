package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(-1,5,7,3,-2,4,8,5));
		
		System.out.println("Liste : " + liste);
		
		System.out.println("\nTaille : " + liste.size());
		
		int max = liste.get(0);
		for (int i = 1; i < liste.size(); i++) {
			if (max < liste.get(i)) {
				max = liste.get(i);
			}
		}
		System.out.println("\nPlus grand élément : " + max);
		
		int minIndex = 0;
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(minIndex) > liste.get(i)) {
				minIndex = i;
			}
		}
		System.out.println("\nPlus petit élément : " + liste.get(minIndex));
		System.out.println("\nSuppression de " + liste.get(minIndex) + " dans la liste...");
		liste.remove(minIndex);
		System.out.println("Liste : " + liste);
		
		System.out.println("\nModification de tous les négatifs en positifs...");
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, liste.get(i)*-1);
			}
		}
		
		System.out.println("Liste résultante : " + liste);


	}

}
