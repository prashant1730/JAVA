package copy_Constructor;

public class JavaExample {
	String web;

	JavaExample(String w) {
		web = w;
	}

	JavaExample(JavaExample je) {
		web = je.web;
	}

	void display() {
		System.out.println("Website: " + web);
	}

	public static void main(String[] args) {
		JavaExample obj1 = new JavaExample("www.javabykiran.com");
		JavaExample obj2 = new JavaExample("www.javabykiran.com");
		obj1.display();
		obj2.display();
	}
}
