import java.util.ArrayList;

public class Worp {

int[] printWorpUitslag(ArrayList<Dobbelsteen> stenen) {
	int[] worpUitslag = new int [5];

	for (int i = 0; i < worpUitslag.length; i++) {
		worpUitslag[i] = stenen.get(i).currentNumber;
	}
	
//	System.out.println("de worpuitslag is: ");
	
//	for (int j = 0; j < worpUitslag.length; j++) {
//		System.out.print(worpUitslag[j] + " ");
//	}
//	System.out.println(" ");
	return worpUitslag;
}

}
