package designepatterns;

public class SwapTest {

	public static void main(String[] args) {

		String s = "kripa shanker abs tiwari";

		int length = s.length();
		
		System.out.println(s.substring(0, s.indexOf(" ")));  //kripa

		System.out.println(s.substring(s.lastIndexOf(" ") + 1, length)); //tiwari

		String r = reverse(s);

		System.out.println(r);

	}

	private static String reverse(String s) {
		int length = s.length();

		if (length <= 1) {
			return s;
		} else {
			
			//swapping first word with last word :----kripa shanker abs tiwari to  tiwari shanker abs kripa

			return s.substring(s.lastIndexOf(" ") + 1, length) + s.substring(s.indexOf(" "), s.lastIndexOf(" ") + 1) + s.substring(0, s.indexOf(" "));

			
			//swapping first two letters with last two letters :------kripa shanker abs tiwari to  riipa shanker abs tiwakr
			
			//return s.substring(length - 2, length) + s.substring(2, length - 2) + s.substring(0, 2);
		}

	}

}
