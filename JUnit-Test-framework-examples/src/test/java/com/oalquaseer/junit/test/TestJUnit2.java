package com.oalquaseer.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oalquaseer.junit.MessageUtil;

public class TestJUnit2 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
