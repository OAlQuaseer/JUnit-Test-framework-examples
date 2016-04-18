package com.oalquaseer.junit;

import junit.framework.TestCase;

/**
 * Unit test for Fixture feature in JUnit test framework.
 */
public class Fixtures extends TestCase {
	
	protected Integer value1, value2;
	
	// this method runs before every method invocation.
	protected void setUp(){
		value1 = 3;
		value2 = 3;
	}
	
	// test method to test adding two values
	public void testAdd (){
		
		assertTrue(value1+value2 == 6);
		
		
	}
}
