package com.bharath.maven.calculator.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorImplTest {

	@Test
	public void addShouldReturnAResult() {
		CalculatorImpl c = new CalculatorImpl();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

}
