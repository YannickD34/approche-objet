package fr.diginamic.banque.entites;

/** Compte rémunéré
 * @author yannickdubreuil
 *
 */
public class CompteTaux extends Compte {
	
	/** Tayx de rémunération du compte */
	private double tauxRemuneration;

	/** Constructeur
	 * @param numero numéro de compte
	 * @param solde solde du compte
	 * @param tauxRemuneration taux de rémunération du compte
	 */
	public CompteTaux(String numero, double solde, double tauxRemuneration) {
		super(numero, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTaux de rémunération : " + tauxRemuneration + "%";
	}
	
	/** Getter
	 * @return le taux de rémunération
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration le taux à définir
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
