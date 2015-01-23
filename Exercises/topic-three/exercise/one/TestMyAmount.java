package exercise.one;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyAmount {

	@Test
	public void testAmount() {
		AmountConverter amountConverter = new AmountConverter(22.5);
		assertEquals(amountConverter.convert(), " twenty - two");
		assertEquals(amountConverter.getDecimals(), " and 50/100 dollars");
	}
	
	@Test
	public void testAmount2() {
		AmountConverter amountConverter = new AmountConverter(18552.25);
		assertEquals(amountConverter.convert(), " eighteen thousand five hundred fifty - two");
		assertEquals(amountConverter.getDecimals(), " and 25/100 dollars");
	}
	
	@Test
	public void testAmount3() {
		AmountConverter amountConverter = new AmountConverter(9536814.47);
		assertEquals(amountConverter.convert(), " nine million five hundred thirty - six thousand eight hundred fourteen");
		assertEquals(amountConverter.getDecimals(), " and 47/100 dollars");
	}
}
