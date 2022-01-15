package Polymorphism;

public class Calculator {
	
	//1 Number of args
	
	void add() {
		System.out.println("1. Addition of two nos 30+20="+(30+20));
	}
	
	void add(int a) {
		System.out.println("2. Addition of two nos "+a+"+20="+(a+20));
	}
	
	void add(int a, int b) {
		System.out.println("3. Addition of two nos "+a+"+"+b+"="+(a+b));
	}

	void add(int a, int b, int c) {
		System.out.println("4. Addition of three nos "+a+"+"+b+"+"+c+"="+(a+b+c));
	}
	
	//types of args
	
	void add(String fName, String lname) {
		System.out.println(fName+" "+lname);
	}
	
	void add(int a, double b) {
		System.out.println("6. Addition of two nos "+a+"+"+b+"="+(a+b));
	}
	
	// sequence if args
	
	void add(double a, int b) {
		System.out.println("7. Addition of two nos "+a+"+"+b+"="+(a+b));
	}
	
	
	public static void main(String[] args) {

		Calculator obj=new Calculator();
		
		obj.add();
		
		obj.add(20);
		
		obj.add(40, 60);
		
		obj.add(10, 20, 30);
		
		obj.add("Ramesh", "Suresh");
		
		obj.add(10,20.03);
		
		obj.add(25.75, 35);
	}

}
