package designepatterns;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
	

    /**
     * Java 8 / Lambda approach to generate fibonacci series.
     * Fibonacci always start as classic (e.g. 0, 1, 1, 2, 3, 5)
     * @param series Number of how many fibonacci number should be generated
     * @return List holding resulting fibonacci number.
     */
    public static List<Integer> generate(int series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
    	
    	int[] i = new int[]{0, 1};
    	
    	System.out.println("new int[]{0, 1}  + "+ i.length);
        System.out.println(Fibonacci.generate(10)); // Test the code.
    }

}
