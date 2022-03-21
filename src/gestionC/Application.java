package gestionC;

public class Application {

	public static void main(String[] args) {
    Compte cc=new CompteCourant(1, 8000, 5000);
    System.out.println("le solde de compte courant est" +cc.code);
    Compte ce=new CompteEpargne(2, 20000, 5.5);
    
      cc.verser(3000);
      cc.retirer(100);
      cc.virement(2000, ce);
      System.out.println("le solde de compte courant est" +cc.consulter());
      System.out.println("le solde de compte epargne est" +ce.consulter());
        
      System.out.println("total de versements est " +cc.totalVersement());
      System.out.println("total de retraits est " +cc.totalRetrait());
	}

}
