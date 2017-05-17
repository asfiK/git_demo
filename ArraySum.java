
public class ArraySum {

	static int sum;

	/**
	 * method inputData takes the input of arrayofarrays from the console given
	 * by user
	 * 
	 * @return number arrayofarrays
	 */
	public static int[][] inputData() {

		System.out.println("enter the total number of arrays ");
		int arrayLength = Main.sc.nextInt();
		int number[][] = new int[arrayLength][]; // arrayofarrays is initialised
		for (int i = 0; i < number.length; i++) {
			System.out.println("Enter the array " + i + "'s length\n");
			int innerArray = Main.sc.nextInt(); // taking the length of array in
												// array
			System.out.println("Enter the array " + i + " elements\n");
			number[i] = new int[innerArray]; // declaring inner array length
			for (int j = 0; j < innerArray; j++) {
				int x = Main.sc.nextInt(); // getting elements into the array
				number[i][j] = x; // inserting into array

			}
		}
		Main.sc.close(); // closing scanner
		return number;
	}

	/**
	 * method to display the array of array in formate'[[3,2],[1],[4,12]]' and
	 * the sum of numbers in arrayofarrays
	 * 
	 * @param number
	 *            it is arrayofarrays
	 * 
	 */
	public static void Display(int number[][]) {
		System.out.print("your input array of array's is :  ");
		for (int i = 0; i < number.length; i++) {

			if (i == 0) {
				System.out.print("[");
			}
			int innerArray = number[i].length;
			System.out.print("[");
			for (int j = 0; j < innerArray; j++) {
				sum += number[i][j];
				System.out.print(number[i][j]);
				if (j != innerArray - 1) {
					System.out.print(",");
				} else {
					System.out.print("]");
				}
			}

			if (i == number.length - 1) {
				System.out.print("]");
			} else {
				System.out.print(",");
			}
		}

		System.out.println("\nTotal sum is : " + sum); // printing sum of
														// elements in given
														// array
	}

}
