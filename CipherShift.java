import java.util.Scanner;
import java.util.StringTokenizer;

public class CipherShift {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);		
		String s1=sc.nextLine();
		
		System.out.println("You entered :"+s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		
		char[] c1=null;
		StringTokenizer st=new StringTokenizer(s2);
		while(st.hasMoreTokens()){
			c1=st.nextToken().toCharArray();
			for(int i=0;i<c1.length;i++){
				
				if(c1[i]<=67){
					System.out.print((char)(c1[i]+26-3));
				}
				else{
				c1[i]=(char) (c1[i]-3);
				System.out.print(c1[i]);
				}
				
			}
			System.out.print(" ");
		}
	
	}
}
