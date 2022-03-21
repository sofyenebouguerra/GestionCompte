package gestionC;

import java.util.Date;



public class CompteCourant extends Compte {
	
	private double decouvert;
	  
	@Override
	public void retirer(double montant) {
     if(montant>solde+decouvert) throw new RuntimeException("solde inssuffisant");
     Retrait r=new Retrait(operations.size(), new Date(), montant);
     getOperations().add(r);
     solde-=montant;
     
	}
	@Override
	public void updatesolde() {
		// TODO Auto-generated method stub
		
	}
	public CompteCourant(int code, double solde,double decouvert) {
		super();
		this.decouvert = decouvert;
	}
	
	
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}
	

public void afficherc() {
	// TODO Auto-generated method stub
	System.out.println("Compte [code=" + code + ", solde=" + solde + "]");
}
}
