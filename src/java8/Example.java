package java8;

import java.util.*;
import java.util.stream.*;

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

		Map<Integer, String> result = hmap.entrySet().stream().filter(map -> "Orange".equals(map.getValue()))
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		System.out.println("Result: " + result);

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };

		removeDup(arr);

		int num = 100;
		System.out.print("primes : ");
		for (int i = 2; i <= num; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static int[] removeDup(int arr[]) {

		Set<Integer> mySet = Arrays.stream(arr).boxed().collect(Collectors.toSet());

		int length = mySet.size();

		arr = new int[length];

		int p = 0;
		for (Integer set : mySet) {
			arr[p] = set;
			p++;
		}
		return arr;
	}

	public static boolean isPrime(int num) {
		return IntStream.rangeClosed(2, num / 2).noneMatch(i -> num % i == 0);
	}
}
