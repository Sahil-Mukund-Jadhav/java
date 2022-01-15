package Inheritance.MethodsDemo;


public class Demo_Return {

	//return type-
	// after completion of method task if it is giving a result of a type is known as return type
	// void- is returning nothing
	
	
	static int addOfSub(int sub1, int sub2, int sub3) {
		int sum=sub1+sub2+sub3;
		//System.out.println("addOfSub() ="+sum);
		return sum;
	}
	
	
	String fullName(String fN, String lN) {
		return (fN+ " " +lN);
	}
	// calculate the area of circle == 3.14*r*r;
	public static void main(String[] args) {

		
		int totle_Marks=0;
		//<<<<<<<<<<<<<<<<
		totle_Marks =addOfSub(35, 45, 55);
		
		System.out.println(totle_Marks/3);
		
		totle_Marks=addOfSub(75, 65, 85);
		
		System.out.println(totle_Marks);
		
		System.out.println();
		
		Demo_Return obj=new Demo_Return();
		
		String name = obj.fullName("Ram", "Kumar");
		
		System.out.println(name);
		
	}

}
