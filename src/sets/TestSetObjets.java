package sets;

import java.util.HashSet;

public class TestSetObjets {

	public static void main(String[] args) {
		
		HashSet<Pays> set = new HashSet<>();
		set.add(new Pays("USA", 332_915_000, 59_495));
		set.add(new Pays("France", 65_426_000, 43_551));
		set.add(new Pays("Allemagne", 83_900_000, 50_206));
		set.add(new Pays("UK", 68_207_000, 43_620));
		set.add(new Pays("Italie", 60_367_000, 37_970));
		set.add(new Pays("Japon", 126_051_000, 42_659));
		set.add(new Pays("Chine", 1_444_216_000, 16_624));
		set.add(new Pays("Russie", 145_912_000, 28_712));
		set.add(new Pays("Inde", 1_393_409_000, 5_174));

		Pays paysPibHabMax = null;
		for (Pays pays : set) {
			if (paysPibHabMax == null || pays.getPibParHabitants() > paysPibHabMax.getPibParHabitants()) {
				paysPibHabMax = pays;
			}
		}
		System.out.println("Pays avec le PIB/hab MAX : " + paysPibHabMax);
		
		Pays paysPibTotalMax = null;
		Pays paysPibTotalMin = null;
		for (Pays pays : set) {
			if (paysPibTotalMax == null || pays.getPibTotal() > paysPibTotalMax.getPibTotal()) {
				paysPibTotalMax = pays;
			}
			if (paysPibTotalMin == null || pays.getPibTotal() < paysPibTotalMin.getPibTotal()) {
				paysPibTotalMin = pays;
			}
		}
		System.out.println("\nPays avec le PIB Total MAX : " + paysPibTotalMax);
		System.out.println("\nPays avec le PIB Total MIN : " + paysPibTotalMin);
		
		System.out.println("\nModification du pays " + paysPibTotalMin + " en majuscules...");
		paysPibTotalMin.setNom(paysPibTotalMin.getNom().toUpperCase());
		
		for (Pays pays : set) {
			System.out.println(pays);
		}
		
		System.out.println("\nSuppression du pays " + paysPibTotalMin + "...");
		set.remove(paysPibTotalMin);
		for (Pays pays : set) {
			System.out.println(pays);
		}

	}

}
