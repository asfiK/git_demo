
public class Percentage {
	public static void main(String[] args) {
		
	
	String test="Hello World @123 ``#&";
	int length = test.length();
	int upperCase = 0;
	int lowerCase = 0;
	int digits = 0;
	int characters = 0;
	
	for(int i=0; i<test.length(); i++){
		int a=test.charAt(i);
		if("A" <= a >="Z"){
			upperCase++;
		}else if('a'<= a>='z'){
			lowerCase++;
		}else if('0' <= a >='9'){
			digits++;
		}else{
			characters++;
		}
	}
	System.out.println("%UP ="+(upperCase/length)*100+" %LP ="+(lowerCase/length)*100+" %Digits ="+(digits/length)*100+" %char ="+(characters/length)*100);
	
	}

}
