
public class Department {
	String department_sales = "Sales";
	String department_marketing = "Marketing";

	public Department() {
	}

	public void department_data() {

		System.out.println(department_sales);
		System.out.println(department_marketing);
	}

	public void set_department(String department_sales, String department_marketing) {
		this.department_sales = department_sales;
		this.department_marketing = department_marketing;
	}

	public void sales_department() {
		System.out.println(department_sales);
	}
}
