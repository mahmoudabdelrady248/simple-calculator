import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class add {

	@Test
	void test() {
		SimpleCalculator input=new SimpleCalculator();
		assertEquals(9, input.add(4, 5));
		assertEquals(1, input.add(-4, 5));
		assertEquals(-1, input.add(4, -5));
		assertEquals(5, input.add(5, 0));
	}

}
