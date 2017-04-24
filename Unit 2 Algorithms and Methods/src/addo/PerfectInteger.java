package addo;

/**
 * PerfectInteger.java 
 * This programs displays all the perfect integers from 1-100
 * @author Ahmed Addo 
 * 21/04/2017
 */
public class PerfectInteger {

	public static void main(String[] args) {
		for (int x = 1; x < 100; x++) {
			if (isPerfect(x)) {
				System.out.println(x);
			}
		}
	}

	/**
	 * Determines if a number is is perfect by gathering its factors and adding it. 
	 * It then compares the added factors to the original number
	 * @param a - number that is checking if it is perfect
	 * @return true or false depending if the param is equal to the sum of its factors excluding itself
	 */
	public static boolean isPerfect(int a) {
		int x = 0;
		for (int i = 1; i < a; i++) {
			if (isDivisible(a, i)) {
				x = x + i;
			}

		}
		if (x == a) {
			return true;
		}
		return false;

	}
	/**
	 * Testing if 2 numbers are divisble with each other
	 * @param a - an int value
	 * @param b - an second in value
	 * @return - True or False
	 */
	public static boolean isDivisible(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}
}
