
public class Employee extends Person {
	 String employee1 = "";
	 String employee2 = "";
	 int age_1 = 0;
	 int age_2 = 0;
	 
	 String gender1 = "";
	 String gender2 = "";
	
	
	public Employee() {}
	
	
	public void employee_info() { //load both info
		System.out.println(employee1);
		System.out.println(employee2);
	}

	public void set_employee1() { //first employee name
		this.employee1 = super.name_check();
		
	}
	public void set_employee2() { //second employee name
		this.employee2 = super.name_check();
	}

	public void first_employee() { 
		System.out.println(employee1);
	}
	public void second_employee() {
		System.out.println(employee2);
	}
	public void first_age() { //first employee age storage
		this.age_1 = super.age_check();
	}
	public void second_age() { //second employee age storage
		this.age_2 = super.age_check();
	}
	public void first_gender() {
		this.gender1 = super.gender_check();
	}
	public void second_gender() {
		this.gender2 = super.gender_check();
	}
}
