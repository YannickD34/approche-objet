package fr.diginamic.banque;

/** Cette classe représente l'opération Crédit d'un compte bancaire
 * @author yannickdubreuil
 *
 */
public class Credit extends Operation {

	/** Constructeur
	 * @param date date du crédit
	 * @param montant du crédit
	 */
	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	/** Redéfinition de la méthode abstraite d'Operation */
	public String getType() {
		return "CREDIT";
	}

}
