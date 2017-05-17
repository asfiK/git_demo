import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Challenge12 {
	public static void main(String args[]) throws IOException
	{
		int j=0;
		System.out.println("Input Set");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char st='[';
		char st1=']';
		char cm=',';
		char[] sep=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			char ab = str.charAt(i);
			//System.out.println(st);
			if(ab!=st && ab!=st1 && ab!=cm)
			{
				sep[j]=ab;
				System.out.println(sep[j]);
				j++;
			}
		}
//		System.out.println(sep.length/2);
		System.out.print("[[]");
		for(j=0;j<(str.length()/2);j++)
		{
			System.out.print(",["+sep[j]+"]");
		}
		for(int i=0;i<sep.length;i++)
		{
			int k=0;
			for(j=i;j<((sep.length)/2);j++)
			{
				if(i!=j) 
				{
					int m=0;
					System.out.print(",["+sep[i]+","+sep[j]+"]");
					for(;k<sep.length/3;k++)
					{
							if((sep.length/2)>2 && i<j && i!=j && j!=k && i!=k)
							{
							System.out.print(",["+sep[i]+","+sep[j]+","+sep[k]+"]");
							}
							for(;m<sep.length/4;m++)
							{
								if((sep.length/2)>2 && i<j && i!=j && j!=k && i!=k && k!=m && i!=m && j!=m)
								{
									System.out.print(",["+sep[i]+","+sep[j]+","+sep[k]+","+sep[m]+"]");
								}
							}
					}
				}
			}
		}
		if((sep.length/2)==5)
		{
				System.out.print(",["+sep[0]+","+sep[1]+","+sep[2]+","+sep[3]+","+sep[4]+"]");
		}
		System.out.print("]");
	}
}
/*code will find powerset of set which has maximum five value

Example..
Input set:-[1,2,3]
Output set:-[[],[1],[2],[3],[1,2],[1,3],[2,3],[2,3,1]]

Input set:-[a,b,c,d]
Output set:-[[],[a],[b],[c],[d],[a,b],[a,b,c],[a,c],[a,d],[b,c],[b,c,a],[b,d],[c,d],[c,d,a],[c,d,a,b],[c,d,b]]
*/