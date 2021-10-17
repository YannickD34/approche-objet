package maps;

import java.util.HashMap;
import java.util.Set;

public class FusionMap {

	public static void main(String[] args) {
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println("Taille de la map3 : " + map3.size() + "\n");
		Set<Integer> cles = map3.keySet();
		for(Integer cle: cles) {
			String val = map3.get(cle);
			System.out.println(cle + " --> " + val);
		}

	}

}
