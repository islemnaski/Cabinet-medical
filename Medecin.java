import java.util.Scanner;
public  abstract class Medecin extends Personne implements Inscription  {
	 
 
	private int id_med ;

	public Medecin(String cin, String nom, String prenom, int id_med) {
		{	
			super(cin,nom,prenom);
		    this.id_med = id_med;
		   
		 }
		
	public String toString() {
		return  super.toString() + "id_med: "+ id_med ;
	     }
	
	
	  public void  sInscrire() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Entrez votre nom : ");
	        String nom = scanner.nextLine();

	        System.out.println("Entrez votre prénom : ");
	        String prenom = scanner.nextLine();
	        
	        System.out.println("Entrez votre numéro cin : ");
	          String cin = scanner.nextLine();

	        System.out.println("Entrez votre id : ");
	        int id = scanner.nextInt();
	     
	     }
	            
	          public  boolean  s_authentifier(int id_med) { 
	    		  this.id_med.equals(id_med);
	    	     }
	           
	        
	        
	        
	        
	        
	public abstract void Gérer_dossier(); 
		
	

			  

}



