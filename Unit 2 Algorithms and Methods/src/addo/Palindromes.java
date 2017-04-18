/**
 * 
 */
package addo;

import java.util.Scanner;

/**
 * Determines if a word is a palindrome
 * @author Ahmed Addo 
 * 13/04/17 
 * Palindromes.java
 */
public class Palindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		if (palindrome(word)){
			System.out.println("This is a palindrome");
			
		}
		else {
			System.out.print("This is not a palindrome");
		}

	}
	public static boolean palindrome(String word){
		String s = "";
		for (int j=word.length();j>0;j--){
			s=s+word.charAt(j-1);
		}
		if (s.equalsIgnoreCase(word)){
			return true;
		}
		return false;
	}

}
