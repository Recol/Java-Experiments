
public class Employee extends Person {

	Department market = new Department(); // instantitate object to access output
	Department Sales = new Department();
	Person people = new Person();
	
	Manager manager = new Manager(); //open manager object to fetch output
	
	public String employee1 = "";
	public String employee2 = "";
	public int age1 = 0;
	public int age2 = 0;

	public void employee_info() { // load both info
		System.out.println(employee1);
		System.out.println(employee2);
	}

	public void set_employee1(String employee1) { // first employee name
		this.employee1 = employee1;

	}

	public void set_employee2(String employee2) { // second employee name
		this.employee2 = employee2;
	}

	public void first_employee() {
		System.out.println(employee1);
	}

	public void second_employee() {
		System.out.println(employee2);
	}

	public void first_age(int age1) { // first employee age storage
		this.age1 = age1;
	}

	public void second_age(int age2) { // second employee age storage
		this.age2 = age2;
	}

	

	public void output_1() { // outputs used to access internal variables for the enterprise class
		super.employee1_output();
		super.gender_output();
		System.out.println("Department: " + market.department_marketing);
		manager.Marketing_Manager();
	}

	public void output_2() {
		super.employee1_output();
		super.gender_output();
		System.out.println("Department: " + market.department_marketing);
		manager.Marketing_Manager();
	}

	public void output_3() {
		super.employee2_output();
		super.gender_output();
		System.out.println("Department: " + Sales.department_sales);
		manager.Marketing_Manager();
	}

	public void output_4() {
		super.employee2_output();
		super.gender_output();
		System.out.println("Department: " + Sales.department_sales);
		manager.Marketing_Manager();
	}
}
