package LogicalProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=407;
		System.out.println("num ="+num);
		int temp=num;
		
		int arm=0;
		
		while(temp>0) {
			
			int rem=temp%10;
			arm= arm +(rem*rem*rem);
			
			temp /=10;
		}
		
		System.out.println("arm ="+arm);
		
		if(num==arm) {
			System.out.println(num + " is armstrong number");
		}else {
			System.out.println(num + " is not armstrong number");
		}
	}

}