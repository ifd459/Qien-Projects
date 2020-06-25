import java.util.Scanner;

public class CheckInput {
	int[] vasthouden() {
		// get input of die to keep

		Scanner keepInput = new Scanner(System.in);
		String keepers = keepInput.nextLine();
		// call method intToBinaryArray
		int[] dieToKeep = intToBinaryArray(keepers);
		return dieToKeep;
	}

//	method takes user's die to keep as int
// checks String with five ugly if statements for each number - if there 1 if not 0

	int[] intToBinaryArray(String userChoice) {
		int[] keepArray = new int[5];

		// horribly ugly series of loops that I might change.
		if (userChoice.contains("1")) {
			keepArray[0] = 1;
		} else {
			keepArray[0] = 0;
		}
		if (userChoice.contains("2")) {
			keepArray[1] = 1;
		} else {
			keepArray[1] = 0;
		}
		if (userChoice.contains("3")) {
			keepArray[2] = 1;
		} else {
			keepArray[2] = 0;
		}
		if (userChoice.contains("4")) {
			keepArray[3] = 1;
		} else {
			keepArray[3] = 0;
		}
		if (userChoice.contains("5")) {
			keepArray[4] = 1;
		} else {
			keepArray[4] = 0;
		}
		if (userChoice.contains("12345")) {
			System.out.println("cocky much?");
		}
//		System.out.println("check vasthouden:");
//		for (int i = 0 ; i < keepArray.length; i ++) {
//			System.out.print(keepArray[i]);
//		}
//		System.out.println(" ");
		return keepArray;
	}
	
	

}


