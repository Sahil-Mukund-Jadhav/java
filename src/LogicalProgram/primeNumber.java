package LogicalProgram;

public class primeNumber {

	public static void main(String[] args) {

		int num=29;
		int mid=num/2;
		
		System.out.println(mid);
		
		boolean flag=true;
		
		for(int i=2; i<=mid;i++) {
			
			if(num%i==0) {
				flag=false;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}
	}

}