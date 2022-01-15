package Inheritance.MethodsDemo;

public class Demo_1 {

	// Methods in java
	// - is a set code which combinly used to perform a certain task. 
	// - code re-usability and code optimization
	// it is a collection for statements which is used to perform a task and take desired op
	
	
	
	//acsess-spacifier  returnType methodname(arguments){}
	
	// returnType methodname(){}
	
	void buyFromShop(String material) {
		System.out.println("Pickup a bag");
		System.out.println("Checked wallet");
		System.out.println("ware a mask");
		System.out.println("Went for shopping");
		System.out.println("Done perchesed = "+material);
	}
	
	void add() {
		System.out.println("Addition of two num 30+20 = "+(30+20));
	}
	
	public static void main(String[] args) {

		System.out.println("Buy milk");
		
		Demo_1 obj=new Demo_1();
		obj.buyFromShop("milk");
		
		System.out.println();
		System.out.println("Buy Suger");
		obj.buyFromShop("Suger");
		
		System.out.println();
		
		obj.add();
		System.out.println("END");
		obj.add();
	}

}
