package trace_an_Output_Test;

public class E10 {
	private double re, im;

	public String toString() {
		return "(" + re + " + " + im + "i)";
	}

	E10(E10 c) {
		re = c.re;
		im = c.im;
	}
}
