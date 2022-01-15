package ControlStatements;

public class Continue_Demo {

	public static void main(String[] args) {

		// continue - it will skip one iteration of loop

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				System.out.println();
				continue;
			}
			System.out.println(i);
		}

		System.out.println("while");
		
		int num = 0;

		while (num < 10) {
			num++;
			
			if (num == 5) {
				System.out.println("");
				continue;
			}
			System.out.println(num);
		}

	}

}