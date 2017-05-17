//STEP-1:-to take input from user and sort it in order to avoid confusion

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class PowerSet {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		System.out.println("Enter the number of array elements..");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println("enter the elements of the array");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=Integer.parseInt(br.readLine());
		Arrays.sort(array);									//sorting the array not essential,just for ease of combination
		System.out.println("Sorted array:");
		for(int i:array)
			System.out.println(i);				//printing the sorted array
	
	}



}
