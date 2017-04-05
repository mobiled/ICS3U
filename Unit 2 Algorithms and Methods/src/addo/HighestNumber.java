package addo;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 5 numbers");
		int [] num = new int [5];
		for (int i = 0;i<num.length;i++){
			num [i] = sc.nextInt();
		}
		System.out.println("The largest number is "+highestNum(num));

	}
	/**
	 * Gets the highest number from an array of integers
	 * @param num - array of numbers
	 * @return x - the biggest number
	 */
	public static int highestNum(int [] num){
		int x = num [0];
		for (int i = 1; i < num.length;i++){
			x=Math.max(x,num[i]);
		}
		return x;
	}
}
