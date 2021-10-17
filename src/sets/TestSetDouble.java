package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet<>();
		set.addAll(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		System.out.println("Tous les éléments de la collection : ");
		for (Double valeur : set) {
			System.out.print(valeur + " ");
		}
		System.out.println();
		
		double max = Double.MIN_VALUE;
		for (double elt : set) {
			if (elt > max) {
				max = elt;
			}
		}
		System.out.println("\nLe plus grand élément du set est : " + max);
		
		double min = Double.MAX_VALUE;
		for (double elt : set) {
			if (elt < min) {
				min = elt;
			}
		}
		System.out.println("\nLe plus petit élément du set est : " + min);
		System.out.println("Suppression de l'élément " + min + "...");
		Iterator<Double> iter = set.iterator(); //set.remove(min);
		while (iter.hasNext()) {
			double elt = iter.next();
			if (elt == min) {
				iter.remove();
			}
		}
		System.out.println("Tous les éléments de la collection modifiée : " + set);

	}

}
