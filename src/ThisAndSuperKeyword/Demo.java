package ThisAndSuperKeyword;

class A {

	A(int e) {
		System.out.println("A class const");
	}
}

class B extends A {

	B(int c) {
		super(c);
		System.out.println("B class const");
	}
}

public class Demo {

	public static void main(String[] args) {

		System.out.println("Main method");

		B obj = new B(10);
	}

}
