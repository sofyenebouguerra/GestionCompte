package gestionC;

import java.util.Date;

public class CompteEpargne extends Compte {
   private double taux;

@Override
public void retirer(double montant) {
	 if(montant>solde) throw new RuntimeException("solde inssuffisant");
     Retrait r=new Retrait(operations.size(), new Date(), montant);
     getOperations().add(r);
     solde-=montant;
	
}

@Override
public void updatesolde() {
solde=solde+((taux*solde)/100);	
}
public CompteEpargne(int code, double solde,double taux) {
	super();
	this.taux = taux;
	}



public CompteEpargne() {
	super();
	// TODO Auto-generated constructor stub
}

	public void afficherE() {
		// TODO Auto-generated method stub
	System.out.println("Compte [code=" + code + ", solde=" + solde + "]");
	}

   
   

}
