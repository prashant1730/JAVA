package super_with_variables;

public class Car extends Vehicle {

	int MaxSpeed = 170;

	void display() {
		System.out.println("Max Speed : " + super.MaxSpeed);
	}
}