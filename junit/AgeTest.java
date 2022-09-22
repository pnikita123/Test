package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {

	@Test
	public void testCorrectAge() {
		CheckAge age=new CheckAge();
		age.setNo(18);
		assertTrue(age.checkAge());
				
	}
	@Test
	public void testWrongAge() {
		CheckAge age=new CheckAge();
		age.setNo(15);
		assertFalse(age.checkAge());
				
	}
	

}
