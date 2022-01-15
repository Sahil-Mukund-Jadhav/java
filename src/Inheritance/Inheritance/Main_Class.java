package Inheritance.Inheritance;

public class Main_Class {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		System.out.println(p.age_of_p);
		p.home();
		p.car();
		p.age_of_p=40;
		
		Child c=new Child();
		System.out.println(c.age_of_child);
		c.bike();
		c.age_of_child=40;
		
		System.out.println();
		// after inheritance operation
		Child obj=new Child();
		
		System.out.println(obj.age_of_p);//parent
		System.out.println(obj.age_of_child);
		obj.home();//parent
		obj.car();//parent
		obj.bike();
		
		obj.age_of_p=50;
		obj.age_of_child=20;
		
		
		
	}

}
