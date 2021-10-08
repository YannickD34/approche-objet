package fr.diginamic.banque;

/**Cette classe représente l'opération Débit d'un compte bancaire
 * @author yannickdubreuil
 *
 */
public class Debit extends Operation {

	/** Constructeur
	 * @param date date du débit
	 * @param montant montant du débit
	 */
	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	/** Redéfinition de la méthode abstraite d'Operation */
	public String getType() {
		return "DEBIT";
	}
	
}
