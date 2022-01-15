package ClassAndObjectDemo;

public class Animal {

	// variables
	// methods
	// blocks
	// inner class

	String name;
	int age;

	void eat() {
		System.out.println("eating");
	}

	void run() {
		System.out.println("running");
	}

	static String owner = "Rajesh";

	public static void main(String[] args) {

		// object

		// ClassName variableName=new ClassConstructor();
		// if we want to call any non static thing inside the static block
		// then we need to create an object

		System.out.println("Start");

		Animal cat = new Animal();

		cat.name = "Tom";
		cat.age = 2;

		System.out.println(cat.name);
		System.out.println(cat.age);
		cat.eat();
		cat.run();
		owner = "Suresh";
		
		System.out.println(owner);

		System.out.println("Dog object section");
		
		
		Animal dog = new Animal();

		dog.name = "Doggy";
		dog.age = 5;

		System.out.println(dog.name);
		System.out.println(dog.age);

		dog.eat();
		dog.run();

		System.out.println();
		// System.out.println(dog.owner);
	}

}