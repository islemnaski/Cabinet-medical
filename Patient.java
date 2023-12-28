public class Patient extends Personne {
	private int num_patient;
	private  String numtel;
	
	public Patient(String cin, String nom, String prenom, int num_patient, String numtel) {
		super(cin,nom,prenom);
		this.num_patient = num_patient;
		this.numtel = numtel;
	   }
	public String toString() {
		return  super.toString() + "num_patient:" + num_patient + "numtel :" + numtel ;
       }
	public int getNum_patient() {
		return num_patient;
	   }

	public void setNum_patient(int num_patient) {
		this.num_patient = num_patient;
	   }
     
	public String getNumtel() {
		return numtel;
	}

	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}
	
	
 
}
