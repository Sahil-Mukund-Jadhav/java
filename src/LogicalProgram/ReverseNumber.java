package LogicalProgram;

public class ReverseNumber {

	public static void main(String[] args) {

		int num=543211234;
		//      54321
		System.out.println(num);
//		System.out.println(num/10);//1234
//		System.out.println(num%10);//5
		
		int rev=0;
		
		while(num>0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		
		System.out.println(rev);
	}

	//input= 1234567
	//op=    1654327
	
	//input= 1234567
	//op=    2+4+6=12
	
}