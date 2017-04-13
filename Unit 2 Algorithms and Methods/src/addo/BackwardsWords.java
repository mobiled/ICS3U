package addo;

import java.util.Scanner;
/**
 * Prints Sentence Backwards
 * BackwardsWords.java
 * @author Ahmed Addo
 * 12/04/17
 */
public class BackwardsWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String[] sentence = sc.nextLine().split(" ");
		

		String word;
		for (int i = 0; i < sentence.length; i++) {
			word = sentence[i];
			for (int j = word.length(); j > 0; j--) {
				if (((Character) (word.charAt(0))).toString().matches("[A-Z]")) {
					if (j == word.length()) {
						System.out.print(Character.toUpperCase(word.charAt(j - 1)));
					} else {
						System.out.print(Character.toLowerCase(word.charAt(j - 1)));
					}
				} else {
					System.out.print(word.charAt(j));
				}

			}
			System.out.print(" ");
		}

	}

}
