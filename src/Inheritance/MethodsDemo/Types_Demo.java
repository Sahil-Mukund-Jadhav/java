package Inheritance.MethodsDemo;

public class Types_Demo {
	
	//inner class / nested class
	static class Employee{
		
	}

	// Method Types
	
	//1 main method
	// main method is a starting point of our program and compile search for main method first
	
	// static keyword
	// - mainly used for memory management purpose
	// - it shows common properties to all object
	// - memory allocated to static things at compilation time
	// - we do not need any object to call static things
	// - it can be used with variable, methods or block and can declares inner class is static
	
	//2 user defined method	
	// if a programmer adds its own method inside the class then its a user defined
	
				// static methods
				// non static methods
	
	//syntax
	//access-specifier returnType methodname(arguments){}
	
	//returnType methodname(){}
	
	static void display() {
		System.out.println("Static display()");
	}
	
	void print() {
		System.out.println("Print()");
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		
		//same class 
		
		// static method >> directly
		display();
		
		//non-static 
		// create object >> obj.method();
		Types_Demo obj=new Types_Demo();
		obj.print();
		
		// other class
		// static >> ClassName.method();
		Calculator.add();
		
		//non-static 
		// create object >> obj.method();
		
		Calculator obj2=new Calculator();
		
		obj2.sub();
	}
	

}
