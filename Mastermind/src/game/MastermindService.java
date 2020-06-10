package game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MastermindService {
//	method to check for presence of character
	static boolean characterPresent(char[] code, char guess) {
		boolean contains = false;
		for (int i = 0; i < 4; i++) {
			if (guess == code[i]) {
				contains = true;
				break;
			}

		}
		return contains;
	}

	// method to compare char arrays
	static boolean compareGuess(char[] code, char[] guess) {
		// uncomment to show the actual generated code while playing (cheat)
//		System.out.println("The secret code is: " + code[0] + code[1] + code[2] + code[3]);
		if (Arrays.equals(code, guess)) {
			System.out.println("Wow you did it!");
			return false;
		} else {
//			use method to see if letter is present
			int characterThere = 0;
			int correctPosition = 0;
			for (int i = 0; i < 4; i++) {
				// is char present in code
				if (characterPresent(code, guess[i])) {
					// is char in the right position?
					if (guess[i] == code[i]) {
						correctPosition += 1;
					} else {
						characterThere += 1;

					}
				}
			}

			System.out.println("Letters present, but at incorrect position: " + characterThere);
			System.out.println("Letters at correct position: " + correctPosition);
			return true;
		}

	}

	// method to get code char array
	static char[] generateCode() {
		Random rd = new Random();
		String letters = "abcdef";
		char[] generatedCode = new char[4];
		for (int i = 0; i < 4; i++) {
			generatedCode[i] += letters.charAt(rd.nextInt(letters.length()));
		}
		return generatedCode;

	}

	// method to get user char array
	static char[] userGuess() {

		System.out.println("Geef vier letters (a-f).");
		Scanner input = new Scanner(System.in);
		String userGuess = input.nextLine();
		System.out.println(userGuess);
		char[] guessToArray = userGuess.toCharArray();
		return guessToArray;
	}
}
