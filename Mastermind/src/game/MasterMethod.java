package game;

public class MasterMethod {
	// static char keeps code the same the whole game iteration
	static char[] code;

	public static void main(String args[]) {
//play game
		singleLoopGamePlay();
	}

//run through the game: generate code, get user input, compare the two and give a result
	static void singleLoopGamePlay() {
		boolean gameNotWon = true;
//		boolean usedInvalidLetters; NOT MEANT TOO BE HERE SORRY
		char[] code = MastermindService.generateCode();
		String userGuess;
		
		
//		run method to check for invalid letters
		while (gameNotWon) {
			userGuess = MastermindService.userGuess();
			if (userGuess.contains("q")) {
				System.out.println("Doei!");
				System.exit(0);
			} else if (userGuess.length() != 4) {
				System.out.println("Geef de geldige hoeveelheid nummers.");
				continue;
				} else if (
				MastermindService.checkForValidLetters(userGuess)) {
					System.out.println("Geef alleen geldige letters.");
				}
			else {
				gameNotWon = MastermindService.compareGuess(code, userGuess);
			}
		}
	}
}