package com.mukul.jdk9.streams;

import java.util.stream.Stream;

public class StreamAPIEnhancements {

	public static void main(String args[]) {
		offNullableExample();
		System.out.print("---------------------------");
		dropWhileExample();
	}

	
	private static void dropWhileExample() {
		Stream.of("apple", "banana", "cat", "", "elephant","","Dog","","","lichi")
		.dropWhile(s->!s.isEmpty()).forEach(System.out::println);
	}
	
	private static void offNullableExample() {
		System.out.print("Count of Not-nullable: ");
		int count = (int) Stream.ofNullable(5000).count();
		System.out.println(count);
		System.out.print("Count of Nullable: ");
		count = (int) Stream.ofNullable(null).count();
		System.out.println(count);

		String str = null;
		Stream.ofNullable(str).forEach(System.out::println); // prints nothing in the console
		str = "StreamAPI Improvement";
		Stream.ofNullable(str).forEach(System.out::println); // prints StreamAPI Improvement
	}
}
