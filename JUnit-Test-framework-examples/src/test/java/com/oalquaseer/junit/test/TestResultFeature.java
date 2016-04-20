package com.oalquaseer.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestResultFeature extends TestResult {

	// add the error
	public synchronized void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}

	// add the failure
	public synchronized void addFailure(Test test, AssertionFailedError t) {
		super.addFailure((junit.framework.Test) test, t);
	}

	@Test
	public void testAdd() {
		int x = 6;
		// add any test
		assertTrue(6 == x);
		assertFalse(6 == x);
	}

	// Marks that the test run should stop.
	public synchronized void stop() {
		// stop the test here
	}

}
