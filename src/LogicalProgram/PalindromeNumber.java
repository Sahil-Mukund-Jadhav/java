package LogicalProgram;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num=121;
		
		int temp=num;
		
		int rev=0;
		
		while(temp>0) {
			
			rev=rev*10+(temp%10);
			temp /= 10;
		}
		
		System.out.println(rev);
		
		if(num==rev) {
			System.out.println(num+" is Palindrome number");
		}else {
			System.out.println(num+" is not Palindrome number");
		}
		
	}

}