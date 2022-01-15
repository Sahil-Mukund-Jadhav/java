package Polymorphism;

public class Sample_1 {

	// return type does not affect of method overloading
	// static method can be overloaded
	// private method can be overloaded
	// final methods can be overloaded

	// we can overload constructor methods by different args

	Sample_1() {
		System.out.println("constructor without args");
	}

	Sample_1(int a) {
		System.out.println("constructor with args ="+a);
	}

	// automatic promotion 
	//  byte >> short >> int >> long >>
	//  char>> int
	void print() {
		System.out.println("print(short s) =");
	}

	void print(long a) {
		System.out.println("print(int a) =" );
	}

	public static void main(String[] args) {

		Sample_1 obj = new Sample_1(10);

		
		Sample_1 obj2 = new Sample_1();
		System.out.println();
		
		short ss=65;
		obj2.print(ss);
		
	}

}
