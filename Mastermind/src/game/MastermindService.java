
package game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//method listing: characterPresent, compareGuess, generateCode, userGuess, checkForValidLetters


public class MastermindService {
//	method to check code for presence of character from guess[i]
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

	// method to convert String to array and then compare
	static boolean compareGuess(char[] code, String stringGuess) {
		//convert String to array
		char[] guess = stringGuess.toCharArray();


		// uncomment to show the actual generated code while playing (cheat)
//		System.out.println("De geheime code is: " + code[0] + code[1] + code[2] + code[3]);
		
		//check for correct answer
		if (Arrays.equals(code, guess)) {
			System.out.println("Gefeeliciteerd! Je hebt de code gekraakt!");
			return false;
		} else {
			int characterThere = 0;
			int correctPosition = 0;
			for (int i = 0; i < 4; i++) {
				// is char present in code?
				if (characterPresent(code, guess[i])) {
					// is char in the right position? - if yes count for juiste positie
					if (guess[i] == code[i]) {
						correctPosition += 1;
						//count for onjuiste positie
					} else {
						characterThere += 1;
					}
				}
			}
//give user feedback - there is a delightful feature here that counts double letters (from guess)
//in onjuiste and juiste positie - this is only to make you stronger as a player
// and is totally not a bug... you can do this!
			System.out.println("Letters in de onjuiste positie: " + characterThere);
			System.out.println("Letters in de juiste positie: " + correctPosition);
			return true;
		}

	}

	// method to get secret code char array
	static char[] generateCode() {
		Random rd = new Random();
		String letters = "abcdef";
		char[] generatedCode = new char[4];
		for (int i = 0; i < 4; i++) {
			generatedCode[i] += letters.charAt(rd.nextInt(letters.length()));
		}
		return generatedCode;

	}

	// method to get user String
	static String userGuess() {

		System.out.println("Geef vier letters (a-f).");
		Scanner input = new Scanner(System.in);
		String userGuess = input.nextLine();
		System.out.println(userGuess);
		return userGuess;
	}

	// method to check userGuess for invalid letters
	//is it possible to put this into a String and check against that?
	static boolean checkForValidLetters(String userGuess) {
		if (userGuess.contains("g")) {
			return true;
		} else if (userGuess.contains("h")) {
			return true;
		} else if (userGuess.contains("i")) {
			return true;
		} else if (userGuess.contains("j")) {
			return true;
		} else if (userGuess.contains("k")) {
			return true;
		} else if (userGuess.contains("l")) {
			return true;
		} else if (userGuess.contains("m")) {
			return true;
		} else if (userGuess.contains("n")) {
			return true;
		} else if (userGuess.contains("o")) {
			return true;
		} else if (userGuess.contains("p")) {
			return true;
		} else if (userGuess.contains("r")) {
			return true;
		} else if (userGuess.contains("s")) {
			return true;
		} else if (userGuess.contains("t")) {
			return true;
		} else if (userGuess.contains("u")) {
			return true;
		} else if (userGuess.contains("v")) {
			return true;
		} else if (userGuess.contains("w")) {
			return true;
		} else if (userGuess.contains("x")) {
			return true;
		} else if (userGuess.contains("y")) {
			return true;
		} else if (userGuess.contains("z")) {
			return true;
		} else {
			return false;
		}
	}
}