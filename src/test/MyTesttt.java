package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyTesttt {

	private static final int NTHREDS = 5;

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new MyRunnable(10L + i);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// Wait until all threads are finish
		try {
			executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished all threads");

	}
}
