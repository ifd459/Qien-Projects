package GuessingGame;

import java.util.Random;
import java.util.Scanner;

class Guess {
	static boolean keepOnGoing = true;

	public static void main(String[] args) {
		howToPlay();
		while (keepOnGoing) {
			gamePlay();
		}
	}

	static void gamePlay() {
		int humanGuess;
		int robotGuess;

		humanGuess = userGuess();
		robotGuess = randomNumberOutput();
		compareNumbers(humanGuess, robotGuess);

		System.out.println("Have you suffered enough? Y/N");
		Scanner sufferMore = new Scanner(System.in);
		String suffering = sufferMore.next();
		if ("Y".equalsIgnoreCase(suffering)) {
			System.out.println("Fine you little bitch.");
			keepOnGoing = false;
		} else {
			System.out.println("Alright then, my little optimist.");
		}
	}

	static void howToPlay() {
		// game is explained to human
		System.out.println("Welcome to guess or die.");
		System.out.println(
				"The rules are simple: guess the correct number or suffer social humilation and a painful death.");
		System.out.println("Would you like to proceed? Y/N");
		Scanner playGame = new Scanner(System.in);
		String ready = playGame.next();
		if ("Y".equalsIgnoreCase(ready)) {
			System.out.println("Bring it on.");
		} else if (ready != "Y" || ready != "y") {
			System.out.println("Tough titties. Let's do this anyway.");
		}
	}

	// method for human guess
	static int userGuess() {
		boolean numberOutOfBounds = true;
		int userGuess = 0;
		while (numberOutOfBounds) {
			userGuess = getUserInput();
			if (userGuess < 1) {
				System.out.println("This number is below the given range. Try again");
			} else if (userGuess > 100) {
				System.out.println("This number is above the given range. Try again");
			} else {
				System.out.println("You guessed " + userGuess);
				numberOutOfBounds = false;
			}
		}
		return userGuess;

	}

	static int getUserInput() {
		Scanner askUser = new Scanner(System.in);
		int userGuess;
		System.out.println("Please enter a number in the range of 1-100.");
		userGuess = askUser.nextInt();
		return userGuess;

	}

	// method for output of random number
	static int randomNumberOutput() {
		Random random = new Random();
		int number = random.nextInt(100);
		number += 1;
		System.out.println("Did you mean " + number + "? Sure, Jan...");
		return number;
	}

	static void compareNumbers(int humanGuess, int robotGuess) {

		if (humanGuess < robotGuess) {
			System.out.println("Haha dickhead, that's too low.");
		} else if (humanGuess > robotGuess) {
			System.out.println("Boooo, that's too high.");
		} else {
			System.out.println(
					"Congratulations. You beat a computer. Do you beat your wife that hard? No one wins here.");
		}
	}
}