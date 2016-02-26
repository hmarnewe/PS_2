package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Code executed before the first test method
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Code executed after the last test method
	}

	@Before
	public void setUp() throws Exception {
		//Code executed before each test
	}

	@After
	public void tearDown() throws Exception {
		//Code executed after each test
	}

	@Test
	public void testEven() {
		//Code that tests isEven(int) 
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(7));
		
		//Test for isEven()
		int iIntegerTestValue = 2;
		MyInteger i = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = i.isEven();
		assertEquals("testIsEven() failed",bExpectedresult,bActualResult);

		//Test for isEven(MyInteger)
		MyInteger j = new MyInteger(4);
		assertTrue(MyInteger.isEven(j));
		
	}
	
	@Test
	public void testOdd() {
		//Code that tests isOdd(int)
		assertTrue(MyInteger.isOdd(7));
		assertFalse(MyInteger.isOdd(4));
		
		//Test for non-static isOdd()
		int iIntegerTestValue = 3;
		MyInteger i = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = i.isOdd();
		assertEquals("testIsOdd() failed",bExpectedresult,bActualResult);
		
		//Test for isOdd(MyInteger)
		MyInteger j = new MyInteger(1);
		assertTrue(MyInteger.isOdd(j));
	}
	
	@Test
	public void testPrime() {
		//Code that tests isPrime(int)
		assertTrue(MyInteger.isPrime(29));
		assertFalse(MyInteger.isPrime(1));
		assertFalse(MyInteger.isPrime(4));
		
		//Test for non-static isPrime()
		int iIntegerTestValue = 7;
		MyInteger i = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = i.isPrime();
		assertEquals("testIsPrime() failed",bExpectedresult,bActualResult);
		
		//Test for isPrime(MyInteger)
		MyInteger j = new MyInteger(29);
		assertTrue(MyInteger.isPrime(j));
	}
	
	@Test
	public void testEqual() {
		//Code that tests equals(int)
		MyInteger j = new MyInteger(4);
		assertTrue(j.equals(4));
		assertFalse(j.equals(3));
		
		//Code that tests equals(MyInteger n)
		assertTrue(j.equals(j));
	}
}