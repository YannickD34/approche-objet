package fr.diginamic.banque;

/** Cette classe abstraite représente le concept d'opération bancaire dans l'application
 * @author yannickdubreuil
 *
 */
public abstract class Operation {
	
	/** Date de l'opération */
	private String date;
	
	/** Montant de l'opération */
	private double montant;
	
	/** Constructeur
	 * @param date date de l'opération
	 * @param montant montant de l'opération
	 */
	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	
	/** méthode abtraite redéfinie dans Credit et Debit
	 * @return le type de l'opération (débit ou crédit)
	 */
	public abstract String getType();

	@Override
	public String toString() {
		String signe = this.getType() == "CREDIT" ? "+":"-";
		return "Opération " + this.getType() + " effectuée le " + date + ", montant = " + signe + montant + "€";
	}

	/** Getter
	 * @return la date de l'opération
	 */
	public String getDate() {
		return date;
	}

	/** Setter
	 * @param date date de l'opération
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/** Getter
	 * @return le montant de l'opération
	 */
	public double getMontant() {
		return montant;
	}

	/** Setter
	 * @param montant montant de l'opération
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
