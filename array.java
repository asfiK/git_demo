import java.util.Scanner;

class array 
{
	public static void main(String[] args)
	{
		
		try
		{
			int arr[][][]=new int[3][3][3];	
			int sum=0;
			
			//taking user input
			Scanner iscan = new Scanner(System.in);
			System.out.println("Enter the size of 3-D array:"); //entering the size
			int rows=iscan.nextInt();
			int column=iscan.nextInt();
			int column1=iscan.nextInt();

			//entering the elements
			System.out.println("Enter the elements of array:"); //entering the elements
			
			if(column<column1)
			{
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<column;j++)
					{
						for(int k=0;k<=column1;k++)
						{
							arr[i][j][k]=iscan.nextInt();
						}
					}
				}
			
				//for the addition of the elements of array
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<column;j++)
					{
						for(int k=0;k<=column1;k++)
						{
							sum = sum + arr[i][j][k];
						}
					}
				}
				
				System.out.println("\nThe sum of all the elements in an array are: "+sum);
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
