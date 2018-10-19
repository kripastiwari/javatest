package test;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		reverseArrayElement(arr);
	}

	public static void reverseArrayElement(int[] arr) {
		int size = arr.length;
		int rev[] = new int[size];
		for (int i = 0; i <= rev.length - 1; i++) {
			rev[i] = arr[(rev.length - 1) - i];
		}
		for (int i = 0; i <= rev.length - 1; i++) {
			System.out.println(rev[i]);
		}
	}
}
