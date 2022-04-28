package com.lit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import com.lti.demo.Calculator;

class TestCalculator {

	Calculator c=new Calculator();
	@Test
	public void testHello()
	{
		Assertions.assertEquals("Happy morning", c.sayHello());
	}
	@Disabled
	@Test
	public void testAddition() {
		Assertions.assertEquals(500,c.addNos(300,200));
	}
	@Test
	public void testSubraction() {
		Assertions.assertEquals(200,c.subNos(300, 100),"code is not working....");
	}
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	al.add(100);
	al.add(200);
	Assertions.assertEquals(0, al.size());
	// assertFalse(al.isEmpty());
	}
}
