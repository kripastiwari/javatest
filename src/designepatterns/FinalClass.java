package designepatterns;

import java.util.HashMap;
import java.util.Iterator;

public class FinalClass {

	private final int id;

	private final String name;

	private final HashMap<String, String> testMap;
	
	/**
	 * Constructor performing Deep Copy
	 */

	public FinalClass(int i, String n, HashMap<String, String> hm) {
		System.out.println("Performing Deep Copy for Object initialization");
		this.id = i;
		this.name = n;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
	}

	/**
	 * Constructor performing Shallow Copy
	 */

	/*public FinalClassExample(int i, String n, HashMap<String, String> hm) {
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id = i;
		this.name = n;
		this.testMap = hm;
	}*/
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getTestMap() {
		// return testMap;
		return (HashMap<String, String>) testMap.clone();
	}


	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep
	 * Copy for creating immutable classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");

		String s = "original";

		int i = 10;

		FinalClass ce = new FinalClass(i, s, h1);

		// Lets see whether its copy by field or reference
		System.out.println(s == ce.getName());
		System.out.println(h1 == ce.getTestMap());
		// print the ce values
		System.out.println("ce id:" + ce.getId());
		System.out.println("ce name:" + ce.getName());
		System.out.println("ce testMap:" + ce.getTestMap());
		// change the local variable values
		i = 20;
		s = "modified";
		h1.put("3", "third");
		// print the values again
		System.out.println("ce id after local variable change:" + ce.getId());
		System.out.println("ce name after local variable change:" + ce.getName());
		System.out.println("ce testMap after local variable change:" + ce.getTestMap());

		HashMap<String, String> hmTest = ce.getTestMap();
		
		System.out.println("hmTest >>"+hmTest);
		
		System.out.println(hmTest.hashCode()+"||"+ce.getTestMap().hashCode());
		
		hmTest.put("4", "new");
		
		System.out.println(hmTest.hashCode()+"||"+ce.getTestMap().hashCode());

		System.out.println("ce testMap after changing variable from accessor methods:" + ce.getTestMap());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((testMap == null) ? 0 : testMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FinalClass other = (FinalClass) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (testMap == null) {
			if (other.testMap != null)
				return false;
		} else if (!testMap.equals(other.testMap))
			return false;
		return true;
	}

}
