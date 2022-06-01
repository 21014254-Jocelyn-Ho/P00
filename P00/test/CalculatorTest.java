import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a, b, c;
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
	}

	@Test
	public void testAdd() {
		// fail("Not yet implemented");
		int a = 1234;
		int b = 8765;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 9999;
		assertEquals(expected, actual);
	}

	@Test
	public final void testSubtract() {// highlight this method then only run this method
		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public final void testmultiply() {
		int a = 23;
		int b = 54;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		int expected = 1242;
		assertEquals(expected, actual);
	}

	@Test
	public final void testdivide() {
		int a = 0;
		int b = 1;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 0;
		assertEquals(expected,actual);
	}

	@Test
	public void testDivideWithNon0Denominator() {
		// fail("Not yet implemented")
		int actual = cal.divide(a, b);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testDivideWith0Denominator() {
		//fail("Not yet implemented")
		try {
			cal.divide(a, c);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported",e.getMessage());
		}catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown.", t.getMessage());
		}
		}

	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
