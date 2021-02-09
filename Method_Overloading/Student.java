package com.Method_Overloading;

public class Student {
	String Name;
	int Age;
	String Email;

	public void setDetails(String n, int a) {
		this.Name = n;
		if (a > 0) {
			this.Age = a;
		} else {
			a = 0;
		}

	}

	public void setDetails(String n, int a, String e) {
		this.Name = n;
		this.Email = e;
		if (a > 0) {
			this.Age = a;
		} else {
			a = 0;
		}
	}

	public void getDisplay() {
		System.out.println("Your Name is: " + Name);
		System.out.println("Your Age is: " + Age);
		System.out.println("Your Email-Id is: " + Email);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setDetails("Prashant", 24);
		s1.getDisplay();

	}
}
