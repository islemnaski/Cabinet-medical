import java.util.Scanner;
import java.util.Scanner;
public abstract  class Secretaire  extends Personne implements Inscription{
	 private int num_emplo ;
	 public Secretaire( String nom, String prenom,String cin, int num_emplo) {
		 super(cin,nom,prenom);
		 this.num_emplo = num_emplo;
	 }
	 public String toString() {
			return  super.toString() + "num_emplo:" + num_emplo ;
	
	 }
	 
	 public void  sInscrire() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Entrez votre nom : ");
	        String nom = scanner.nextLine();

	        System.out.println("Entrez votre prénom : ");
	        String prenom = scanner.nextLine();
	        
	        System.out.println("Entrez votre numéro cin : ");
	          String cin = scanner.nextLine();

	        System.out.println("Entrez votre num_emplo : ");
	        int num_emplo = scanner.nextInt();
	     
	     }
	            
	 
	 
	 public  boolean  s_authentifier( string num_emplo ) { 
		  this.num_emplo.equals(num_emplo);
	}
	
	 public abstract void créer_fiche_patient(); 
		
	 
     public abstract void gérer_rendez_vous() ;
    	 
     
}
