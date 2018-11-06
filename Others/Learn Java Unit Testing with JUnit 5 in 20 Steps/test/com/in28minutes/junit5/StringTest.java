package com.in28minutes.junit5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Initializing connection to database");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("closing connection to database");
	}

	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("This is run beginning of test" + info.getDisplayName());

	}

	@AfterEach
	void afterEach() {
		System.out.println("cleaning data");
	}

//Test annotation specifies this method as test
	@Test
	void length_basic() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;

		assertEquals(expectedLength, actualLength);
		//Write test code
		//Invoke method square(4) => CUT
		//Checks in place - 16 => Assertions
	}

	@Test
	void toUpperCase_basic() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertNotNull(result);
		//assertNull(result);

		assertEquals("ABCD", result);

	}

	@Test
	void contains_basic() {
		assertFalse("abcdefgh".contains("ijk")); //test if something is true
	}

	@Test
	void split_basic() {
		String str = "abc def ghi";
		String actualResult[] = str.split(" ");
		String[] expectedResult = new String[] { "abc", "def", "ghi" };

		assertArrayEquals(expectedResult, actualResult);
	}

	@Test
	@DisplayName("When string is null, throw an exception") //IN Junit 5
	void length_exception() {

		String str = null;
		assertThrows(NullPointerException.class, () -> {
			str.length();
		});

	}

	@Test
	void lenght_greater_than_zero() {
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("A".length() > 0);
		assertTrue("DEF".length() > 0);
	}

	@ParameterizedTest
	@ValueSource(strings = { "ABCD", "ABC", "A", "DEF" })
	void lenght_greater_than_zero_using_parameterized_test(String str) {
		assertTrue(str.length() > 0);

	}

}
