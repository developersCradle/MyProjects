package com.in28minutes.junit5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {

	private String str;

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
	@RepeatedTest(10)
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

	@ParameterizedTest
	@CsvSource(value = { "abcd, ABCD", "abc, ABC", "'',''", "abcdefg,ABCDEFG" }) //In Csv emptyvalues are treated as null
	void uppercase(String word, String capitalizeWord) { //We need to make sure to check parameters
		assertEquals(capitalizeWord, word.toUpperCase());

	}

	@ParameterizedTest(name = "{0} lenght is {1}") // Giving name for each test
	@CsvSource(value = { "ABCD,4", "ABC,3", "A,1", "DEF,3" }) //In Csv empty values are treated as null
	void lenght_greater_than_zero_using_parameterized_test(String wordToTest, int expectedLenght) { //We need to make sure to check parameters
		assertTrue(wordToTest.length() >= expectedLenght);

	}

	@Test
	void perfomanceTest() {
		assertTimeout(Duration.ofSeconds(5), () -> {
			for (int i = 0; i < 1000000; i++) {
				int j = i;
				System.out.println(j);
			}
		});
	}

	@Nested
	class EmptyStringTest {
		@BeforeEach
		void setToEmpty() {
			str = "";
		}

		@Test
		void lenghtIsZero() {
			assertEquals(0, str.length());
		}
	}

}
