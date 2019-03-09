package designepatterns;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<Animal, String> map = new HashMap<>();

		Animal animal = new Animal();

		map.put(animal, "abc");

		System.out.println(map.get(animal));

		animal.setName("Cat");

		System.out.println(map.get(animal));
		
		map.put(animal, "abc");

		System.out.println(map.get(animal));

	}

}
