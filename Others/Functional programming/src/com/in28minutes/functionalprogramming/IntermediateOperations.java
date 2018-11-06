package com.in28minutes.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperations {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(13);
		numbers.add(13);
		numbers.add(15);

		numbers.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println("-----------------------------------------");

		numbers.stream().distinct().sorted().forEach(e -> System.out.println(e));

		System.out.println("-----------------------------------------");

		numbers.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e));
		//We are squaring every distinct element
	}

}
