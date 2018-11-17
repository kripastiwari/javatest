package test;

public class MazzeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void findPath() {
		//goLeft();
		goRight();
		//goUp();
		goDown();
	}
	

	public static void goLeft() {
		goLeft();
		//goRight();
		goUp();
		goDown();
	}

	public static void goRight() {
		//goLeft();
		goRight();
		goUp();
		goDown();
	}

	public static void goUp() {
		goLeft();
		goRight();
		goUp();
		//goDown();
	}

	public static void goDown() {
		goLeft();
		goRight();
		//goUp();
		goDown();
	}
}
