package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	static public void beforeClass() { //Before class should static
		System.out.println("Before Class");
	}

	@Before //Before is executing before every test
	public void setup() {
		System.out.println("Before Test");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed"); // Should not use these -> logging preferred
	}

	@Test
	public void test2() {
		System.out.println("test2 executed"); // Should not use these -> logging preferred
	}

	@After
	public void teardown() {
		System.out.println("Afer test ");
	}

	@AfterClass
	static public void afterClass() { //Before class should static
		System.out.println("After Class");
	}
}
