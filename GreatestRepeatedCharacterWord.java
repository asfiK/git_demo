
public class GreatestRepeatedCharacterWord {
	 //public static void main(String[] args) {
		/*String s="Coderbyte is cool";
		String output="";
		int count=0;
		String[] words=s.split("\\s+");
		System.out.println( words);
		for (int i=0;i<words.length;i++){
			for(int j=0;j<words[i].length();j++){
				for(int k=1;k<words[i].length();k++){
					char temp=words[i].charAt(k);
					if(temp==words[i].charAt(k-1)){
						count++;
						System.out.println(count);
					}
				}
				
			}
		}
	}	
}*/
		
	static int maxChar(String word){
			int chars[]=new int[200];
			int max=0;
			for(char c:word.toCharArray()){
				chars[c]++;
				if(chars[c]>chars[max]){
					max=c;
				}
			}
			return chars[max];
		}
		
		
		public static void main(String[] args) {
			
		int maxNoCh=0;
		String output="";
		String s="see else effecte";
		
		String[] words=s.split("\\s+");
		for(String word:words){
			int c=maxChar(word);
			if(c>maxNoCh){
				maxNoCh=c;
				output=word;
			}
		}
	if(maxNoCh>1)
		System.out.println(output);		
}
	}