package addo;
/**
 * PhytagoreanTriples.java
 * Prints all the phytagorean triples with values of A and B less than 100
 * @author Ahmed Addo
 * 20/04/2017
 */
public class PythagoreanTriples {

	public static void main(String[] args) {
		int pythagorean;
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				pythagorean = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
				if (perfectSquare(pythagorean)) {
					System.out.println(a+"^2 " + "+" + b+"^2 " + "= " + (int)Math.sqrt(pythagorean)+"^2");
				}
			}
		}

	}
/**
 * This method checks if a value is a perfect square
 * @param n - value that will be tested if it's a perfect square
 * @return - true or false, true if it is perfect square, false if not a perfect square
 */
	public static boolean perfectSquare(int n) {
		int x = (int) Math.sqrt(n);
		double check = Math.pow(x, 2);
		if (n == check) {
			return true;
		}
		return false;

	}

}
