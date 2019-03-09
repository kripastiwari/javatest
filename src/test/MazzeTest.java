package test;

public class MazzeTest {
	final int N = 7;

	boolean shouldContinue(String[][] maze, int x, int y) {

		return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y].equalsIgnoreCase("O"));

	}

	boolean findPath(String[][] maze) {

		boolean flag = isAnyPath(maze, 0, 0);

		if (!flag) {
			System.out.print("No Path Found.");
			return false;
		}
		return true;
	}

	boolean isAnyPath(String[][] maze, int x, int y) {
		if (x == (N - 1) && y == (N - 1)) {
			if (maze[x][y].equalsIgnoreCase("X")) {
				return false;
			}
			System.out.print("{" + x + ", " + y + "}");
			return true;
		}

		if (shouldContinue(maze, x, y)) {

			System.out.print("{" + x + ", " + y + "} -> ");

			if (isAnyPath(maze, x + 1, y)) {
				return true;
			}

			if (isAnyPath(maze, x, y + 1)) {
				return true;
			}
			
//			if (isAnyPath(maze, x-1, y)) {
//				return true;
//			}
//			
//			if (isAnyPath(maze, x, y - 1)) {
//				return true;
//			}

			return false;
		}

		return false;
	}

	public static void main(String args[]) {
		MazzeTest test = new MazzeTest();
		String maze[][] = { { "O", "O", "O", "O", "O", "X", "O" },
							{ "X", "X", "O", "X", "O", "O", "X" },
							{ "O", "X", "O", "O", "X", "X", "X" },
							{ "X", "X", "X", "O", "O", "X", "O" },
							{ "X", "X", "X", "X", "X", "O", "X" },
							{ "O", "O", "O", "O", "O", "O", "O" },
							{ "X", "X", "O", "X", "X", "X", "O" } };
		test.findPath(maze);
	}
}
