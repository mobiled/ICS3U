package addo;

import java.util.Scanner;

public class GCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = sc.nextInt();
		System.out.println("Enter your second number");
		int b = sc.nextInt();
		System.out.print("The greatest common factor of these two numbers is "+gCF(a,b));
		

	}
	/** 
	 * Find greatest common factor between 2 numbers
	 * @param a - first number
	 * @param b - second number
	 * @return The greatest common factor
	 */
	public static int gCF (int a, int b){
		if (a>b){
			for (int i = a; i>0;i--){
				if (isDivisble(a,i) == true && isDivisble(b,i)){
					return i;
				}
			}
		}
		if (b>a){
			for (int i = b; i >0;i--)
			{
				if(isDivisble(b,i)==true && isDivisble(a,i)==true){
					return i;
				}
			}
		}
		return a;
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
}
