package test;

import designepatterns.Task;
import designepatterns.TaskBuilder;

public class BuilderTest {
	public static void main(String[] args) {
        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }
}
