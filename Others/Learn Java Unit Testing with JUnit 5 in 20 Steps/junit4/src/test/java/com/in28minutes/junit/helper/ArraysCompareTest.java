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

	//exception testing
	@Test(expected = NullPointerException.class)
	public void testArraysSort_NullArray() {
		int[] numbers = {};
		Arrays.sort(numbers);

	}

	//performance test
	@Test(timeout = 1000) //ms
	public void testSort_Perfomance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i < 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
