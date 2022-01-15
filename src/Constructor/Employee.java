package Constructor;

public class Employee {

	int eId;
	String name;
	String email;

	// constructor- is a special member/ method of a class which is used to
	// Initialize the state(variables) of an object

	// 1 default constructor
	// - if programmer does not add any constructor method in its program then
	// compiler adds its own constructor method and execute the program

//	 Employee() {
//  	super();
//		 	//default constructor
//	}

	// 2 user defined constructor
	// if programmer adds a constructor method in its program then it called as
	// user defined constructor

	// to create a constructor we need to follow 2 rules
	//1 - constructor name should be same as class name
	//2 - constructor does not have any explicit return type hence it not return any
	// value

	// types of user defined constructor
	// 1- no argument constructor/ zero parameter constructor
	// 2- with argument constructor / parameterize constructor

	//no argument constructor
//	Employee() {
//		System.out.println("This is a constructor");
//	}
	
	//with argument constructor
	
	Employee(int id, String n, String e) {
		System.out.println("any imp tast done at object creation");
		eId = id;
		name = n;
		email = e;
	}

	 Employee(int id, String n) {
		 eId=id;
		 name=n;
	 }
	
//	void setDataofEmp(int id, String n, String e) {
//		eId = id;
//		name = n;
//		email = e;
//	}

	public static void main(String[] args) {

		

		Employee emp1=new Employee(101, "Ramesh", "ramesh@emp.com");
		System.out.println(emp1.eId +" "+ emp1.name+" "+emp1.email);
		
		Employee emp2=new Employee(102,"Suresh");
		System.out.println(emp2.eId +" "+ emp2.name);
		
		
		Employee emp3=new Employee(103, "Mahesh", "mahesh@emp.com");
		System.out.println(emp3.eId +" "+ emp3.name+" "+emp3.email);
//		
//		Employee emp4=new Employee();
//		emp4.setDataofEmp(104, "Mangesh", "mangesh@emp.com");
//		System.out.println(emp4.eId +" "+ emp4.name+" "+emp4.email);

	}

}