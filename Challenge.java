   


public class Challenge {

	public static void main(String[] args) {
		
		  int i ;
			   int l=0;
			   int k =0;
			   int m=3 ,n=3;
			   int[][] a1 = new int[3][3];
			    a1[0][0]=1;
				a1[0][1]=2;
				a1[0][2]=3;
				
				a1[1][0]=4;
				a1[1][1]=5;
				a1[1][2]=6;
				a1[2][0]=7;
				a1[2][1]=8;
				a1[2][2]=9;
				
			   
			   while(k<m && l<n)
			   {

				   for(i=0;i<n;i++)
				   {
					   System.out.println(a1[k][i]);
					   
				   }
				   k++;
				   for(i=k;i<m;i++)
				   {
					   
					   System.out.println(a1[i][n-1]);
				   }
				   n--;
				   
			   }
			   
			   
			   
			   
			   
			  /* 
			   if(k<m)
				   
			   {
				   for(i=n;i>=l;i--)
				   {
					   
					   System.out.println(a1[i][n-1]);
					   
				   }
				   m--;
			   } 
			   
			   
			   
			   */
			   
			   
			   
			   
		  
	  }
}
