
public class Employee extends Person {
	
	Department market = new Department(); //instantitate object to access output
	Department Sales = new Department();
	public String employee1 = "";
	 public String employee2 = "";
	 public int age_1 = 0;
	public int age_2 = 0;
	 
	 public String gender1 = "";
	 public String gender2 = "";
	
	
	public Employee() {
		
	}
	
	
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
	public void output_1() { //outputs used to access internal variables for the enterprise class
		System.out.println("The first employee "+ this.employee1 +"is "+this.gender1+"and is the age of"+age_1 +" belongs to the department "+market.department_marketing); //output sales department details
	}
	public void output_2() {
		System.out.println("The first employee "+ this.employee1 + "is "+this.gender1+"and is the age of"+age_1+" belongs to the department "+market.department_marketing);
	}
	public void output_3() {
		System.out.println("The second employee "+ this.employee2 + "is "+this.gender2+"and is the age of"+age_2+" belongs to the department "+Sales.department_sales);
	}
	public void output_4() {
		System.out.println("The second employee "+ this.employee2 + "is "+this.gender2+"and is the age of"+age_2+" belongs to the department "+market.department_marketing);
	}
}
