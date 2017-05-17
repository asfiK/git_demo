import java.util.Scanner;
public class ArrayPair { 
	 // class ArrayPair to find the array elements pair that is equal to a particular gievn number by the user
	public static void main(String[] args) {  // main method
	
		Scanner sc=new Scanner(System.in);    // scanner class to take inputs for the array elements
		int flag=0;
		System.out.println("Enter the size of array :");// taking the size of array
		int length=sc.nextInt();
		System.out.println("Enter the array elements");
		int[] array=new int[length];    // creating the array of particular length decided by user
		for(int index=0;index<length;index++)
		{
			array[index]=sc.nextInt();
		}
		System.out.println("enter the sum number :");   // taking the sum
		int y=sc.nextInt();
		sc.close();   // closing the scanner class
		System.out.println("The existing pairs are :");
		for(int index1=0 ; index1 < length-1 ; index1++) 
		{
			for(int index2=index1+1 ; index2 <= length-1; index2++)
			{
				if(array[index1]+array[index2]==y)  //comparing the two different index elements for their sum to be the given number
				{
					flag=1;    // acknowledging for finding the pairs
					if(array[index1]<array[index2])
					     System.out.println("( "+array[index1]+" , "+array[index2]+" )");
					else
						 System.out.println("( "+array[index2]+" , "+array[index1]+" )");
				}	
			}
		}
		if(flag==0)   // acknowledging for not finding any pairs
			System.out.println("Sorry no pairs found");  
	}

}
