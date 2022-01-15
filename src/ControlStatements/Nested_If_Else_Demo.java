package ControlStatements;

public class Nested_If_Else_Demo {

	public static void main(String[] args) {

		// if(condition){
		// true block
		// if(condition){
		// true block
		// }
		// }else{
		// false block
		// if(condition){
		// true block
		// }
		// }

		int marks = 20;

		if (marks >= 65) {

			System.out.println("Subject is pass and got first class");

			if (marks >= 75) {
				System.out.println("and with distinction");
			}
			
		} else {

			if (marks >= 35) {
				System.out.println("Subject is pass");
			}else {
				System.out.println("Subject is failed");
			}

		}

	}

}
