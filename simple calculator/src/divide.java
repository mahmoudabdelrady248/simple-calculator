import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divide {

	

	private static final Float Error = null;

	@Test
	void test() {
		SimpleCalculator input=new SimpleCalculator();
		
		try {
			assertEquals(0.8f, input.divide(4, 5));
			assertEquals(1.25, input.divide(5, 4));
			assertEquals(1, input.divide(5, 5));
			assertEquals(-0.8f, input.divide(-4, 5));
			assertEquals(-1.25, input.divide(-5, 4));
			assertEquals(-1, input.divide(-5, 5));
			assertEquals("ArithmeticException", input.divide(5, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
	}

}
