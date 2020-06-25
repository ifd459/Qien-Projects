import java.util.ArrayList;

public class Speler {
	ArrayList<int[]> worpGeschiedenis = new ArrayList<int[]>();
	String naam;
	
	Speler(String spelernaam){
		naam = spelernaam;
		ArrayList<int[]> worpGeschiedenis;
	}
	
	void logGeschiedenis(int[] result) {
		worpGeschiedenis.add(result);
		System.out.println(" ");
//		System.out.println("Speler geschiedenis geupdated.");
	}
	String getNaam() {
		return naam;
	}
	
}
