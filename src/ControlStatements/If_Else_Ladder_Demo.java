package ControlStatements;

public class If_Else_Ladder_Demo {

	public static void main(String[] args) {
		
		//3 if else ladder 
		
		// if(1 st condition){
		//   true block
		//} else if(2nd condition){
		// true block
		// }else if(3rd condition){
		//........
		//} else { last false block}
		
		int marks=25;
		
		if(marks>=65) {
			System.out.println("Subject pass with first class");
		}else if(marks>=35) {
			System.out.println("Subject is pass");
		}else {
			System.out.println("Subject is failed yessss!!!! Party");
		}
		
		
		//other if block 
		if(marks>15) {
			System.out.println("Distincsion");
		}
		
	}

}
