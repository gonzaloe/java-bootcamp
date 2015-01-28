package tddShoppingCart;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyCartUsingTDD {

	@Test
	public void testProduct() {
		ProductBuilder productBuilder = new Bananas(300,3.5);
		assertEquals(productBuilder.toString(), "Bananas: 	Price per unit-> $3.5 	Available quantity-> 300" );
	}
	
	@Test
	public void testList() {
		ProductBuilder productBuilder = new Bananas(300,3.5);
		assertEquals(productBuilder.toString(), "Bananas: 	Price per unit-> $3.5 	Available quantity-> 300" );
		productBuilder = new Apples(600,2.5);
		assertEquals(productBuilder.toString(), "Apples: 	Price per unit-> $2.5 	Available quantity-> 600" );
	}

}
