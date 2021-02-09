package multiple_inheritance_2;

public class Main extends User {
	public static void main(String[] args) {
		Manager M1 = new Manager();
		M1.name = "java";
		M1.age = 22;
		M1.ph = 12345665578l;
		M1.department = "HR";
		M1.Specialization = "JAVA";
		System.out.println(M1.name);
		System.out.println(M1.age);
		System.out.println(M1.ph);
		System.out.println(M1.department);
		System.out.println(M1.Specialization);
	}
}
