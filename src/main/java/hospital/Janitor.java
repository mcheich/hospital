package hospital;

public class Janitor extends Employee {

	private boolean isSweeping = true;

	public Janitor(String empNumber, String empName, boolean isSweeping) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isSweeping = isSweeping;
	}

	@Override
	public String paySalary() {
		return "40000";
	}

	public boolean getIsSweeping() {
		return this.isSweeping;
	}

}
