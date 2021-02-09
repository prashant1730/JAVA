package using_this_ToInvoke_Current_Class_Constructor;

public class Test {
	int a;
	int b;

	Test() {
		this(10, 20);
		System.out.println("Inside  default Constructor");
	}

	Test(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}

	public static void main(String[] args) {
		Test t = new Test();
	}
}
