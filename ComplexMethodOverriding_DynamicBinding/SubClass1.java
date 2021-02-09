package com.ComplexMethodOverriding_DynamicBinding;

public class SubClass1 extends Bind_Ex1 {
	public void display() {
		super.display();
		text = "SubClass1's ";
		System.out.println(text + "function called");
	}
}
