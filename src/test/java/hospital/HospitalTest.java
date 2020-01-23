package hospital;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

	Hospital hospital = new Hospital();

	@Test
	public void shouldBeAbleToAddEmployee() {
		// Arrange
		Doctor doctor = new Doctor("", "", "");
		// Act
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();
		assertTrue(check.contains(doctor));
	}
	
	@Test
	public void shouldBeAbleToAdd2DifferentEmployees() {
		// Arrange
		Doctor doctor = new Doctor("1", "", "");
		Nurse nurse = new Nurse("2", "", 0);
		Receptionist receptionist = new Receptionist("3", "", true);
		// Act
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		Collection<Employee> check = hospital.getAllEmployees();
		assertTrue(check.contains(doctor));
		assertTrue(check.contains(nurse));
	}
	
	

}
