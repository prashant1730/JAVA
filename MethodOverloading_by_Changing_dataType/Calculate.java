package com.MethodOverloading_by_Changing_dataType;

public class Calculate {
	void sum(int a, int b) {
		System.out.println("Sum is: " + (a + b));
	}

	void sum(float a, float b) {
		System.out.println("Sum  is: " + (a + b));
	}

	public static void main(String[] args) {
		Calculate obj = new Calculate();
		obj.sum(15, 25);
		obj.sum(15.75f, 25.25f);
	}
}
