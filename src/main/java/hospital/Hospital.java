package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<String, Employee>();
	
	public void addEmployee(Employee employee) {
		employees.put(employee.empNumber, employee);
	}

	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}
	
	public void showPayRate() {
		for(Employee employee : employees.values()) {
			System.out.println(employee.empName + " " + employee.paySalary());
		}
	}
	
	public void showAllMedicalPersonnel() {
		for(Employee employee : employees.values()) {
			if(employee instanceof MedicalDuties) {
				System.out.println(employee.toString());
			}
		}
	}

}
