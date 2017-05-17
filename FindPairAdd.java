import java.io.*;

public class FindPairAdd {
	
	
	static void findPair(int[] arr, int i, int value) {
		int temp;
		for(int s=i+1;s<arr.length;s++)
		{	
			
			temp=arr[s]+arr[i];
			if(temp==value)
			{
				System.out.println("("+arr[s]+" , "+arr[i]+" ) ");
			}
		}
		
	}
	public static void main(String[] args) {
		try
		{
			int size,value;//size of array
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size of the array: ");
			size=Integer.parseInt(br.readLine());
			int arr[]=new int[size];
			System.out.println("Enter the elements of the array: ");
			for(int i=0;i<size;i++)
			{
				arr[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter number: ");
			value=Integer.parseInt(br.readLine());
			for(int i=0;i<size;i++)
			{
				findPair(arr,i,value);
			}
			
		}
		catch(IOException ex )
		{
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
		}

	}

	  

}
