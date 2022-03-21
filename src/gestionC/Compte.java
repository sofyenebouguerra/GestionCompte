package gestionC;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public abstract class Compte {
	
	protected int code;
	protected double solde;
	protected List<Operation> operations=new ArrayList<>();

	
	
	public Compte() {
		super();
	}

	public Compte(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;
	}

	

	public void verser (double montant) {
		Versement v=new Versement(operations.size()+1, new Date(), montant);
		operations.add(v);
		
		solde+=montant;
	}
	
	public abstract void retirer(double montant) ;
		
	/*	Retrait r=new Retrait(operations.size()+1, new Date(), montant);
		operations.add(r);
		solde-=montant;
		
	}*/
	public void virement (double montant ,Compte compte2) {
		retirer(montant);
		compte2.verser(montant);
		
		
		
		
	}
	public double consulter() {
		return solde;
		
	}
	public abstract  void updatesolde() ;
	
	public List<Operation> listeroperation(){
		return operations;
	}
	
	public double totalVersement() {
	double somme=0;
	for(Operation o:operations) {
		if(o instanceof Versement) {
			somme+=o.getMontantO();
		}
	}
	return somme;
		
	}
	
	
	public double totalRetraits() {
		double somme=0;
		for(Operation o:operations) {
			if(o instanceof Retrait) {
				somme+=o.getMontantO();
			}
		}
		return somme;
			
		}
	public double totalRetrait() {
		return code;
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}


	public void afficher() {
		System.out.println("Compte [code=" + code + ", solde=" + solde + "]");
	}

	

	
	
	
	
}


