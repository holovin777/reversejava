package com.holovin.reversejava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {
	
	@Test
	void testHelloWorld() {

		assertEquals(",olleH !dlrow", Reverse.reverse("Hello, world!"));

	}

	@Test
	void testEmptyString() {

		assertEquals("", Reverse.reverse(""));

	}

	@Test
	void testOneSymbol() {

		assertEquals("!", Reverse.reverse("!"));

	}

	@Test
	void testTwoWordsOneSymbol() {

		assertEquals("!#", Reverse.reverse("#!"));

	}

	@Test
	void testStringWithSpaces() {

		assertEquals(",olleH !dlrow sihT si ym tsrif tinuj .tset", Reverse.reverse("Hello, world! This is my first junit test."));

	}

}