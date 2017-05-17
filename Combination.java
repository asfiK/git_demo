//STEP 3-method to find the combination of elements 

public class Combination {
	int n,j;
	public void combination(int a,int b,int c)
	{
		int arr1[]={a,b,c};
		int arr2[]={a,b,c};
		for(int j=0;j<3;j++)
		{
		for( int i=0;i<3;i++)
		{
			if(i==j)
				System.out.println(arr1[i]);
			else{
				if(j>i)
			System.out.println(arr1[i]+","+arr2[j]);
			}
		}
		}
	}
	public static void main(String args[]){
		Combination c=new Combination();
		c.combination(1, 2, 3);
	}
}
