class Employee{
	int salary;
	String name;
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}




public class OopsPractice {

	public static void main(String[] args) {
		// Problem 1
		Employee Adi = new Employee();
		Adi.setName("Adi is learning Java");
		System.out.println(Adi.getName());
	}

}
