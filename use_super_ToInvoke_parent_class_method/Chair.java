package use_super_ToInvoke_parent_class_method;

public class Chair extends Furniture {
	void color() {
		System.out.println("Chair color.... ");
	}

	void height() {
		System.out.println("Chair height..... ");
	}

	void work() {
		super.color();
		color();
		height();
	}
}
