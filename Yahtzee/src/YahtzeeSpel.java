import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Iterator;

public class YahtzeeSpel {
	int[] blokkeerArray;
	// list of die created
	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
	ArrayList<Speler> spelers = new ArrayList<Speler>();

	// constructor for game
	public YahtzeeSpel() {
		for (int i = 0; i < 5; i++) {
			dobbelstenen.add(new Dobbelsteen());
		}
	}

	// game play method
	void spelen() {
		spelers.add(new Speler("Pepper"));
		spelers.add(new Speler("Oliebol"));

		System.out.println("Welcom bij Yahtzee!");
		System.out.println("Gooi de stenen, als ze alle gelijk zijn, dan heb jij gewonnen!");
		System.out.println("Je kan maximaal drie keer opnieuw gooien in jouw buurt.");
		System.out.println("Druk enter te spelen of 'q' te stoppen.");
		String userInput;
		int numberOfThrows = 1;
		boolean keepPlaying = true;
		// begin game loop
		while (keepPlaying) {

			Iterator<Speler> it = spelers.iterator();
			while (it.hasNext()) {
				Speler speler = (Speler) it.next();
				System.out.println(speler.getNaam() + ", aan de buurt!");
				userInput = new YahtzeeSpel().userInput();
				if (userInput.contains("q")) {
					System.out.println("Bedankt voor het spelen.");
					System.exit(0);
				} else {
					// throw one
					System.out.println("Dobbelstenen rollen!");
					for (Dobbelsteen steen : dobbelstenen) {
						steen.currentNumber = steen.werpen();
						System.out.print(steen.currentNumber + " ");
					}
					// end of throw one
					System.out.println(" ");
					// loop to repeat throws until the end of turn
					for (int i = 0; i < 3; i++) {
						System.out.println("Welke dobbelsteen posities wilt u vasthouden?");
						blokkeerArray = new CheckInput().vasthouden(); // check with user what die to keep
						worpWeer(blokkeerArray, dobbelstenen); // throw the unwanted die again
						int[] worpUitslag = new Worp().printWorpUitslag(dobbelstenen);
						// print worpUitslag
						for (int j = 0; j < worpUitslag.length; j++) {
							System.out.print(worpUitslag[j] + " ");
						}
						System.out.println(" ");
						keepPlaying = checkForYahtzee(worpUitslag);
						// save the array of worpuitslag to speler.arraylist
//					worpUitslag = speler.worpGeschiedenis;
						
//						Speler history = new Speler();
//					history.logGeschiedenis(worpUitslag);
						System.out.println(" ");
						// end game loop
					}
					System.out.println("Nog geen Yahtzee! Einde van jouw buurt.");
				}
			}
		}

	}

	// get user input
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
		} else {
//			System.out.println("not yahtzee yet");
			isYahtzee = false;
		}
//		}
		return isYahtzee;
	}

}
