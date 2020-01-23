package hospital;

public abstract class Employee {

	protected String empNumber;
	protected String empName;

	public String getEmpNumber() {
		return this.empNumber;
	}
	
	@Override
	public String toString() {
		return "Employee:" + empNumber + " " + empName;
	}

	public String getEmpName() {
		return this.empName;
	}

	public abstract String paySalary();

}