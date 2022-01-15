package LogicalProgram;

public class AddmiddleNums {

	public static void main(String[] args) {

		int num = 12345678;
		// 1+3+5=9

		int count = 0;
		int add = 0;

		while (num > 0) {

			count++;

			if (count % 2 == 0) {

				add = add + num % 10;

			}

			num /= 10;
		}
		System.out.println(add);
	}

}