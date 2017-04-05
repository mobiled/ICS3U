package addo;

import java.util.Scanner;
/**
 * Finds the sum of all digits in a number
 * SumOfDigits.java
 * @author 323993204
 * 05/04/17
 */
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("The sum of the digits is "+sumOfDigits(num));
	}
/**
 * Finds the sum of all the digits in a number, eg. (17=1+7=8)
 * @param num - number which digits are being added
 * @return the sum of digits
 */
	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;

}
}