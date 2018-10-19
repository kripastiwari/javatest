package designepatterns;

import java.util.Scanner;
import java.util.stream.Stream;

public class MyFibonacci {

	public static void main(String args[]) {

		// input to print Fibonacci series upto how many numbers
		log("Enter number upto which Fibonacci series to print: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		log("\nUsing Method-1: Using Recursion. Provided Number: " + number);
		// printing Fibonacci series upto number
		fibonacci8(number);

		scanner.close();

		log("\nMethod-2: Fibonacci number at location " + number + " is ==> " + (fibonacciLoop(number) + ""));

	}

	// Method-1: Java program for Fibonacci number using recursion.
	public static int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail
																				// recursion
	}

	// Method-2: Java program for Fibonacci number using Loop.
	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous
										// two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;

		}
		return fibonacci; // Fibonacci number
	}

	// Method-3: Java program for Fibonacci number using Java8.
	public static void fibonacci8(int number) {
		
		Stream.iterate(new long[]{ 1, 1 }, p->new long[]{ p[1], p[0]+p[1] })
	      .limit(number).forEach(p->System.out.println(p[0]));
	
	}

	private static void log(String number) {
		System.out.println(number);

	}

}
