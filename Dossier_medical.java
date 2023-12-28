public class Dossier_medical {
  private int num_doss , num_patient;
  public Dossier_medical(int num_doss, int num_patient) {
	  this.num_doss = num_doss;
	  this.num_patient = num_patient;
  }
  public string toString() {
	  return "num_doss :" + num_doss +"num_patient :" + num_patient ;
  }
  public int getNum_doss() {
		return num_doss;
	}

	public void setNum_doss(int  num_doss) {
		this.num_doss = num_doss;
	}

	public int getNum_patient() {
		return num_patient;
	}

	public void setNum_patient(int num_patient) {
		this.num_patient = num_patient;
	}
  
}
