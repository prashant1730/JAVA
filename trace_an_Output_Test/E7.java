package trace_an_Output_Test;

public class E7 {

	int x = 2;

	E7(int i) {
		x = i;
	}

	public static void main(String[] args) {
		E7 t = new E7(5);
		System.out.println("x = " + t.x);
	}
}
