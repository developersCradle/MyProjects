package com.in28minutes.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathTest {

	//Write test for Math.min() and Math.max() methods
	@Test
	void test() {
		int actualMin = Math.min(2, 2);
		int expectedMin = 2;

		assertEquals(actualMin, expectedMin);

		int actualMax = Math.max(3, 2);
		int expectedMax = 3;

		assertEquals(actualMax, expectedMax);
	}

}
