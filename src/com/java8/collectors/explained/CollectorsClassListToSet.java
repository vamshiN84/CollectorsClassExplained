package com.java8.collectors.explained;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClassListToSet {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("vamshi","neela","krishna","vamshi");
		Set<String> setNames = names.stream().collect(Collectors.toSet());
		System.out.println("Converted List to Map "+setNames);
	}
}
