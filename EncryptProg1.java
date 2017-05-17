
public class EncryptProg1 {		
		public static void main(String[] args) 
		{
			String plainText="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
			String pt[]=plainText.split(" ");		// stores the plainText removing the spaces
			
			String alphabet="ABCDEFGHIJKLMNOPQRSTUVXYZ";
			
			char[] ap = alphabet.toCharArray();  // change string to array
			
			int ptLen=pt.length;
			char cipherText[]=new char[ptLen];  // encrypted text which is empty as of now
			int i=0; 		// i stores index of pt[]
			while(i<pt.length)
			{				
				int j=0;
				char temp[]=pt[i].toCharArray();  //converts each individual string element to character
				 	// to hold the index of a character in temp[i]
				int c=0;
				//System.out.println(temp[j]);
				
				while(j<temp.length)
				{
					//System.out.println(temp[j]);
					int k=0; // stores index of ap[]
					while(temp[j]!= ap[k])
					{						
						k++;
					}
					// k has the index matching value of temp[i]
					// here temp[j] is equal to ap[k]
					int m=k; // copy value of k to m , we r going to manipulate m and not k
					int count=0;  // count is used to keep track of 23 right shifts
					while(count < 23)
					{
						if(m>ap.length-1)
						{
							m=0;  // m again begins from ap[0]
						}
						else
						{
							m++;
						}
						count++;						
					}					
					// here m has the value of the encrypted character 
					cipherText[c]=ap[m]; // copy the encrypted value at m to cipherText		
					System.out.println(cipherText[c]);
					c++;
					j++;
				}
				i++; 		// increment and goto next string in pt[]
			}
			System.out.println("PLAIN TEXT: "+plainText);
			System.out.println("CIPHER TEXT: ");
			for(int l=0;l<cipherText.length;l++)
			{
				System.out.print(cipherText[l]);
			}
			
		}		
	
}

