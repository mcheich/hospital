package hospital;

public class Receptionist extends Employee {

	private boolean onPhone = true;

	public Receptionist(String empNumber, String empName, boolean onPhone) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.onPhone = onPhone;
	}

	@Override
	public String paySalary() {
		return "45000";
	}

	public boolean getOnPhone() {
		return this.onPhone ;
	}

}
