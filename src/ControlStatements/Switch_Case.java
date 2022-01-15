package ControlStatements;

public class Switch_Case {


		public static void main(String[] args) {

			// switch(expr){
			// case expr:
			// statements
			// break;

			// case expr:
			// statements
			// break;

			// case expr:
			// statements
			// break;
			// default:
			// statements
			// break;
			// }

			
			int day = 1 ;

			//System.out.println(day);
			
			switch (day) {

			case 1:
				System.out.println("Monday");
				System.out.println("monday is good day ");
				break;

			case 2:
				System.out.println("Tuesday");
				break;

			case 3:
				System.out.println("Wednesday");
				break;

			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;

			case 6:
				System.out.println("Saturday");
				break;

			case 7:
				System.out.println("Sunday");
				break;

			default:
				System.out.println("Wrong input please enter valid day");

			}

			// ctrl+/ 
		}

	}

