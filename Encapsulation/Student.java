package com.Encapsulation;

public class Student {
	private int age;
	private String name;
	private String loc;

	public void set(int a, String n, String l) {
		this.name = n;
		this.loc = l;
		if (age > 0) {
			this.age = a;
		} else {
			this.age = 0;
		}
	}

	public void get() {
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
		System.out.println("Loactaion: " + loc);
	}

	public static void main(String[] args) {
		Student ss = new Student();
		ss.set(24, "Prashant", "Jalgaon");
		ss.get();
	}
}
