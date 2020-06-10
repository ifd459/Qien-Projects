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
		char[] code = MastermindService.generateCode();
		while (gameNotWon) {
			gameNotWon = MastermindService.compareGuess(code, MastermindService.userGuess());
		}
	}
}