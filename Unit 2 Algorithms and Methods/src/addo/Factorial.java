package addo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		System.out.println(factorial(x));
	}
	/**
	 * Finds factorial for a number
	 * @param x - the number which where your finding the factorial of 
	 * @return the factorial
	 */
	public static int factorial(int x){
		for (int y = x-1;y > 0; y--){
			x=y*x;
			
		}
		return x;
	}

}
