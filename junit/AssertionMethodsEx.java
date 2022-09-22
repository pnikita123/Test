package junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionMethodsEx {
	@Test
	public void testAssertions() {
		String str1= new String("Raj");
		String str2= new String("Raj");
		String str3="Welcome";
		String str4="Welcome";
		String str5=null;
		
		int a=10;
		int b=10;
		//checks that 2 object
		assertEquals(str1, str2);
		
		//check that condition is true
		assertTrue(a>b);
		
		//check that condition is true
		assertTrue(a==b);
		
		//check that 2 obj references point to the same object
		assertSame(str3, str4);
		
		//check that 2 obj references not point to the same object
		assertNotSame(str1, str4);
		
		//check that obj is null
		assertNull(str5);
		
		//check that obj is not null
		assertNotNull(str4);
		
		String a1[]= {"one","two","three"};
		String a2[]= {"one","two","three"};
		
		//check that 2 array are equal or not
		assertArrayEquals(a1, a2);
		
	}

}












