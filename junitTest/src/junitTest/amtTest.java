package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class amtTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		simpleInterest si = new simpleInterest();
		
		assertEquals(50, si.interest(5000, 1),0.00);
		//fail("Not yet implemented");
	}

}
