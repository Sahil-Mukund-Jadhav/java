package Inheritance.MethodsDemo;


public class Student_Data {

	
	// execution of java Program
	// -1 Compilation
	// check the syntax of code 
	// -2 Interpretation / execution
	// - line by line execute 
	
	//-- Java is a platform independent
	
	// JDK - java Development Kit
	// JRE + Base Libraries
	
	
	
	int rollNo;
	String name;

	static String standerds = "9th Stand";
 
	static void display() {

	}

	public static void main(String[] args) {

		Student_Data std1 = new Student_Data();
		//std1=null;
		std1.rollNo = 101;
		std1.name = "Ramesh";
		standerds = "10 th";

		System.out.println(std1.rollNo);
		System.out.println(std1.name);
		System.out.println(standerds);

		Student_Data std2 = new Student_Data();
		std2.rollNo = 102;
		std2.name = "Suresh";

		display();
		System.out.println(std2.rollNo);
		System.out.println(std2.name);
		//System.out.println(std2.standerds);

		Student_Data std3 = new Student_Data();
		System.out.println(std3.rollNo);
		System.out.println(std3.name);
	}

}
