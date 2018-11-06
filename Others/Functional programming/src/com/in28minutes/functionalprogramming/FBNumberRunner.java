package com.in28minutes.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FBNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(13);
		numbers.add(3);
		numbers.add(15);

		//numbers.stream().forEach(element -> System.out.println(element));

		//Exercise 1
		IntStream.range(1, 11).mapToObj(e -> e * e).forEach(p -> System.out.println(p));

		/*
		int sum = numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
		int sum2 = fpSum(numbers);
		
		//int sum = normalSum(numbers);
		System.out.println(sum);
		System.out.println("Sum of odd numbers: " + sum2);
		
		*/
	}

	private static int fpSum(List<Integer> numbers) { //Compare these two same methods
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer integer : numbers) {
			sum += integer; //Mutations in procedural programming
		}
		System.out.println(sum);
		return sum;
	}

}
