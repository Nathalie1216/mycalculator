import static org.junit.Assert.*;

import org.junit.Test;


public class MyCalculatorTest {

	@Test
	public void test() {
		MyCalculator mc = new MyCalculator();
		float actual =  mc.add(10,2);
		assertEquals("10+2=12", 12, actual, 0.0);
	}

}
