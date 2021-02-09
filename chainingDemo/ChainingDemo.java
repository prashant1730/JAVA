package chainingDemo;

public class ChainingDemo {
	public ChainingDemo() {
		System.out.println("Default Constructor");
	}

	public ChainingDemo(String str) {
		this();
		System.out.println("Parameterized constructor with single param");
	}

	public ChainingDemo(String str, int num) {
		this("Hello");
		System.out.println("Parameterized constructor with double args");
	}

	public ChainingDemo(int num1, int num2, int num3) {
		this("Hello", 2);
		System.out.println("Parameterized constructor with three args");
	}

	public static void main(String[] args) {
		ChainingDemo obj = new ChainingDemo(4, 5, 5);
	}
}
