package designepatterns;

import java.util.stream.Stream;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		Stream<Long> tenNaturalNumbers = Stream.iterate(1L, n  ->  n  + 1)
		        .limit(20);

		    tenNaturalNumbers.forEach(System.out::println);
	}

}
