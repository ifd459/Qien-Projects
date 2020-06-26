import java.util.ArrayList;

public class Speler {
	// set up variables
	ArrayList<int[]> worpGeschiedenis = new ArrayList<int[]>();
	String naam;

	// constructor for player
	Speler(String spelernaam) {
		naam = spelernaam;
		ArrayList<int[]> worpGeschiedenis;
	}

	// method to log the history of the player per turn
	void logGeschiedenis(int[] result) {
		worpGeschiedenis.add(result);
		// uncomment for check
		// System.out.println("Speler geschiedenis geupdated.");
		// prints memory address of int[] in ArrayList
		// for (int i = 0; i < worpGeschiedenis.size(); i++) {
		// System.out.print(worpGeschiedenis.get(i));
		// }
	}

	// method to get name of player
	String getNaam() {
		return naam;
	}

}
