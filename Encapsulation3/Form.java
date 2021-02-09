package com.Encapsulation3;

public class Form {
	private String Name;
	private long Mob;
	private String Email;
	private String address;

	public void setDtails(String n, long m, String e, String a) {
		this.Name = n;
		this.Mob = m;
		this.Email = e;
		this.address = a;
	}

	public void getDetails() {
		System.out.println("Your Name is: " + Name);
		System.out.println("Your Mobile Number is: " + Mob);
		System.out.println("Your Email-id is: " + Email);
		System.out.println("Your Address is: " + address);
	}

	public static void main(String[] args) {
		Form s = new Form();
		s.setDtails("Prashant", 9673883649l, "prashantchandanshiv1@gmail.com", "Jalgaon");
		s.getDetails();
	}
}
