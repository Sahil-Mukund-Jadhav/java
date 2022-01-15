package ThisAndSuperKeyword;

public class Student {

	// this - is used to refer a current class object
	// 1 - it is used to call / refer current class variables
	// 2- is used to call call current class methods
	// 3- it is used to call current class constructor (another constructor)
	// - this() call must be inside any constructor method as well as it should be
	// a first statement

	// 4- It can be passed as argument to the method
	// 5- it can be return statement inside the method
	// 6- it can passed as args to constructor

	
	int rollNo;
	String name;

	Student() {
		System.out.println("Const() called");
	}

	Student(int rollNo, String name) {
		this();
		this.rollNo = rollNo;
		this.name = name;

		print();
		demo(this);

		Student obj = getStudentObj();
		System.out.println(obj.rollNo);
		System.out.println(obj.name);
	}

	Student(Student s6) {
		System.out.println("const with obj");
	}

	void print() {
		System.out.println(rollNo);// this.rollNo
		System.out.println(name);// this.name

		Student s7 = new Student(this);
	}

	void setData(int rollNo, String name) {

		this.rollNo = rollNo;
		this.name = name;

		print(); // this.print();

	}

	void demo(Student s4) {
		System.out.println(s4.rollNo);
		System.out.println(s4.name);
	}

	Student getStudentObj() {
		System.out.println("set obj");
		return this;
	}

	public static void main(String[] args) {

//		Student s1=new Student();
//		
//			
//		s1.setData(102,"Mahesh");
//		

		Student s2 = new Student(102, "Suresh");
		s2.print();

	}

}
