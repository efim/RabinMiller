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
		int number = 0;
		double accuracy = 0.0;
		PrimalityTest instance = new PrimalityTest();
		boolean expResult = false;
		boolean result = instance.isPrime(number, accuracy);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of RabinMillerPrimalityTest method, of class PrimalityTest.
	 */
	@Test
	public void testRabinMillerPrimalityTest() {
		System.out.println("RabinMillerPrimalityTest");
		int number = 0;
		double accuracy = 0.0;
		PrimalityTest instance = new PrimalityTest();
		boolean expResult = false;
		boolean result = instance.RabinMillerPrimalityTest(number, accuracy);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
