
public class Employee {
	 String employee1 = "Mark";
	 String employee2 = "David";
	
	
	public Employee() {}
	
	
	public void employee_info() {
		System.out.println(employee1);
		System.out.println(employee2);
	}

	public void set_employee1(String employee1) {
		this.employee1 = employee1;
		
	}
	public void set_employee2(String employee2) {
		this.employee2 = employee2;
	}

	public void first_employee() {
		System.out.println(employee1);
	}
	public void second_employee() {
		System.out.println(employee2);
	}
}
