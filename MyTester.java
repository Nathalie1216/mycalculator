import static org.junit.Assert.*;
import org.junit.Test;


public class MyTester {
	
	static MyCalculator mc = new MyCalculator();
	@Test
	public void testNfactorial() {
		//fail("Not yet implemented");
		//declaration of variable to receive the factored answer
		int actual = mc.nfactorial(0);
		//checks if factored answer is equal to expected answer
		assertEquals("1", 1, actual, 0.0);
	}


	@Test
	public void testBinarySearch() {
		//fail("Not yet implemented");
		//array declaration
		int[] a = {4,5,3,6};
		//declaration of variable to receive the index of answer
		int actual = mc.binarySearch(a, 13);
		//checks if value of actual is equal to expected answer
		//zero indexing in array
		//returns -1 if digit is not found in array
		assertEquals("0",-1,actual,0.0);
	}

}
