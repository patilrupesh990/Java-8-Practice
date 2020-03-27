package com.bridgelabz.java8.infiniteloop;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfinitreloopExample {
	static Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);
	static Supplier<UUID> randomUUIDSupplier = UUID::randomUUID;
	static Stream<UUID> infiniteStreamOfRandomUUID = Stream.generate(randomUUIDSupplier);

	public static void main(String[] args) {
		List<Integer> collect = infiniteStream.limit(10).collect(Collectors.toList());
		List<UUID> randomInts = infiniteStreamOfRandomUUID.skip(10).limit(10).collect(Collectors.toList());
		//Stream of All +2 values Infinite Stream with limit 10
		collect.forEach(System.out::println);
		// Stream Of Random UUID with limit 10
		randomInts.forEach(System.out::println);
		// While Loop Using Infinite Stream Api

		Stream<Integer> integers = Stream.iterate(0, i -> i + 1);
		integers.limit(10).forEach(System.out::println);
	}
}
