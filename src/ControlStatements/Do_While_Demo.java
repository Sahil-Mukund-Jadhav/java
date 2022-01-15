
package ControlStatements;

public class Do_While_Demo {

	public static void main(String[] args) {

		System.out.println("Start");
		
		//do {
		// do block/true block
		//} while(condition); 
		
		int num=1;
		
		do {
			System.out.println(num);
			num++;//2
		}while(num<=10);
		
		System.out.println("Revers order");
		
		num=10;
		
		do {
			System.out.println(num);
			num--;
		}while(num>=1);
		
		
		System.out.println("End");
	}

}