package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class JanitorTest {

	Janitor underTest = new Janitor("1", "name", true);
	
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
	public void shouldBeSweeping() {
		// Act
		boolean result = underTest.getIsSweeping();
		// Assert
		assertTrue(result);
	}
	
	@Test
	public void shouldGetPaid40K() {
		// Act
		String result = underTest.paySalary();
		// Assert
		assertEquals("40000", result);
	}

}
