public class Fiche_patient {
	private int num_fiche;
	private Patient patient;
	private Date datecrea;
	 public Fiche_patient(int num_fiche, Patient patient, Date datecrea ) {
		 this.num_fiche = num_fiche;
		 this.patient = patient;
		 this.datecrea = datecrea;
	 }
	 public string toString() {
		 return "num_fiche :" + num_fiche + "le patient est :"+ patient +"datecrea :"+ datecrea
	 }
	 public int getNum_fiche() {
			return num_fiche;
		}

		public void setNum_fiche(int num_fiche) {
			this.num_fiche = num_fiche;
		}

		public Patient getPatient() {
			return patient;
		}

		public void setPatient(String patient) {
			this.patient = patient;
		}

		
		public Date getDatecrea() {
			return datecrea;
		}

		public void setDatecrea(Date datecrea) {
			this.datecrea = datecrea;
		}
		

}
