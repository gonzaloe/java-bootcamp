package exercise.four;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyRoman {

	@Test
	public void testRoman() {
		Roman roman = new Roman("MM");
		assertEquals(roman.convertToDecimal(),2000);
	}
	
	@Test
	public void testRoman3() {
		Roman roman = new Roman("CIX");
		assertEquals(roman.convertToDecimal(),109);
	}
	
	@Test
	public void testRoman2() {
		Roman roman = new Roman("MDIV");
		assertEquals(roman.convertToDecimal(),1504);
	}

}
