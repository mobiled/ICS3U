package addo;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (primeNum(num)==true){
			System.out.println("This number is a prime number");
		}
		else {
			System.out.println("This number isn't a prime number");
		}
		

	}
/**
 * Testing if 2 numbers are divisble with each other
 * @param a - an int value
 * @param b - an second in value
 * @return - True or False
 */
	public static boolean isDivisble(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;	
	}
/**
 * Tests if number is prime or not prime
 * @param num - which is prime or not prime
 * @return - true or false
 */
	public static boolean primeNum(int num) {
		for (int i = 2; i < num; i++) {
			if (isDivisble(num, i)==true) {
				return false;
			}
			
		}
		return true;
	}
}
