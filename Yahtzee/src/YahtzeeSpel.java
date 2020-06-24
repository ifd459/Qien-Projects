import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeeSpel {
	int[] blokkeerArray;
	// list of die created
	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();

	// constructor for game
	public YahtzeeSpel() {
		for (int i = 0; i < 5; i++) {
			dobbelstenen.add(new Dobbelsteen());
		}
	}

	// game play method
	void spelen() {
		System.out.println("Enter te spelen of 'q' te stoppen.");
		String userInput;
		int numberOfThrows = 0;
		boolean keepPlaying = true;
		while (keepPlaying) {
			userInput = new YahtzeeSpel().userInput();
			if (userInput.contains("q")) {
				System.out.println("Bedankt voor het spelen.");
				System.exit(0);
			} else {
				numberOfThrows = numberOfThrows + 1;
				System.out.println("WORP" + numberOfThrows);
				System.out.println("1 2 3 4 5");
				for (Dobbelsteen steen : dobbelstenen) {
					steen.currentNumber = steen.werpen();
					System.out.print(steen.currentNumber + " ");
				}
				System.out.println("");
				blokkeerArray = new CheckInput().vasthouden();
				
			}
		}

	}

	// get user input
	String userInput() {

		Scanner input = new Scanner(System.in);
		String playerInput = input.nextLine();
		System.out.println("Jij geef " + playerInput);
		return playerInput;
	}

}
