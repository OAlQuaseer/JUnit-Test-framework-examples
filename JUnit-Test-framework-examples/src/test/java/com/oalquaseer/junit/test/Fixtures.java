package com.oalquaseer.junit.test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for Fixture feature in JUnit test framework.
 */
public class Fixtures extends TestCase {

	protected Integer value1, value2;

	// this method runs before every method invocation.
	@Before
	protected void setUp() {
		value1 = 3;
		value2 = 3;
	}

	// test method to test adding two values
	public void testAdd() {

		assertTrue(value1 + value2 == 6);

		// test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";

		// check for equality
		assertEquals("Junit is working fine", str);

		// check for false condition
		assertFalse(num > 6);

		// check for not null value
		assertNotNull(str);

		// check for null values
		assertNull(temp);

		// check for true condition
		assertTrue(num == 5);

	}

	@Test
	public void testTestCaseClassMethods() {

		// count the number of test cases
		System.out.println("No of Test Case = " + this.countTestCases());

		// test getName
		System.err.println(this.getName());
		this.setName("Testing the Fixture feature and TestCase class methods");
		System.err.println(this.getName());

	}

	// tearDown used to close the connection or clean up activities
	public void tearDown() {
	}

}
