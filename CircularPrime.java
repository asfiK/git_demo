import java.util.Random;

// All good, but 13 and 31 are counted twice.


public class CircularPrime {
	static Integer digits[]={0,0,0,0,0,0};
	static int sum=0,length=0,total=0;
	
	public static void main(String[] args) {
		Random random=new Random();
		for(int i=1;i<1000000;i++){
			CircularPrime.generateDigits(i);
			// random.nextInt(7);
			// Even if I take random nos less than 7 to generate different rotations, they won't be distinct
//			//all rotations for 6 digit no; i.e. <1000000
//			// d1 d2 d3 d4 d5 d6 
//			// d2 d3 d4 d5 d6 d1
//			// d3 d4 d5 d6 d1 d2
//			// d4 d5 d6 d1 d2 d3
//			// d5 d6 d1 d2 d3 d4
//			// d6 d1 d2 d3 d4 d5
			int flag=0;
			Integer nos[]={197,197,197,197,197,197};
			if(length==6){
				nos[0]=100000*digits[0]+10000*digits[1]+1000*digits[2]+100*digits[3]+10*digits[4]+digits[5];
				nos[1]=100000*digits[1]+10000*digits[2]+1000*digits[3]+100*digits[4]+10*digits[5]+digits[0];
				nos[2]=100000*digits[2]+10000*digits[3]+1000*digits[4]+100*digits[5]+10*digits[0]+digits[1];
				nos[3]=100000*digits[3]+10000*digits[4]+1000*digits[5]+100*digits[0]+10*digits[1]+digits[2];
				nos[4]=100000*digits[4]+10000*digits[5]+1000*digits[0]+100*digits[1]+10*digits[2]+digits[3];
				nos[5]=100000*digits[5]+10000*digits[0]+1000*digits[1]+100*digits[2]+10*digits[3]+digits[4];
			}else if(length==5){
				nos[0]=10000*digits[0]+1000*digits[1]+100*digits[2]+10*digits[3]+digits[4];
				nos[1]=10000*digits[1]+1000*digits[2]+100*digits[3]+10*digits[4]+digits[0];
				nos[2]=10000*digits[2]+1000*digits[3]+100*digits[4]+10*digits[0]+digits[1];
				nos[3]=10000*digits[3]+1000*digits[4]+100*digits[0]+10*digits[1]+digits[2];
				nos[4]=10000*digits[4]+1000*digits[0]+100*digits[1]+10*digits[2]+digits[3];
				nos[5]=0;
			}
			else if(length==4){
				nos[0]=1000*digits[0]+100*digits[1]+10*digits[2]+digits[3];
				nos[1]=1000*digits[1]+100*digits[2]+10*digits[3]+digits[0];
				nos[2]=1000*digits[2]+100*digits[3]+10*digits[0]+digits[1];
				nos[3]=1000*digits[3]+100*digits[0]+10*digits[1]+digits[2];
				nos[4]=0;
				nos[5]=0;
			}
			else if(length==3){
				nos[0]=100*digits[0]+10*digits[1]+digits[2];
				nos[1]=100*digits[1]+10*digits[2]+digits[0];
				nos[2]=100*digits[2]+10*digits[0]+digits[1];
			}else if(length==2){
				nos[0]=10*digits[0]+digits[1];
				nos[1]=10*digits[1]+digits[0];
			}else if(length==1){
				nos[0]=digits[1];
			}
			
			if(!CircularPrime.checkForPrime(nos[0])){
				//System.out.println("1");
				flag=1;
			}else if(!CircularPrime.checkForPrime(nos[1])){
				//System.out.println("2");
				flag=1;
			}else if(!CircularPrime.checkForPrime(nos[2])){
				//System.out.println("3");
				flag=1;
			}else if(!CircularPrime.checkForPrime(nos[3])){
				//System.out.println("4 "+nos[3]);
				flag=1;
			}else if(!CircularPrime.checkForPrime(nos[4])){
				//System.out.println("5");
				flag=1;
			}else if(!CircularPrime.checkForPrime(nos[5])){
				//System.out.println("6");
				flag=1;
			}
			if(flag!=1)
				total++;
			length=0;
		}
		
		System.out.println("Total number of Circular Prime less than 1000000 are : "+total);
		System.out.println("Approx. Since nos like 13 and 31 are counted twice.");
//		if(CircularPrime.checkForPrime(no)==true)
//		{
//			System.out.println("Prime!!!");
//			System.out.println(length);
//			for (int i = 0; i <digits.length; i++) {
//				System.out.println(digits[i]+" "+i);
//				//fact=fact*i;
//			}
//			System.out.println(CircularPrime.checkForPrime(197));
//			//System.out.println(fact);

//			
//			Random rand=new Random();
//			int o =(rand.nextInt(7)+1);
//			
//		}
	}
	
	
	private static boolean checkForPrime(int no) {
		int sum=0;
		if(no%2==0) 		// If even, then it is definitely not prime. **Skip other Calculations**
		{
			return false;
		}else {				// Prime No = sum of digits divisible by 3 (Test of prime)
			while(no>0)
			{
				//System.out.println(no%10);
				//System.out.println(digits[i]+" "+i);
				sum=sum+(no%10);
				no=no/10;
			}
			if(sum%3==0){
				return false;
			}
		}
		return true;
	}
	private static void generateDigits(int no) {
		while(no>0)
		{
			//System.out.println(no%10);
			//System.out.println(digits[i]+" "+i);
			digits[length]=(no%10);
			no=no/10;
			length++;
		}
	}

}
