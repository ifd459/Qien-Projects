import java.util.Random;

public class Dobbelsteen {
//save the current number to the die
	int currentNumber = 0;

	public int werpen() {
		Random rd = new Random();
		int randomNumber = 0;
		randomNumber = rd.nextInt(6);
		randomNumber++;
		return randomNumber;
	}
	public int getNumber() {
		return currentNumber;
	}

}
