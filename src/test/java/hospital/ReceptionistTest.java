package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceptionistTest {
	
	Receptionist underTest = new Receptionist("1","name",true);

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
	public void shouldBeOnPhone() {
		// Act
		boolean result = underTest.getOnPhone();
		// Assert
		assertTrue(result);
	}
	
	@Test
	public void shouldGetPaid45K() {
		// Act
		String result = underTest.paySalary();
		// Assert
		assertEquals("45000", result);
	}

}
