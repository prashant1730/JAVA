package parameterized_constructor;

public class Employee {
	int empId;
	String empName;

	Employee(int id, String name) {
		empId = id;
		empName = name;
	}

	void info() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
	}

	public static void main(String[] args) {
		Employee obj1 = new Employee(1234, "RAM");
		Employee obj2 = new Employee(4321, "SHYAM");
		obj1.info();
		obj2.info();
	}
}
