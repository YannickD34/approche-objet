package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>(Arrays.asList("USA","France","Allemagne","UK","Italie","Japon","Chine","Russie","Inde"));
		System.out.println(set);
		
		String chaineLaPlusGrande = "";
		for (String elt : set) {
			if (elt.length() > chaineLaPlusGrande.length()) {
				chaineLaPlusGrande = elt;
			}
		}
		System.out.println("\nLe pays qui a le plus grand nombre de lettres est : " + chaineLaPlusGrande);
		
		System.out.println("\nSuppression du pays " + chaineLaPlusGrande + "...");
		Iterator<String> iter = set.iterator(); // set.remove(chaineLaPlusGrande);
		while (iter.hasNext() ) {
			String elt = iter.next();
			if (elt.equals(chaineLaPlusGrande)) {
				iter.remove();
			}
		}
		System.out.println("Collection modifiée : " + set);

	}

}
