package use_Super_to_invoke_parent_class_constructor;

public class Chair extends Furniture {
	Chair() {
		super();// it is Default
		System.out.println("Chair class Constructor");
	}
}
