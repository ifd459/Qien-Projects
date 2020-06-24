import java.util.Scanner;

public class CheckInput {
	int[] vasthouden() {
		// get input of die to keep
		System.out.println("Which die would you like to keep? 1-5.");
		Scanner keepInput = new Scanner(System.in);
		String keepers = keepInput.nextLine();
		// call method intToBinaryArray
		System.out.println(keepers);
		int[] dieToKeep = intToBinaryArray(keepers);
		return dieToKeep;
	}

//	method takes user's die to keep as int
// turns int to Strin
// checks String with five ugly if statements for each number - if there 1 if not 0

	int[] intToBinaryArray(String userChoice) {
		int[] keepArray = new int[4];

		// horribly ugly series of loops that I might change.
		if (userChoice.contains("1")) {
			keepArray[0] = 1;
			System.out.print("1");
		} else {
			keepArray[0] = 0;
			System.out.print("0");
		}
		if (userChoice.contains("2")) {
			keepArray[0] = 1;
			System.out.print("1");
		} else {
			keepArray[0] = 0;
			System.out.print("0");
		}
		if (userChoice.contains("3")) {
			keepArray[0] = 1;
			System.out.print("1");
		} else {
			keepArray[0] = 0;
			System.out.print("0");
		}
		if (userChoice.contains("4")) {
			keepArray[0] = 1;
			System.out.print("1");
		} else {
			keepArray[0] = 0;
			System.out.print("0");
		}
		if (userChoice.contains("5")) {
			keepArray[0] = 1;
			System.out.print("1");
		} else {
			keepArray[0] = 0;
			System.out.print("0");
		}
		return keepArray;
	}

}
