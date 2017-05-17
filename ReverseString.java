
	public class ReverseString 
	{
	
		public static void main(String[] args) 
		{
			String str="Hello java ";
			int[] loc = new int[str.length()];
			char ch[]=new char[str.length()];
			
		
		
			for(int i=0; i<str.length();i++)
			{
				ch[i]=str.charAt(i);

			}

			for(int j=0;j<str.length();j++)
			{
				for(int i=0; i<str.length();i++)
				{
					if(ch[i]==' ')
					{int c=0;
					loc[c]=i;
					c++;
					}
				}
			//	System.out.println(ch[j]);
			//	System.out.println(loc[j]);
			}

			for(int j=str.length();j>0;j--)
			{
				System.out.println(ch[j]);
			}
			
			
			
	}

}
