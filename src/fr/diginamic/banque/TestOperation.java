package fr.diginamic.banque;

/** Cette classe permet de tester un enchaînement d'opérations de crédits et débits sur un compte bancaire
 * @author yannickdubreuil
 *
 */
public class TestOperation {

	public static void main(String[] args) {
		
		double montantGlobal = 0;
		
		Operation[] operations = new Operation[4];
		operations[0] = new Credit("01/01/21", 250.5);
		operations[1] = new Debit("02/02/21", 42.0);
		operations[2] = new Debit("03/03/21", 1500.5);
		operations[3] = new Credit("04/04/21", 10.0);
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
			if (operations[i].getType() == "CREDIT") // Si l'opération est un crédit alors on ajoute le montant au montant global
				montantGlobal += operations[i].getMontant();
			else // Il n'y a que deux opérations CREDIT ou DEBIT, donc ici pas besoin de tester si le type est bien un DEBIT
				montantGlobal -= operations[i].getMontant(); // On enlève le montant du débit au montant global
		}
		
		System.out.println("\nMontant global des opérations effectuées = " + montantGlobal + "€");


	}

}
