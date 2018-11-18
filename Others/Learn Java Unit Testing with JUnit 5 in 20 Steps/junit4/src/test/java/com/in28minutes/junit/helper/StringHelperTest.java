package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper; // we can create object at class level

	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {

		//AACD => CD ACD => CD CDEF => CDEF
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

	}

	@Test
	public void testtestTruncateAInFirst2Positions_BssicinFirstPostion() {

		//AACD => CD ACD => CD CDEF => CDEF
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	//ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse("Tämä on lisä inffoa virheestä", true);
	}

	@Test
	public void testtestTruncateAInFirst2Positions_BasicPositiveScenario() {

		//AACD => CD ACD => CD CDEF => CDEF
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
