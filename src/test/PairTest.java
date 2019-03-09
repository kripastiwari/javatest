package test;

import java.util.*;

public class PairTest {

	public static void main(String[] args) {
		int input[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20, 20, 20, 60, 70 };
		int size = input.length;
		int result = sockMerchant(size, input);
		System.out.println("result -> " + result);
	}

	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> map = new HashMap<>();
		int output = 0;
		for (Integer in : ar) {
			if (!map.containsKey(in)) {
				map.put(in, 1);
			} else {
				map.remove(in);
				output++;
			}
		}
		return output;
	}
}
