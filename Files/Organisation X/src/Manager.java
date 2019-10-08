
public class Manager extends Person {
	public Manager() {}
	
	public void Sales_Manager() { //used for output 
		System.out.println("Manager");
		super.Sales_Manager();
	}
	
	public void Marketing_Manager() {
		System.out.println("Manager:");
		super.Marketing_Manager();
	}
	
}
