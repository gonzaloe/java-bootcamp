package exercise.four;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyDecimal {

	@Test
	public void testRoman() {
		Decimal decimal = new Decimal(2000);
		assertEquals(decimal.convertToRoman(),"MM");
	}
	
	@Test
	public void testRoman3() {
		Decimal roman = new Decimal(109);
		assertEquals(roman.convertToRoman(),"CIX");
	}
	
	@Test
	public void testRoman2() {
		Decimal roman = new Decimal(1504);
		assertEquals(roman.convertToRoman(),"MDIV");
	}

}
