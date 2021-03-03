/****************************************************************************************************
    Names: Mohammad Khan, Bryan Zhang, Joseph Kim

    Problem Statement: Write a program RandomWalker.java that takes an integer command-line argument
    N and simulates the motion of a random walker for N steps. After each step, print the location of
    the random walker, treating the lamp post as the origin (0, 0). Also, print the square of the
    final distance from the origin.

    Compilation: javac RandomWalker.java
    Execution: java RandomWalker x

    Notes: RandomWalker takes in a number x that is the number of steps that drunk guy will take. It
    outputs the location at the end of each step, and at the end, it outputs the squared distance
    from the origin.

    % java RandomWalker 5
    (0,1)
    (0,2)
    (1,2)
    (1,1)
    (1,0)
    squared distance = 1

    % java RandomWalker 10
    (0, -1)
    (0, 0)
    (0, 1)
    (1, 1)
    (1, 0)
    (0, 0)
    (-1, 0)
    (-1, 1)
    (0, 1)
    (-1, 1)
    squared distance = 2
****************************************************************************************************/

public class RandomWalker {
    public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("You did not provide a number of steps");
			return;
		}
		int a = Integer.parseInt(args[0]);
		long x = 0L;
		long y = 0L;
		for (int i = 0; i < a; i++) {
			int r = (int) (4 * Math.random());
			if (r % 2 == 1) {
				if (r % 4 == 1) {
					y++;;
				} else {
					y--;
				}
			} else {
				if (r % 4 == 2) {
					x++;
				} else {
					x--;
				}
			}
			System.out.println("("+x+", "+y+")");
		}
		long z = x * x + y * y;
		System.out.println("squared distance = " + z);
    }
}
