package Example1;

import java.util.Scanner;

public class TriedNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0;

		System.out.println("Input First  Number: ");
		int num1 = sc.nextInt();

		if (A > num1) {
			System.out.println("Number is Negative");
		} else if (A < num1) {
			System.out.println("Number is Positive");
		}

		else {
			System.out.println("Number is zero");

		}
	}

}
