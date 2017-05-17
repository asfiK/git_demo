

import java.util.ArrayList;

public class Sum {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		int sumForThree = 0, sumForFive = 0;
		int sum = 0;
		for(int i = 0; i < 9999; i++) {
			if((i % 3) == 0) {
				x.add(i);
				sumForThree += i;
			}
			else if((i % 5) == 0) {
				y.add(i);
				sumForFive += i;
			}
		}
		sum = sumForThree + sumForFive;
		System.out.println(sum);
	}
}
