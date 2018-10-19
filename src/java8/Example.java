package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		
		List<Integer> primes = new ArrayList<>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(7);
		primes.add(11);
		
		System.out.println("primes: " + primes);
		
		Set<Integer> primeswithoutdup = new LinkedHashSet<>(primes);
		
		primes.clear();
		
		primes.addAll(primeswithoutdup);
		
		System.out.println("primes: " + primes);
		
		TreeMap<Integer, String> hmap = new TreeMap<>();
		
		
		
		hmap.put(11, "Apple");
		hmap.put(22, "Orange");
		hmap.put(33, "Kiwi");
		hmap.put(44, "Banana");

		Map<Integer, String> result = hmap.entrySet().stream().filter(map -> "Orange".equals(map.getValue())).collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		System.out.println("Result: " + result);
	}
}
