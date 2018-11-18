package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	//Arrays.sort

	@Test
	public void testArraysSort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };

		Arrays.sort(numbers);

		//assertEquals(expected, numbers);//testing difference in objects
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraysSort_NullArray() {
		int[] numbers = {};
		Arrays.sort(numbers);

	}
}
