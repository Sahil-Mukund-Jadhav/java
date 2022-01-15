package Operators;

public class operators {

	public static void main(String[] args) {

		// 1 Arithmetic Operator
		// +, -, /, *, % (Modules / mod)

		int a = 30;
		int b = 10;
		int c = 4;

		System.out.println(a + b);// 30
		System.out.println(a - b);// 10
		System.out.println(a * c);// 120
		System.out.println(a / c);// 7

		System.out.println(a % c);// 2

		System.out.println();
		// 2 unary operator

		// ++ , --
		// increment or decrement
		// post fix pre fix
		// expr++ ++expr

		// ==>>>>>>>>>>>>>>
		// a++ == a+1
		// a-- == a-1
		System.out.println(a++);// 30
		System.out.println(a);// 31

		System.out.println(b--);// 10
		System.out.println(b);// 9

		System.out.println(++c);// 5
		System.out.println(--a);// 30

		// syso = ctrl+space = enter

		System.out.println();

		// 3 relational operators o/p= boolean

		// <, > , >=, <=, ==, !=

		a = 30;
		b = 20;

		System.out.println(a < b);// false
		System.out.println(a > b); // true
		// a=20;
		System.out.println(a >= b);// true
		// a=10;
		System.out.println(a <= b);// false
		a = 20;
		System.out.println(a == b);// true

		System.out.println(a != b);// false

		System.out.println();
		
		// 4 Assignment operator
		// short hand operators

		// =, +=, -=, *=, /=, %=

		int xyz = 20;
		System.out.println(xyz);
		// <<<<<<<<<<<<==

		// xyz=xyz+2;

		xyz += 25;

		System.out.println(xyz);// 45

		// xyz= xyz-5;
		xyz -= 5;

		System.out.println(xyz);// 40
		// xyz=xyz*2;
		xyz *= 2;

		System.out.println(xyz);// 80

		xyz /= 4;

		System.out.println(xyz); // 20

		//xyz =xyz %7;
		xyz %= 7;

		System.out.println(xyz);//6
		
	}

}
