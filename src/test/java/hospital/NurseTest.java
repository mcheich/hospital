package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class NurseTest {

	// Arrange
	Nurse underTest = new Nurse("1","name", 1);
	Patient patient = new Patient();
	
	@Test
	public void shouldBeABleToDrawBlood() {
		// Act
		int beforeBloodDraw = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int afterBloodDraw = patient.getBloodLevel();

		// Assert
		assertEquals(5, beforeBloodDraw-afterBloodDraw);
	}
	
	@Test
	public void shouldBeAbleToIncreaseHealthWithCare() {
		// Arrange
		Patient patient = new Patient();

		// Act
		int beforeCare = patient.getHealthLevel();
		underTest.careForPatient(patient);
		int afterCare = patient.getHealthLevel();
		
		// Assert
		assertEquals(3, afterCare - beforeCare );
	}
 
	@Test
	public void shouldReturnEmpNumber() {
		// Act
		String result = underTest.getEmpNumber();
		// Assert
		assertEquals("1", result);
	}
	
	@Test
	public void shouldReturnEmpName() {
		// Act
		String result = underTest.getEmpName();
		// Assert
		assertEquals("name", result);
	}
	
	@Test
	public void shouldReturnNumPatient() {
		// Act
		int result = underTest.getNumPatients();
		// Assert
		assertEquals(1, result);
	}
	
	@Test
	public void shouldGetPaid50K() {
		// Act
		String result = underTest.paySalary();
		// Assert
		assertEquals("50000", result);
	}


}
