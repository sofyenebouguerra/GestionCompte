package gestionC;

import java.awt.List;

public abstract class Compte {
	
	private int code;
	private double solde;

	
	
	public void verser (double montant) {
		
	}
	
	public void retirer(double montant) {
		
	}
	public void virement (double montant ,Compte compte) {
		
	}
	public double consulter() {
		return code;
		
	}
	public  void updatesolde() {
		
	}
	//public List<Operation> listeroperation(){
		
	//}
	public double totalVersement() {
		return code;
		
	}
	public double totalRetrait() {
		return code;
		
	}
}


