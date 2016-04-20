package com.oalquaseer.junit.test;

import junit.framework.*;

public class JUnitTestSuite {
   public static void main(String[] a) {
      // add the test's in the suite
      TestSuite suite = new TestSuite(TestJUnit1.class, TestJUnit2.class, Fixtures.class);
      TestResult result = new TestResult();
      suite.run(result);
      System.out.println("Number of test cases = " + result.runCount());
    }
}
