package exercise.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyWrap {
	
	@Test
	public void testWrap() {
		Wrapping wrapping = new Wrapping("This is a chain with 30 charac",60);
		wrapping.setString();
		ExpectedOutput expectedOutput = new ExpectedOutput(1);
		assertEquals(wrapping.getList().toString(), expectedOutput.getList().toString());		
	}	
	
	@Test
	public void testWrap2() {
		Wrapping wrapping = new Wrapping("Hello World!",7);
		wrapping.setString();
		ExpectedOutput expectedOutput = new ExpectedOutput(2);
		assertEquals(wrapping.getList().toString(), expectedOutput.getList().toString());	
	}
	
	@Test
	public void testWrap3() {
		Wrapping wrapping = new Wrapping("a b c d e f",3);
		wrapping.setString();
		ExpectedOutput expectedOutput = new ExpectedOutput(3);
		assertEquals(wrapping.getList().toString(), expectedOutput.getList().toString());	
	}
	
	@Test
	public void testWrap4() {
		Wrapping wrapping = new Wrapping("Excelent",5);
		wrapping.setString();
		ExpectedOutput expectedOutput = new ExpectedOutput(4);
		assertEquals(wrapping.getList().toString(), expectedOutput.getList().toString());	
	}
}
