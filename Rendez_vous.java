public class Rendez_vous {
  private Date date_rendez_vous ;
   private int num_patient;
   public Rendez_vous( Date date_rendez_vous,int num_patient ) {
	   this.date_rendez_vous = date_rendez_vous ;
	   this. num_patient =  num_patient;
   }
   public string toString() {
	   return "date_rendez_vous"+ date_rendez_vous +"num_patient" + num_patient;
   }
   public Date getDate_rendez_vous() {
		return date_rendez_vous;
	}

	public void setDate_rendez_vous(Date date_rendez_vous) {
		this.date_rendez_vous = date_rendez_vous;
	}

	public int getNum_patient() {
		return num_patient;
	}

	public void setNom(int num_patient) {
		this.num_patient = num_patient;
	}
}
