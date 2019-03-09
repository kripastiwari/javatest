package designepatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of n:");
		int n = s.nextInt();
		s.close();
		List<Integer> result = generateByIterate(n);
		System.out.print("result -> "+result);
	}

	/*public static List<Integer> fib(int n) {
		List<Integer> output = new ArrayList<>();
		if (n <= 1) {
			output.add(n);
			return output;
		}
		output.addAll(fib(n - 1) + fib(n - 2));
		return output;
	}*/

	public static List<Integer> generateByIterate(int n) {
		int a = 0, b = 0, c = 1;

		List<Integer> output = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			output.add(a);
		}
		return output;
	}

}
