package LogicalProgram;

public class ReverseMiddle {

	public static void main(String[] args) {

		int num=12345;
		System.out.println(num);
		//      14325
		
		int last=num%10;
		System.out.println("Last num ="+last);
		int num2=num/10;
		System.out.println("Letest num ="+num2);
		int rev=0;
		
		int count=0;
		
		while(num2>9) {
			
			rev=rev*10+(num2%10);
			count++;
			num2 /=10;
		}
		System.out.println("num 2 ="+num2);
		System.out.println("Revers num = "+rev);

		System.out.println("Count is ="+count);
		
		
		while(count+1>0) {
			num2=num2*10;
			count--;
		}
		
		int result=num2+rev*10+last;
		System.out.println(result);
	
		
	}

}