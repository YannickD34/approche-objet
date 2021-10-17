package tri;

import java.util.Comparator;

/** Cette classe permet d'effectuer un tri sur le nombre d'habitants
 * 
 * @author yannickdubreuil
 *
 */
public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if (o1.getNbHabitants() < o2.getNbHabitants()) {
			return -1;
		}
		if (o1.getNbHabitants() > o2.getNbHabitants()) {
			return 1;
		}
		return 0;
	}

}
