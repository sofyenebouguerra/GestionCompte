package gestionC;

import java.util.Date;

public class Operation {
    private int numeroO;
    private Date dateOperation;
    private double montantO;
    
    
    
    
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation(int numeroO, Date dateOperation, double montantO) {
		super();
		this.numeroO = numeroO;
		this.dateOperation = dateOperation;
		this.montantO = montantO;
	}
	public int getNumeroO() {
		return numeroO;
	}
	public void setNumeroO(int numeroO) {
		this.numeroO = numeroO;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontantO() {
		return montantO;
	}
	public void setMontantO(double montantO) {
		this.montantO = montantO;
	}
    
    
}
