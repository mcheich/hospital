package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	// Arrange
	Doctor underTest = new Doctor("1", "name", "specialty");

	// Test on state verification (variables)
	@Test
	public void shouldBeABleToDrawBlood() {
		// Arrange
		Patient patient = new Patient();

		// Act
		int beforeBloodDraw = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int afterBloodDraw = patient.getBloodLevel();

		// Assert
		assertEquals(5, beforeBloodDraw - afterBloodDraw);
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
		assertEquals(5, afterCare - beforeCare);
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
	public void shouldReturnEmpSpecialty() {
		// Act
		String result = underTest.getSpecialty();
		// Assert
		assertEquals("specialty", result);
	}

	@Test
	public void shouldGetPaid90K() {
		// Act
		String result = underTest.paySalary();
		// Assert
		assertEquals("90000", result);
	}
}
