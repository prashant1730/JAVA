package Example1;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		int A;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int A1 = sc.nextInt();
		if (A1 > 0) {
			System.out.println("Number is Positive");
		} else if (A1 < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}

	}
}
