package designepatterns;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci8 {

	public static List<Integer> generate(int series) {
		return Stream.iterate(new int[] { 0, 1 }, s -> new int[] { s[1], s[0] + s[1] })
				.limit(series).map(n -> n[0])
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(Fibonacci8.generate(10));
	}

}
