package using_this_Keyword;

public class Test {
	int a;
	int b;

	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println("a " + "= " + a + " &" + " b " + "=" + b);
	}

	public static void main(String[] args) {
		Test obj = new Test(10, 20);
		obj.display();
	}
}
