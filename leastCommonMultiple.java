import java.util.Scanner;

public class leastCommonMultiple {
	public static void swap(int[] numnum, int i, int j) {
		int temp = numnum[i];
		numnum[i] = numnum[j];
		numnum[j] = temp;
	}

	public static void bubbleSort(int[] numnum) {
		for (int i = 0; i < numnum.length - 1; i++)
			for (int j = 0; j < numnum.length - i; j++) {
				if (numnum[i] < numnum[i + 1])
					swap(numnum, i, i + 1);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums = 0, md, re = 1, mult = 1;
		System.out.println("how many nums do you want to enter?");
		Scanner sc = new Scanner(System.in);
		nums = sc.nextInt();
		int[] numnum = new int[nums];
		for (int m = 0; m < nums; m++)
			numnum[m] = sc.nextInt();

		if (nums == 2) {
			System.out.print("pls enter them:");
			bubbleSort(numnum);

			if (numnum[0] % numnum[1] == 0)
				System.out.printf("the num1 least common multiple is :%d", numnum[0]);
			else {
				for (int i = 2; i < numnum[1]; i++) {
					while ((numnum[0] % i == 0) && (numnum[1] % i == 0)) {
						numnum[0] = numnum[0] / i;
						numnum[1] = numnum[1] / i;
						mult = mult * i;
						// System.out.printf("the least common multiple is :%d",
						// mult);
						re = numnum[0] * numnum[1] * mult;
					}
				}
				System.out.printf("the re1 least common multiple is :%d", re);
			}
		} else if (nums == 3) {
			System.out.print("pls enter them:");
			bubbleSort(numnum);
			if ((numnum[0] % numnum[2] == 0) && (numnum[1] % numnum[2] == 0))
				System.out.printf("the num11 least common multiple is :%d", numnum[0]);
			else {
				for (int i = 2; i < numnum[2]; i++) {
					while ((numnum[0] % i == 0) && (numnum[1] % i == 0) && (numnum[2] % i == 0)) {
						numnum[0] = numnum[0] / i;
						numnum[1] = numnum[1] / i;
						numnum[2] = numnum[2] / i;
						mult = mult * i;
						// System.out.printf("the least common multiple is :%d",
						// mult);
						re = numnum[0] * numnum[1] * numnum[2] * mult;
					}
				}
				System.out.printf("the re2 least common multiple is :%d", re);

			}

		} else if (nums == 4) {
			int x = 0;
			bubbleSort(numnum);
			if ((numnum[3] % numnum[0] == 0) && (numnum[2] % numnum[0] == 0) && (numnum[1] % numnum[0] == 0))
				System.out.printf("the numnum[]least common multiple is :%d", numnum[0]);
			else {
				for (int i = 2; i <= numnum[0]; i++) {
					while ((numnum[3] % i == 0) && (numnum[2] % i == 0) && (numnum[1] % i == 0)
							&& (numnum[0] % i == 0)) {
						numnum[3] = numnum[3] / i;
						numnum[2] = numnum[2] / i;
						numnum[1] = numnum[1] / i;
						numnum[0] = numnum[0] / i;
						mult = mult * i;

						re = numnum[3] * numnum[2] * numnum[1] * numnum[0] * mult;
						x++;
					}
				}
				if (x == 0)
					System.out.printf(" the numnum[4]least common multiple is :%d",
							numnum[0] * numnum[1] * numnum[2] * numnum[3]);
				else
					System.out.printf("the re3 least common multiple is :%d", re);

			}

		}

	}

}
