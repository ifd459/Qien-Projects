import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeeSpel {
	// list of die created
	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
	// list of players created
	ArrayList<Speler> spelers = new ArrayList<Speler>();

	// game constructor
	public YahtzeeSpel() {
		for (int i = 0; i < 5; i++) {
			dobbelstenen.add(new Dobbelsteen());
		}
	}

	// method for game play
	void spelen() {
		// set up variables for whole game play loop
		int[] blokkeerArray;
		boolean keepPlaying = true;
		int numberOfThrows = 1;
		boolean playerTurn = true;
		String currentPlayer;
		boolean exit = false;

		// add players to list of players
		Speler speler1 = new Speler("Pepper");
		Speler speler2 = new Speler("Oliebol");

		spelers.add(speler1);
		spelers.add(speler2);

		gameIntro();

		while (keepPlaying) {

			// loop through players
			do {
				if (playerTurn) {
					currentPlayer = speler1.getNaam();
					System.out.println(currentPlayer + ", jij bent aan de beurt.");
				} else if (!playerTurn) {
					currentPlayer = speler2.getNaam();
					System.out.println(currentPlayer + ", jij bent aan de beurt.");
				}

				// check user input for 'q' (exit)
				String userInput = new YahtzeeSpel().userInput();
				if (userInput.contains("q")) {
					System.out.println("Bedankt voor het spelen.");
					exit = true;
					System.exit(0);
				} else {
					// throw number one
					System.out.println("Dobbelstenen rollen!");
					numberOfThrows = 1;
					System.out.println("WORP" + numberOfThrows);
					for (Dobbelsteen steen : dobbelstenen) {
						steen.currentNumber = steen.werpen();
						System.out.print(steen.currentNumber + " \n");
					}
					// loop through 3 re-throws until end of turn
					for (int i = 0; i < 3; i++) {
						System.out.println("Welke dobbelsteen posities wilt u vasthouden?");

						// check with user what die to keep
						blokkeerArray = new CheckInput().vasthouden();

						// throw the unwanted die again
						worpWeer(blokkeerArray, dobbelstenen);

						// save the die numbers in int array
						int[] worpUitslag = new Worp().worpUitslag(dobbelstenen);
						numberOfThrows++;
						System.out.println("WORP" + numberOfThrows);
						// print die numbers
						for (int j = 0; j < worpUitslag.length; j++) {
							System.out.print(worpUitslag[j] + " \n");
						}

						// check for six numbers all the same
						keepPlaying = checkForYahtzee(worpUitslag);

						// save the history of the roll in ArrayList
						Speler spelerHistory = new Speler("history");
						spelerHistory.logGeschiedenis(worpUitslag);

						// loop to change players
						if (playerTurn) {
							playerTurn = false;
						} else if (!playerTurn) {
							playerTurn = true;
						}

						System.out.println(" ");
						// end game loop
					}
					System.out.println("Nog geen Yahtzee! Einde van jouw buurt.");
				}
			} while (!exit);

		}

	}

	// method to introduce game
	void gameIntro() {
		System.out.println("Welcom bij Yahtzee!");
		System.out.println("Gooi de stenen, als ze alle gelijk zijn, dan heb jij gewonnen!");
		System.out.println("Je kan maximaal drie keer opnieuw gooien in jouw buurt.");
		System.out.println("Druk enter te spelen of 'q' te stoppen.");
	}

	// method to get user input
	String userInput() {

		Scanner input = new Scanner(System.in);
		String playerInput = input.nextLine();
		System.out.println(playerInput);
		return playerInput;
	}

	// method to throw dice again if the user does not want them
	void worpWeer(int[] vasthouden, ArrayList<Dobbelsteen> dice) {
		// if blokkeer array index is 0, roll corresponding die again
		for (int i = 0; i < vasthouden.length; i++) {
			if (vasthouden[i] == 0) {
				dice.get(i).currentNumber = dice.get(i).werpen();
			}
		}
	}

	// method to check for yahtzee
	public boolean checkForYahtzee(int[] stenen) {
		boolean isYahtzee = false;
//		for (int x = 0; x < stenen.length; x++) {
//			if (stenen[0] != stenen[x])

		if ((stenen[0] == stenen[1]) && (stenen[0] == stenen[2]) && (stenen[0] == stenen[3])
				&& (stenen[0] == stenen[4])) {
			System.out.println(" yahtzee !");
			isYahtzee = true;
			System.exit(0);
		} else {
//			System.out.println("not yahtzee yet");
			isYahtzee = false;
		}
//		}
		return isYahtzee;
	}

}
