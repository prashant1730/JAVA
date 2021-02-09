package immidiate_Parent_Class;

public class Chair extends Furniture {
	String color = "Black";

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
