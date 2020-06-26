import java.util.ArrayList;

public class Worp {

	// method to collect the numbers on the die faces as int array
	int[] worpUitslag(ArrayList<Dobbelsteen> stenen) {
		int[] worpUitslag = new int[5];

		for (int i = 0; i < worpUitslag.length; i++) {
			worpUitslag[i] = stenen.get(i).currentNumber;
		}

		return worpUitslag;
	}

}
