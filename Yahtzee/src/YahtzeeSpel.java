import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class YahtzeeSpel {
	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
	
	public YahtzeeSpel() {
		for (int i = 0; i < 5; i ++){
			dobbelstenen.add(new Dobbelsteen());
		}
	}
	
	
	
	void spelen() {
		String userInput;
		boolean keepPlaying = true;
		while (keepPlaying) {
			userInput = new YahtzeeSpel().userInput();
			if (userInput.contains("q")) {
				System.out.println("Bedankt voor het spelen.");
				System.exit(0);
			}
		}

	}
	
	

	
	
	String userInput() {
		System.out.println("Enter te spelen of 'q' te stoppen.");
		Scanner input = new Scanner(System.in);
		String playerInput = input.nextLine();
		System.out.println("Jij geef " + playerInput);
		return playerInput;
	}

}
