import java.util.Scanner;
public class Spiral 
{
	
	
	public static void main(String[] args) 
	{
	 Spiral s=new Spiral();
	 s.inputMatrix(); 
	 
		
	}
		
	
		//Matrix input function
		void inputMatrix()
		{
			int n ;
		    
			Scanner sc=new Scanner(System.in);
			
			int i,j;
		
			System.out.println("Enter the Order of the matrix: ");
			n=sc.nextInt();
			
			int mat[][]=new int[n][n];
			
			System.out.println("Enter the Elements of the Matrix Row-wise :");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					mat[i][j]=sc.nextInt();
				}
			}
			System.out.println("Given Matrix looks like : ");
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
			sc.close();
			Spiral s=new Spiral();
			
			System.out.print("Matrix in Spiral Order is : [ ");
			s.spiralPrint(mat,n);
			System.out.println(" ]");
		
		}
		
		//Spiral Print function
		void spiralPrint(int matrix[][],int n)
		{
			int startRow=0,endRow=n-1,startCol=0,endCol=n-1,i;
			
			while(endRow>=startRow && endCol>=startCol)
			{
				for(i=startCol;i<=endCol;i++)             //printing Row
				{
					System.out.print(matrix[startRow][i]+" , ");
				}
				startRow++;  //eliminating upper row
				
				for (i=startRow;i<=endRow;i++)           //printing column
				{
					System.out.print(matrix[i][endCol]+" , ");
					
				}
				endCol--;   //eliminating rightmost column
				
				for(i=endCol;i>=startCol;i--)           //printing reverse row
				{
					System.out.print(matrix[endRow][i]+" , " );
				}
				endRow--;   //eliminating lower row
				
				for(i=endRow;i>=startRow;i--)           //printing reverse column
				{ 
					System.out.print(matrix[i][startCol]+" , ");
				}
				startCol++;   //eliminating leftmost column
			}
			
		}
		
	

}
