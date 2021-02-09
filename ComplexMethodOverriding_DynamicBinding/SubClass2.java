package com.ComplexMethodOverriding_DynamicBinding;

public class SubClass2 extends SubClass1 {
	public void display() {
		super.display();
		text = "SubClass2's ";
		System.out.println(text + "function called");
	}
}
