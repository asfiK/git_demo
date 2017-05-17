

	
	public class ClassDemo {
		static long fact=34;
		static long mul=1;
		public static void main(String[] args) {
			System.out.println(countSum(countFact(fact)));
		}
		public static long countSum(long countFact) {
			// TODO Auto-generated method stub
			long sum=0;
			long temp=countFact;
			while(temp!=0){
				if((temp%10)!=0){
					sum+=(temp%10);
				}
				temp/=10;
			}
			return sum;
		}
		public static long countFact(long fact) {
			// TODO Auto-generated method stub
			if(fact==0 || fact==1){
				return 1;
			}
			return fact*countFact(fact-1);	
		}
	}

//}
