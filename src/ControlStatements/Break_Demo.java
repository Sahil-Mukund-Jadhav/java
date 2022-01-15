package ControlStatements;

public class Break_Demo {

	public static void main(String[] args) {

		// break keyword
		// is used to break the loop or terminate the loop

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
			
			if (i == 5) {
				break;
			}

		}
		
		System.out.println("Revers");
		int num=10;
		
		while(num>=1) {
			
			System.out.println(num);
			
			if(num==5) {
				break;
			}
			
			num--;	
		}
		

	}

}