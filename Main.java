

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Choose \na.To Know Sum of array of arrays \tb.To Know Natural number squares difference\n");
		switch (sc.nextLine()) // using switch case for asking user to choose
								// from options
		{
		case "a":
			ArraySum.Display(ArraySum.inputData());
			break;
		case "b":
			NaturalNumbers.naturalNumber();
			break;
		default:
			System.out.println("please choose a or b");
		}
		sc.close(); // closing the scanner
	}
}
