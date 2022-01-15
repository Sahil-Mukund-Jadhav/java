package Inheritance.MethodsDemo;

public class Calculate_Area_of_circle {

	
	static double findArea(int r) {
		double area=3.14*r*r;
		return area;
	}
	
	
	public static void main(String[] args) {

		int rad=2;
		double totle = findArea(rad);
		System.out.println("If r = "+rad+" then area of cercle is ="+totle);
	}

}
