package Polymorphism;

public class MethodOverriding_Main {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.add(10);
		p.sub();
		
		System.out.println();
		
		Child c=new Child();
		c.add(20);
//		c.add();
		c.sub();
		c.display();
		
	}
}
