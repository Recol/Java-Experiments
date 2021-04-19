
public class Manager extends Person {
	public Manager() {}
	
	public void Sales_Manager() { //used for output 
		System.out.println(Messages.getString("Manager.0")); //$NON-NLS-1$
		super.Sales_Manager();
	}
	
	public void Marketing_Manager() {
		System.out.println(Messages.getString("Manager.1")); //$NON-NLS-1$
		super.Marketing_Manager();
	}
	
}
