package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JUniteEx1 testCase = new JUniteEx1();
		int sq=testCase.square(5);
		assertEquals(25, sq);//excepted,output
	}

}
