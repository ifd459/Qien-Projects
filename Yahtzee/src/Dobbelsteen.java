import java.util.Random;

public class Dobbelsteen {
	// set up variable for die number
	int currentNumber = 0;

	// method to assign random number 1-6
	public int werpen() {
		Random rd = new Random();
		int randomNumber = 0;
		randomNumber = rd.nextInt(6);
		randomNumber++;
		return randomNumber;
	}

	// method to return number on die
	public int getNumber() {
		return currentNumber;
	}

}
