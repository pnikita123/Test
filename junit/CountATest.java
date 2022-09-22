package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JUniteEx1 test1=new JUniteEx1();
		int c=test1.countA("Nikita");
		assertEquals(2,c);
	}

}
