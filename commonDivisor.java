import java.util.Scanner;

public class commonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, md;
		Scanner sc = new Scanner(System.in);
		System.out.print("pls input the nums:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 < num2) {
			md = num2;
			num2 = num1;
			num1 = md;
		}

		if (num1 % num2 == 0)
			System.out.printf("the common divisor is:%d", num2);
		else {
			for (i = num2 - 1; i > 0; i--) {
				if ((num1 % i == 0) && (num2 % i == 0)) {
					System.out.printf("the common divisor is:%d", i);
					break;
				}

			}
		}

	}
}