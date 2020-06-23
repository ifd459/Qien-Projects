import java.util.Random;

public class Dobbelsteen {
	int werpen() {
		Random rd = new Random();
		int randomNumber = 0;
		randomNumber = rd.nextInt(6);
		randomNumber++;
		return randomNumber;
	}
}
