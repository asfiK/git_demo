import java.util.Scanner;

public class Stock {

	public int maxKey(int j, int arr[]) {
		int max = 0;
		for (int i = j; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public int maxProfit(int arr[]) {
		int j = 0, k = 0;
		int costPrice = 0, sellingPrice = 0;
		int max = maxKey(j, arr);
		while (j < arr.length) {
			if (arr[j] < max) {
				costPrice += arr[j];
				j++;
			} else if (arr[j] == max) {
				sellingPrice += ((j - k) * arr[j]);
				j++;
				k = j;
				max = maxKey(j, arr);
			}
		}
		return sellingPrice - costPrice;
	}

	public static void main(String[] args) {
		int arr[] = new int[7];
		System.out.println("Enter the stock prices: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Stock stockList = new Stock();
		System.out.println("Maximum profit : " + stockList.maxProfit(arr));
	}

}
