package Variables;

public class typeofvar {

	//2. instance variable /globel variable
	// are declare inside the class and outside the blocks(methods)
	
	String lang="Java";
	int abc=440;
	
	//3. static variable / class variable 
	// those variable are declare with static keyword 
	
	static String comName="Infosys";
	
	public static void main(String[] args) {

		//1. local variable /block variable
		// this variable are declare and used only inside the block
		
		int age=35;
		System.out.println(age);
		age=40;
		System.out.println("updatesd age "+ age);
		
		// to call the instance variable we need to create an object of class
		//System.out.println(lang);
		
		System.out.println(comName);
		
	}
	
	void display() {
		
		//System.out.println(age);//local variable form main()
	    String deptName="IT";
		System.out.println(deptName);
		System.out.println(lang);
		System.out.println(abc);
		
		System.out.println(comName);
	}

}