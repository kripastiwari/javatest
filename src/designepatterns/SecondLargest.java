package designepatterns;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		Arrays.stream(new int[]{4,5,2,7,3}).sorted().limit(4).skip(3).forEach(System.out::println);

	}

}
