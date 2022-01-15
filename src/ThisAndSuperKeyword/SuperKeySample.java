package ThisAndSuperKeyword;

class Parent {

	// Object class is parent/super class of all java classes

	int age;

	Parent(int a){
		
		age=a;
		System.out.println("Parent constructor");
	}
	
	void m1() {
		age = 20;// this.age=20
		System.out.println("Prent m1 method " + age);// this.age

	}

}

class Child extends Parent {

	// super -
	// is used to refer imitated parent class object
	// 1 - is used to call parent class variables
	// 2 - it is used to call parent class methods
	// 3 - it is used to call parent class constructor -- it should be first statement

	String name;

//	Child() {
//		super();
//		System.out.println("child constructor");
//	}

	Child(int a) {
		super(a);
		System.out.println(name);// this.name

		System.out.println(super.age);
		super.m1();
	}

	void m2() {
		System.out.println();

	}

}

public class SuperKeySample {

	public static void main(String[] args) {

		System.out.println("START");
		Child c = new Child(10);
		System.out.println("END");
	}
}
