package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;

	public Doctor(String empNumber, String empName, String specialty) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty = specialty;
	}

	 public String getSpecialty() {
		return this.specialty;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.receiveHealth(5);
	}

	@Override
	public String paySalary() {
		return "90000";
	}

}
