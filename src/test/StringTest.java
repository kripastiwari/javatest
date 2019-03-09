package test;

public class StringTest {

	public static void main(String[] args) {

		String string = "ram||shyam||mohan||sohan";

/*		if (string.indexOf(",") == -1) {

			System.out.println("no commas");

		}*/

		String[] names = string.split("\\|\\|");

		for (String name : names)

			System.out.println(name.toString());

	}

}
