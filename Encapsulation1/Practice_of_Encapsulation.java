package com.Encapsulation1;

public class Practice_of_Encapsulation {
	private String Emailid;
	public int password;

	public void set(String E, int P) {
		this.Emailid = E;
		this.password = P;
	}

	public void get() {
		System.out.println("Email-id: " + Emailid);
		System.out.println("Password: " + password);
	}

	public static void main(String[] args) {
		Practice_of_Encapsulation s = new Practice_of_Encapsulation();
		s.set("prashantchandanshiv1@.gmailcom", 1232456789);
		s.get();
	}
}
