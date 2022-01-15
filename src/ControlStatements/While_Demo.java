package ControlStatements;

public class While_Demo {

	public static void main(String[] args) {

		// 1 while loop

		// while(condition){
		// true block / conditional block
		// break point/ increment- decrement
		// }

		System.out.println("START");

		int count = 1;

		while (count <= 5) { // 6<=5
			System.out.println(count);// 1 2 3 4 5
			count++;
		}

		System.out.println("Revers order");
		
		count = 5;
		
		while(count>=1) {
			System.out.println(count);
			count--;
		}
		
	
		System.out.println("Only even numbers in 20");

		count=1;
		while (count <= 20) { // 6<=5

			if (count % 2 == 0) {
				System.out.println(count);
			}
			count++;
		}

		System.out.println("END");
	}

}
