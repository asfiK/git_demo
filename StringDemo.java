import java.io.*;
import java.util.*;

public class StringDemo 
{
	public static void main(String args[]) throws IOException
	{
		ArrayList<String> list=new ArrayList<String>();
		int i,j,k,ascii=32,marker=0,tokens,tokenslength;
		String content,token;
		
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		// READING STRING
		
		content=b.readLine();
		
	

		
		
		// GENERATING TOKENS.
		
		
	  	for(i=0;i<content.length();i++)
	 
		{
			if(ascii==(int)content.charAt(i))
			{
				 
				token=content.substring(marker, i);
				list.add(token);
				marker=i+1;
				
			}
			
		}
	  	
	  	token=content.substring(marker, i);
		list.add(token);
	  	
		
		tokens =list.size();
		
		
	
		int size[][]=new int[tokens][];
		
	  	
		// CALCULATING REPEATATION
		
	
		
		
		for(i=0;i<tokens;i++)
		{
			
			
				token=list.get(i);
				
				
				 tokenslength=token.length();
			
				for(j=0;j<tokenslength;j++)
				{
								
					
				
					size[i]=new int[tokenslength];
					
					
					
				
					char temp=token.charAt(j);
				
				
				
					for(k=0;k<tokenslength;k++)
					{
					
						if(temp==token.charAt(k))
						{
							size[i][j]=size[i][j]+1;
						}
					}
				
				}
			
		}
		
		//SORTING REPEATATION ARRAY FOR LARGE ELEMENT
		
		int large[]=new int[size.length];
		
		for(i=0;i<size.length;i++)
		{
			large[i]=large(size[i]);
		}
		
		System.out.println(list.get(index(large)));
		
		/*
		for(i=0;i<tokens;i++)
		{
			for(j=0;j<size[i].length;j++)
			{
				System.out.print(size[i][j]);
			}
			
			System.out.println();
		}
	  	
		*/
	}
	
	static int large(int array[])
	{
		
		int temp,i,j;
		
		
		
		for( i=0;i<array.length;i++)
		{
			
			
			for( j=i+1;j<array.length;j++)
			{
				
				
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
				
			}
		}
		
		return array[i];
		
	}
	
	static int index(int array[])
	{
		
		int temp,i,j,index;
		index=0;
		
		
		for( i=0;i<array.length;i++)
		{
			
			
			for( j=i+1;j<array.length;j++)
			{
				
				
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					index=i;
				}
				
				
			}
		}
		
		return index;
		
	}
}
