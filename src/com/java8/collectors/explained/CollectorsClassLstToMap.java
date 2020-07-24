package com.java8.collectors.explained;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsClassLstToMap {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("vamshi","neela","krishna");
		Map<String, Long> mapNames   = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Converted List to Map "+mapNames);
	}

}
