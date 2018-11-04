package com.in28minutes.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Bat");
		list.add("Cat");
		list.add("Dog");

		printWithFPWithFiltering(list);
	}

	private static void printBasic(List<String> list) { //Normally we would do printing
		for (String string : list) {
			System.out.println(string);

		}
	}

	private static void printBasicWithFiltering(List<String> list) { //Normally we would do printing

		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);

			}

		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
		//We are converting list to stream
		//For every element call sout

		//Functional programming - we can pass functions to methods
	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));

	}

}
