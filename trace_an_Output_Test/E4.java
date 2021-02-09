package trace_an_Output_Test;

public class E4 {
	public static void main(String args[]) {
		System.out.println(fun());
	}

	static int fun() {
		static int x = 5;
		return ++x;
	}
}
