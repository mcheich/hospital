package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		Doctor doctor = new Doctor("1", "Emily", "Famili Practice");
		Surgeon surgeon = new Surgeon("2", "Brad", "Brain", true);
		Nurse nurse = new Nurse("3", "Debbie", 3);
		
		hospital.addEmployee(doctor);
		hospital.addEmployee(surgeon);
		hospital.addEmployee(nurse);
		
		hospital.showPayRate();
		hospital.showAllMedicalPersonnel();
	}

}
