import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);		
		String s=sc.nextLine();
		
		char[] c=s.toCharArray();
		int l=c.length;
		
		char t;
	
		//System.out.println(c);
		for(int k=0;k<l-1;k++)
		{
			for(int i=l-1;i>=0;i--)
			{
				if(i==0)
				{
					t=c[i];
					c[i]=c[l-1];
					c[l-1]=t;
					System.out.println(c);
				}
				else
				{
				t=c[i];
				c[i]=c[i-1];
				c[i-1]=t;
				System.out.println(c);
				}
			}
		}
	}
	
	

}
