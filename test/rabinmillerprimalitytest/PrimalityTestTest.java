/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabinmillerprimalitytest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author efim
 */
public class PrimalityTestTest {
	
	public PrimalityTestTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of main method, of class PrimalityTest.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		PrimalityTest.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of isPrime method, of class PrimalityTest.
	 */
	@Test
	public void testIsPrime() {
		System.out.println("isPrime");
		int number = 200;
		double accuracy = 0.001;
		PrimalityTest instance = new PrimalityTest();
		boolean expResult = false;
		boolean result = instance.isPrime(number, accuracy);
		assertEquals(expResult, result);
		
		number = 189;
		accuracy = 0.01;
		expResult = false;
		result = instance.isPrime(number, accuracy);
		assertEquals(expResult, result);
		
		number = 416;
		accuracy = 0.01;
		expResult = false;
		result = instance.isPrime(number, accuracy);
		assertEquals(expResult, result);	
		
		number = 2;
		accuracy = 0.01;
		expResult = true;
		result = instance.isPrime(number, accuracy);
		assertEquals(expResult, result);
	}


	/**
	 * Test of powerInModule method, of class PrimalityTest.
	 */
	@Test
	public void testPowerInModule() {
		System.out.println("powerInModule");
		int base = 3;
		int power = 5;
		int module = 10000;
		PrimalityTest instance = new PrimalityTest();
		int expResult = 243;
		int result = instance.powerInModule(base, power, module);
		assertEquals(expResult, result);

		base = 3;
		power = 5;
		module = 102;
		expResult = 39;
		result = instance.powerInModule(base, power, module);
		assertEquals(expResult, result);
		
		base = 5;
		power = 17;
		module = 102;
		expResult = 5;
		result = instance.powerInModule(base, power, module);
		assertEquals(expResult, result);
	
	}

	/**
	 * Test of testCountFromAccuracy method, of class PrimalityTest.
	 */
	@Test
	public void testTestCountFromAccuracy() {
		System.out.println("testCountFromAccuracy");
		double accuracy = 0.2;
		PrimalityTest instance = new PrimalityTest();
		int expResult = 2;
		int result = instance.testCountFromAccuracy(accuracy);
		assertEquals(expResult, result);
		
		accuracy = 0.01;
		expResult = 4;
		result = instance.testCountFromAccuracy(accuracy);
		assertEquals(expResult, result);
		
	}

	/**
	 * Test of getRandomBase method, of class PrimalityTest.
	 */
	@Test
	public void testGetRandomBase() {
		System.out.println("getRandomBase");
		int number;
		number = (int) Math.floor(3 + 100 * Math.random());
		PrimalityTest instance = new PrimalityTest();
		
		for (int i = 0; i < 100; i++) {
			int result = instance.getRandomBase(number);
			assertTrue(result >= 2 && result <= number - 1);
		}
	}

	/**
	 * Test of RabinMillerPrimalityTest method, of class PrimalityTest.
	 */
	@Test
	public void testRabinMillerPrimalityTest() {
		System.out.println("RabinMillerPrimalityTest");
		int number = 101;
		double accuracy = 0.0001;
		PrimalityTest instance = new PrimalityTest();
		boolean expResult = true;
		boolean result = instance.RabinMillerPrimalityTest(number, accuracy);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of multiplicationInModule method, of class PrimalityTest.
	 */
	@Test
	public void testMultiplicationInModule() {
		System.out.println("multiplicationInModule");
		int left = 14;
		int right = 13;
		int module = 10000;
		PrimalityTest instance = new PrimalityTest();
		int expResult = 14*13;
		int result = instance.multiplicationInModule(left, right, module);
		assertEquals(expResult, result);

		left = 28;
		right = 0;
		module = 10000;
		expResult = 0;
		result = instance.multiplicationInModule(left, right, module);
		assertEquals(expResult, result);
		
		left = 67;
		right = 88;
		module = 23;
		expResult = 8;
		result = instance.multiplicationInModule(left, right, module);
		assertEquals(expResult, result);

		left = 46099;
		right = 46099;
		module = 214;
		expResult = 3;
		result = instance.multiplicationInModule(left, right, module);
		assertEquals(expResult, result);
		
		left = 53327;
		right = 53327;
		module = 214;
		expResult = 183;
		result = instance.multiplicationInModule(left, right, module);
		assertEquals(expResult, result);
	}
	
}
