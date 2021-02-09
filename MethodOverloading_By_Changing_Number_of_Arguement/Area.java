package com.MethodOverloading_By_Changing_Number_of_Arguement;

public class Area {
	void area(int l, int b) {
		System.out.println("Areaa is: " + (l * b));
	}

	void area(int l, int b, int h) {
		System.out.println("Area is: " + (l * b * h));
	}

	public static void main(String[] args) {
		Area obj = new Area();
		obj.area(5, 4);
		obj.area(6, 5, 4);
	}
}
