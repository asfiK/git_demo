
public class NaturalNumbers {
	public static void naturalNumber() {

		System.out.println("enter the natural number: ");
		int number = Main.sc.nextInt();
		Main.sc.close();
		int squareofsum = sumofNaturalNumbersSquare(number);// method call to
															// squareofsum
		int sumofsquares = squareofnaturalnumber(number); // method call to
															// sumofsquares
		System.out.println("sum of Natural Numbers Square is : " + squareofsum);
		System.out.println("sum of Squares of Natural Numbers is : " + sumofsquares);
		System.out.println("Difference between squareofsum and sumofsquares is: " + (squareofsum - sumofsquares));// prints
																													// the
																													// difference
																													// between
																													// the
																													// square
																													// of
																													// sum
																													// and
																													// sum
																													// of
																													// squares

	}

	/**
	 * method calculates the sum of natural numbers and square the sum
	 * 
	 * @param number
	 *            takes natural number
	 * @return square of sum of natural numbers
	 */

	public static int sumofNaturalNumbersSquare(int number) {
		number = (((number + 1) * number) / 2); // calculates the sum of n
												// natural numbers
		number = number * number; // squares the sum of n natural numbers
		return number;
	}

	/**
	 * method to calculate the sum of squares of natural number
	 * 
	 * @param number
	 *            takes the natural number
	 * @return the sum of squares of the natural numbers
	 */
	public static int squareofnaturalnumber(int number) {
		number = (number * (number + 1) * (2 * (number) + 1)) / 6; // calculates
																	// the sum
																	// of
																	// squares
																	// of n
																	// natural
																	// numbers
		return number;
	}
}
