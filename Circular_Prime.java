
public class Circular_Prime {
  
	//function to check if a number is prime or not
	
	static boolean numIsPrime(long num){
		
		//initializing a variable to keep track of prime status 
		boolean prime = false;
		
		//logic to check if number passed to the method is prime or not
		if (num == 2){
			prime = true;
		}
		else if (num % 2 == 0)
		{
			prime = false;
	    }
		else{
			
			for(int j = 3; j<= Math.sqrt(num); j++)
			{   if (num % j == 0)
			     {    prime = false; }
			}
		}
	
		return prime;
  }
	
	
	public static void main(String[] args){
		int count = 0, prime_count = 0;
		
		//running a loop till 1 million and passing each number to the function defined above
		for (long i = 2; i < 100; i++)
		{
			if (numIsPrime(i)) // if condition is true, i.e., number is prime
			{ 
			  prime_count++;
			  String num = i +" ";
			  boolean a = false;
			  String temp = num;
			  
			  //loop to interchange position of the digits of the number    
			  for (int j = 0; j < num.length(); j++){
			 	 
				       temp = temp.charAt(temp.length() - 1) + temp;
				       temp = temp.substring(0, temp.length() - 1);
				
				       //checking condition for circular prime
				       if (! numIsPrime(Long.parseLong(temp))){
				           	  a = false;
					          break;
				        }
				      else {  a = true; } 
			      }
			  
		    if (a) { count++; }
		  }
	 }
		//displaying results
		System.out.println("There are "+prime_count+" numbers under 1 million that are circular prime!");		
	}
}
