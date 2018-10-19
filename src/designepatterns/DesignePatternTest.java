package designepatterns;

public class DesignePatternTest {
	public static void main(String[] args) {
		
		ImmutableRGB immutableRGB = new ImmutableRGB(34, 55, 22, "XYZ");
		System.out.println(immutableRGB.invert());

	}
}
