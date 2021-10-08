package fr.diginamic.banque.entites;

/**
 *
 * Cette classe représente le concept de compte bancaire dans l'application
 * @author yannickdubreuil
 *
 */
public class Compte {
	
	/** Numéro de compte */
	private String numero;
	
	/** Solde du compte */
	private double solde;
	
	/** Constructeur
	 * @param numero numéro de compte
	 * @param solde solde du compte
	 */
	public Compte(String numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Numéro de compte : " + numero + "\nSolde du compte : " + solde + "€";
	}

	/** Getter
	 * @return le numero
	 */
	public String getNumero() {
		return numero;
	}
	
	/** Setter
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/** Getter
	 * @return le solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
