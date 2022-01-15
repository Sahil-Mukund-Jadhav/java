package LogicalProgram;

public class Even_Odd_1_100 {

	public static void main(String[] args) {

		System.out.println("Even or odd numbers till 100");
		
		for (int num = 2; num <= 100; num++) {

			if (num % 2 != 0) {
				System.out.println(num);
			}
		}

	}

}