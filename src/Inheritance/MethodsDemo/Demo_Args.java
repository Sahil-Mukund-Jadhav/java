package Inheritance.MethodsDemo;

public class Demo_Args {

	
	void add(){
		System.out.println("Add of two num 30+20= "+ (30+20));
	}
	
	void add_1(int firstNum) {
		int sum=firstNum+20;
		System.out.println("Add of "+firstNum+"+20 = "+ sum);
	}
	
	void add_2(int fNo, int sNo) {
		int totle=fNo+sNo;
		System.out.println("Addition Of "+fNo+"+"+sNo+"="+totle);
	}
	
	void add_3(int fNo, int sNo, int tNo) {
		//int totle=fNo+sNo+tNo;
		System.out.println("Addition Of "+fNo+"+"+sNo+"+"+tNo+"="+(fNo+sNo+tNo));
	}
	
	void fullName(String fName, String lName) {
	
		String full=fName+" "+lName;
		
		System.out.println("Full Name is "+full);
	}
	
	
	public static void main(String[] args) {

		Demo_Args obj=new Demo_Args();

		obj.add();
		
		System.out.println();
		
		obj.add();
		
		obj.add_1(30);
		System.out.println();
		
		obj.add_1(80);
		System.out.println();
		
		obj.add_2(40, 20);
		System.out.println();
		
		obj.add_3(320, 130, 440);
		
		System.out.println();
		
		obj.fullName("Ramesh", "Rathod");
	}

}
