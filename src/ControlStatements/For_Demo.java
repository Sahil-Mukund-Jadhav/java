package ControlStatements;

public class For_Demo {

	public static void main(String[] args) {

		// for(variable init ; condition ; increment /decrement ){
		// for block / true
		// }
		// 1 .. variable init num=1
		// 2 .. it will check the condition
		// if condition is true then it will execute the for block
		// 3 .. Increases or decreases using ++ , --
		// 4 .. 2 step .. 3 step

		for (int num = 1; num <= 10; num++) {
			System.out.println(num);
		}

		System.out.println("Revers order");

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

//		int j=1;
//		for(;;) {
//			System.out.println(j++);
//		}

		// to format the code ctrl+shift+f key

	}

}
