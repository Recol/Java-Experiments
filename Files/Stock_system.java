import java.util.Scanner;
import java.util.HashMap;

public class Stock_system {
	 @SuppressWarnings({ "unlikely-arg-type", "unused" })
	public static void main(String[] args) {
	
		 String option = "";
		 
		 String item_id = "";
		 String price = "";
		 String description = "";
		 String name = "";
		String quantity = "";
		String category = "";
		int category_o = 0;
	
		
		//hashmap declaration// used for avoiding non-itilisation errors//
		HashMap<String, String> book_stock = new HashMap<String, String>(); //generate book hashmaps 
		HashMap<String, String> book_stock2 = new HashMap<String, String>(); 
		HashMap<String, String> book_stock3 = new HashMap<String, String>();
		
		HashMap<String, String> cd_stock = new HashMap<String, String>(); //generate CD hashmaps 
		HashMap<String, String> cd_stock2 = new HashMap<String, String>(); 
		HashMap<String, String> cd_stock3 = new HashMap<String, String>();
		
		HashMap<String, String> software_stock = new HashMap<String, String>(); //generate software hashmaps 
		HashMap<String, String> software_stock2 = new HashMap<String, String>();
		HashMap<String, String> software_stock3 = new HashMap<String, String>(); 
		
		HashMap<String, String> hardware_stock = new HashMap<String, String>(); //generate hardware hashmaps
		HashMap<String, String> hardware_stock2 = new HashMap<String, String>();
		HashMap<String, String> hardware_stock3 = new HashMap<String, String>();
		
		//stock declarations/
		int new_new_new_tbs = 0;
		int new_new_new_tcd = 0;
		int new_new_new_ths = 0;
		int new_new_new_tss = 0;
		
		int new_new_tbs = 0;
		int new_new_tcd = 0;
		int new_new_ths = 0;
		int new_new_tss = 0;
		
		int new_tbs = 0;
		int new_tcd = 0;
		int new_ths = 0;
		int new_tss = 0;
		
		Integer tbs = 0;
		Integer tcd = 0;
		Integer ths = 0;
		Integer tss = 0;
		
		int total_sum = 0;
		
		
		//option report checks for string comparisons
		String check_h = new String("Hardware");
		String check_s = new String("Software");
		String check_b = new String("Books");
		String check_cd = new String("CDs");
		
		
		//adding hashmap check//
		
		int check_h1 = new Integer(1);
		int check_s2 = new Integer(2);
		int check_b3 = new Integer(3);
		int check_cd4 = new Integer(4);
		
		
		//option choice check comparisons//
		String check_a = new String("A");
		String checkb = new String("B");
		String check_c = new String("C");
		String check_d = new String("D");
		String check_e = new String("E");

	System.out.println("2: Create New Stock Entry");
	System.out.println("3: Amend Stock Details");
	System.out.println("4: Delete Stock Details");
	System.out.println("5: Count Stock Quantity");
	System.out.println("6: Show Stock Sales Report");
	System.out.println("7: Show Re-Order Report");
	System.out.println("8: Exit");

	
	
	Scanner input = new Scanner(System.in);
	

	System.out.println("Enter your choice:");
	

do {
	option = input.nextLine();	
	switch (option) {
	
	case "2": 
		System.out.println("1: Add a stock item");
		System.out.println("2: Exit to main menu");	
		
		
		Scanner new_stock = new Scanner(System.in);
		System.out.println("Enter \"1\" or \"2\"");
		
		
		int stock_choice = new_stock.nextInt();
		Scanner item_id_input = new Scanner(System.in);	
		if (stock_choice == 1)
			System.out.println("Please enter Item ID");
			item_id = item_id_input.next(); 
			
			Scanner item_name = new Scanner(System.in);
			System.out.println("Enter Item Name");
			name = item_name.next();
			
			
			Scanner item_description_input = new Scanner(System.in);
			System.out.println("Enter Description");
			description = item_description_input.next();
			
			
			Scanner input_quantity = new Scanner(System.in);
			System.out.println("Enter Quantity (a number)");
				quantity = input_quantity.next();
				
				
				Scanner input_price = new Scanner(System.in);
				System.out.println("Enter Price");
			price = input_price.next();
			
			Scanner category_input = new Scanner(System.in);
			System.out.println("Please choose a category from 1-4");
			System.out.println("1: Hardware");
			System.out.println("2: Software");
			System.out.println("3: Books");
			System.out.println("4: CD/DVDs");
			System.out.println("");
			category_o = category_input.nextInt();
		
			
			System.out.println("");
			System.out.println("Item Added: " + item_id);
			System.out.println("Name: " + name);
			System.out.println("Description: " + description);
			System.out.println("Quantity: " + quantity);
			System.out.println("Price: " + price);
			System.out.println("");
			
	//Hardware Storage//
			
			 if (category_o == check_h1) { //utilise hashmaps for storing entered stock/
			 
			hardware_stock.put("item_id", item_id);
			hardware_stock.put("description", description);
			hardware_stock.put("price", price);
			hardware_stock.put("quantity", quantity);
			hardware_stock.put("category", category);
			hardware_stock.put("name", name);
			
		
			 } if(hardware_stock.containsKey("item_id")) {
			hardware_stock2.put("item_id", item_id);
			hardware_stock2.put("name", name);
			hardware_stock2.put("description", description);
			hardware_stock2.put("quantity", quantity);
			hardware_stock2.put("price", price);
			hardware_stock2.put("category", category);
			
		
			 } else if(hardware_stock2.containsKey("item_id")) {
			hardware_stock3.put("item_id", item_id);
			hardware_stock3.put("name", name);
			hardware_stock3.put("description", description);
			hardware_stock3.put("quantity", quantity);
			hardware_stock3.put("price", price);
			hardware_stock3.put("category", category);
			
			 }
			
			//Software Storage//
	 else if (category_o == check_s2) { //utilise hashmaps for storing entered stock//
		  
			software_stock.put("item_id",item_id);
			software_stock.put("name", name);
			software_stock.put("description", description);
			software_stock.put("quantity", quantity);
			software_stock.put("price", price);
			software_stock.put("category", category);
			
			
		   if(software_stock.containsKey("item_id")) {
			software_stock2.put("item_id", item_id);
			software_stock2.put("name", name);
			software_stock2.put("description", description);
			software_stock2.put("quantity", quantity);
			software_stock2.put("price", price);
			software_stock2.put("category", category); }
			
		
	 } else if(software_stock2.containsKey("item_id")) {
			software_stock3.put("item_id", item_id);
			software_stock3.put("name", name);
			software_stock3.put("description", description);
			software_stock3.put("quantity", quantity);
			software_stock3.put("price", price);
			software_stock3.put("category", category); 
		  }
		
			
			//Book storage//
			
			 
			else if (category_o == check_b3) { //utilise hashmaps for storing entered stock//
			
			book_stock.put("ID", item_id);
			book_stock.put("name", name);
			book_stock.put("description", description);
			book_stock.put("quantity", quantity);
			book_stock.put("price", price);
			book_stock.put("category", category);
			}
			
			if(book_stock.containsKey("ID")) {
			book_stock2.put("ID", item_id);
			book_stock2.put("name", name);
			book_stock2.put("description", description);
			book_stock2.put("quantity", quantity);
			book_stock2.put("price", price);
			book_stock2.put("category", category); }
			
		
	else if(book_stock2.containsKey("ID")); {
			book_stock3.put("ID", item_id);
			book_stock3.put("name", name);
			book_stock3.put("description", description);
			book_stock3.put("quantity", quantity);
			book_stock3.put("price", price);
			book_stock3.put("category", category);
			}
			//CD storage//
			
			if (category_o == check_cd4); { //utilise hashmaps for storing entered stock//
			
			cd_stock.put("ID", item_id);
			cd_stock.put("name", name);
			cd_stock.put("description", description);
			cd_stock.put("quantity", quantity);
			cd_stock.put("price", price);
			cd_stock.put("category", category);
			}
			if(cd_stock.containsKey("ID")); {
			cd_stock2.put("ID", item_id);
			cd_stock2.put("name", name);
			cd_stock2.put("description", description);
			cd_stock2.put("quantity", quantity);
			cd_stock2.put("price", price);
			cd_stock2.put("category", category);
			}
			
			if(cd_stock2.containsKey("ID")); {
			cd_stock3.put("ID", item_id);
			cd_stock3.put("name", name);
			cd_stock3.put("description", description);
			cd_stock3.put("quantity", quantity);
			cd_stock3.put("price", price);
			cd_stock3.put("category", category);
			}
		
			if (stock_choice==2); 
		System.out.println("");
		System.out.println("2: Create New Stock Entry");
		System.out.println("3: Amend Stock Details");
		System.out.println("4: Delete Stock Details");
		System.out.println("5: Count Stock Quantity");
		System.out.println("6: Show Stock Sales Report");
		System.out.println("7: Show Re-Order Report");
		System.out.println("8: Exit");
		System.out.println("");

		System.out.println("Enter your choice:");
		
		break;
	case "3":
		System.out.println("Amend Stock Details");
		System.out.println("1: Edit an item");
		System.out.println("2. Exit the menu");
		Scanner amend_stock = new Scanner(System.in);
		System.out.println("Enter \"1\" or \"2\"");
		
		
		int amend_choice = amend_stock.nextInt();
		if (amend_choice ==1);
		
		//Hardware//
		
		Scanner amend_choice_stock = new Scanner(System.in);
		
		System.out.println("What category do you want to amend? (Hardware/Software/CD/Books");
		if (amend_choice_stock.equals(check_h));
		
		Scanner amend_h_choice = new Scanner(System.in);
		System.out.println("Select an item from the list:");
		System.out.println("1.  hardware_stock");
		System.out.println("2. hardware_stock2");
		System.out.println("3. hardware_stock3");
		int amended_h_choice = amend_h_choice.nextInt();
		
		//id amending
		
		if (amended_h_choice == 1);
		Scanner amend_id_h = new Scanner(System.in);
		System.out.println("Enter Item ID");
		String amended_id_h = amend_id_h.next();
		amended_id_h = hardware_stock.put("ID", amended_id_h);
		
		//name amending//
		
		Scanner amend_name_h = new Scanner(System.in);
		System.out.println("Enter Item Name");
		String amended_name_h = amend_name_h.next();
		amended_name_h = hardware_stock.put("name", amended_name_h);
		
		//"description" amending//
		Scanner amend_desc_h = new Scanner(System.in);
		System.out.println("Enter description");
		String amended_desc_h = amend_desc_h.next();
		amended_desc_h = hardware_stock.put("description", amended_desc_h);
		
		//quantity amending//
		Scanner amend_quan_h = new Scanner(System.in);
		System.out.println("Enter quantity");
				String amended_quan_h = amend_quan_h.next();
				amended_quan_h = hardware_stock.put("quantity", amended_quan_h);
				
				
				//price editing//
				Scanner amend_price_h = new Scanner(System.in);
				System.out.println("Enter Price");
				String amended_price_h = amend_price_h.next();
				amended_price_h = hardware_stock.put("price", amended_price_h);
				
				Scanner amend_choice_stock2 = new Scanner(System.in);
				
				System.out.println("What category do you want to amend? (Hardware/Software/CD/Books");
				if (amend_choice_stock2.equals(check_h));
				
				Scanner amend_h_choice2 = new Scanner(System.in);
				System.out.println("Select an item from the list:");
				System.out.println("1.  hardware_stock");
				System.out.println("2. hardware_stock2");
				System.out.println("3. hardware_stock3");
				int amended_h_choice2 = amend_h_choice2.nextInt();
		
		if (amended_h_choice2 == 2);
		Scanner amend_id_h2 = new Scanner(System.in);
		System.out.println("Enter Item ID");
		String amended_id_h2 = amend_id_h2.next();
		amended_id_h2 = hardware_stock2.put("ID", amended_id_h2);
		
		Scanner amend_name_h2 = new Scanner(System.in);
		System.out.println("Enter Item Name");
		String amended_name_h2 = amend_name_h2.next();
		amended_name_h2 = hardware_stock2.put("name", amended_name_h2);
		
		//"description" amending//
		Scanner amend_desc_h2 = new Scanner(System.in);
		System.out.println("Enter description");
		String amended_desc_h2 = amend_desc_h2.next();
		amended_desc_h2 = hardware_stock2.put("description", amended_desc_h2);
		
		//quantity amending//
		Scanner amend_quan_h2 = new Scanner(System.in);
		System.out.println("Enter quantity");
				String amended_quan_h2 = amend_quan_h2.next();
				amended_quan_h2 = hardware_stock.put("quantity", amended_quan_h2);
				
				
				//price editing//
				Scanner amend_price_h2 = new Scanner(System.in);
				System.out.println("Enter Price");
				String amended_price_h2 = amend_price_h2.next();
				amended_price_h2 = hardware_stock2.put("price", amended_price_h2);
		
				Scanner amend_choice_stock3 = new Scanner(System.in);
				
				System.out.println("What category do you want to amend? (Hardware/Software/CD/Books");
				if (amend_choice_stock3.equals(check_h));
				
				Scanner amend_h_choice3 = new Scanner(System.in);
				System.out.println("Select an item from the list:");
				System.out.println("1.  hardware_stock");
				System.out.println("2. hardware_stock2");
				System.out.println("3. hardware_stock3");
				System.out.println("4: Exit");
				int amended_h_choice3 = amend_h_choice3.nextInt();
				
				//3rd hardware//
		if (amended_h_choice3 == 3);
		System.out.print(hardware_stock3);
		Scanner amend_id_h3 = new Scanner(System.in);
		System.out.println("Enter Item ID");
		String amended_id_h3 = amend_id_h3.next();
		amended_id_h3 = hardware_stock3.put("ID", amended_id_h3);
		
		Scanner amend_name_h3 = new Scanner(System.in);
		System.out.println("Enter Item Name");
		String amended_name_h3 = amend_name_h3.next();
		amended_name_h3 = hardware_stock3.put("name", amended_name_h3);
		
		//"description" amending//
		Scanner amend_desc_h3 = new Scanner(System.in);
		System.out.println("Enter description");
		String amended_desc_h3 = amend_desc_h3.next();
		amended_desc_h = hardware_stock3.put("description", amended_desc_h3);
		
		//quantity amending//
		Scanner amend_quan_h3 = new Scanner(System.in);
		System.out.println("Enter quantity");
				String amended_quan_h3 = amend_quan_h3.next();
				amended_quan_h = hardware_stock3.put("quantity", amended_quan_h3);
				
				
				//price editing//
				Scanner amend_price_h3 = new Scanner(System.in);
				System.out.println("Enter Price");
				String amended_price_h3 = amend_price_h3.next();
				amended_price_h3 = hardware_stock3.put("price", amended_price_h3);
		
				
				
				//software choice - present menu, and add to hashmap
				
				if (amend_choice_stock.equals(check_s));
				
				Scanner amend_s_choice = new Scanner(System.in);
				System.out.println("Select an item from the list:");
				System.out.println("1.  software_stock");
				System.out.println("2. software_stock2");
				System.out.println("3. software_stock3");
				int amended_s_choice = amend_s_choice.nextInt();
				
				//id amending
				
				if (amended_s_choice == 1);
				Scanner amend_id_s = new Scanner(System.in);
				System.out.println("Enter Item ID");
				String amended_id_s = amend_id_s.next();
				amended_id_s = software_stock.put("ID", amended_id_s);
				
				//name amending//
				
				Scanner amend_name_s = new Scanner(System.in);
				System.out.println("Enter Item Name");
				String amended_name_s = amend_name_s.next();
				amended_name_s = software_stock.put("name", amended_name_s);
				
				//"description" amending//
				Scanner amend_desc_s = new Scanner(System.in);
				System.out.println("Enter description");
				String amended_desc_s = amend_desc_s.next();
				amended_desc_s = software_stock.put("description", amended_desc_s);
				
				//quantity amending//
				Scanner amend_quan_s = new Scanner(System.in);
				System.out.println("Enter quantity");
						String amended_quan_s = amend_quan_s.next();
						amended_quan_s = software_stock.put("quantity", amended_quan_s);
						
						
						//price editing//
						Scanner amend_price_s = new Scanner(System.in);
						System.out.println("Enter Price");
						String amended_price_s = amend_price_s.next();
						amended_price_s = software_stock.put("price", amended_price_s);
			
						Scanner amend_s_choice2 = new Scanner(System.in);
						System.out.println("Select an item from the list:");
						System.out.println("1.  software_stock");
						System.out.println("2. software_stock2");
						System.out.println("3. software_stock3");
						System.out.println("4: Exit");
						int amended_s_choice2 = amend_s_choice2.nextInt();
						
				if (amended_s_choice2 == 2);
				Scanner amend_id_s2 = new Scanner(System.in);
				System.out.println("Enter Item ID");
				String amended_id_s2 = amend_id_s2.next();
				amended_id_s2 = software_stock2.put("ID", amended_id_s2);
				
				Scanner amend_name_s2 = new Scanner(System.in);
				System.out.println("Enter Item Name");
				String amended_name_s2 = amend_name_s2.next();
				amended_name_s2 = software_stock2.put("name", amended_name_s2);
				
				//"description" amending//
				Scanner amend_desc_s2 = new Scanner(System.in);
				System.out.println("Enter description");
				String amended_desc_s2 = amend_desc_s2.next();
				amended_desc_s2 = software_stock2.put("description", amended_desc_s2);
				
				//quantity amending//
				Scanner amend_quan_s2 = new Scanner(System.in);
				System.out.println("Enter quantity");
						String amended_quan_s2 = amend_quan_s2.next();
						amended_quan_s2 = software_stock2.put("quantity", amended_quan_s2);
						
						
						//price editing//
						Scanner amend_price_s2 = new Scanner(System.in);
						System.out.println("Enter Price");
						String amended_price_s2 = amend_price_s2.next();
						amended_price_s2 = software_stock2.put("price", amended_price_s2);
				
				
						Scanner amend_s_choice3 = new Scanner(System.in);
						System.out.println("Select an item from the list:");
						System.out.println("1.  software_stock");
						System.out.println("2. software_stock2");
						System.out.println("3. software_stock3");
						System.out.println("4: Exit");
						int amended_s_choice3 = amend_s_choice3.nextInt();		
						//3rd software//
				if (amended_s_choice3 == 3);
				System.out.print(software_stock3);
				Scanner amend_id_s3 = new Scanner(System.in);
				System.out.println("Enter Item ID");
				String amended_id_s3 = amend_id_s3.next();
				amended_id_s3 = software_stock3.put("ID", amended_id_s3);
				
				Scanner amend_name_s3 = new Scanner(System.in);
				System.out.println("Enter Item Name");
				String amended_name_s3 = amend_name_s3.next();
				amended_name_s3 = software_stock3.put("name", amended_name_s3);
				
				//"description" amending//
				Scanner amend_desc_s3 = new Scanner(System.in);
				System.out.println("Enter description");
				String amended_desc_s3 = amend_desc_s3.next();
				amended_desc_s3 = software_stock3.put("description", amended_desc_s3);
				
				//quantity amending//
				Scanner amend_quan_s3 = new Scanner(System.in);
				System.out.println("Enter quantity");
						String amended_quan_s3 = amend_quan_s3.next();
						amended_quan_s3 = software_stock3.put("quantity", amended_quan_s3);
						
						
						//price editing//
						Scanner amend_price_s3 = new Scanner(System.in);
						System.out.println("Enter Price");
						String amended_price_s3 = amend_price_s3.next();
						amended_price_s3 = software_stock3.put("price", amended_price_s3);
				
				
				
				
				//books///
						
						
						if (amend_choice_stock.equals(check_b));
						
						Scanner amend_b_choice = new Scanner(System.in);
						System.out.println("Select an item from the list:");
						System.out.println("1. book_stock");
						System.out.println("2. book_stock2");
						System.out.println("3. book_stock3");
						int amended_b_choice = amend_b_choice.nextInt();
						
						//id amending
						
						if (amended_b_choice == 1);
						Scanner amend_id_b = new Scanner(System.in);
						System.out.println("Enter Item ID");
						String amended_id_b = amend_id_b.next();
						amended_id_b = book_stock.put("ID", amended_id_b);
						
						//name amending//
						
						Scanner amend_name_b = new Scanner(System.in);
						System.out.println("Enter Item Name");
						String amended_name_b = amend_name_b.next();
						amended_name_b = book_stock.put("name", amended_name_b);
						
						//"description" amending//
						Scanner amend_desc_b = new Scanner(System.in);
						System.out.println("Enter description");
						String amended_desc_b = amend_desc_b.next();
						amended_desc_b = book_stock.put("description", amended_desc_b);
						
						//quantity amending//
						Scanner amend_quan_b = new Scanner(System.in);
						System.out.println("Enter quantity");
								String amended_quan_b = amend_quan_b.next();
								amended_quan_b = book_stock.put("quantity", amended_quan_b);
								
								
								//price editing//
								Scanner amend_price_b = new Scanner(System.in);
								System.out.println("Enter Price");
								String amended_price_b = amend_price_b.next();
								amended_price_b = book_stock.put("price", amended_price_b);
						
					
								Scanner amend_b_choice2 = new Scanner(System.in);
								System.out.println("Select an item from the list:");
								System.out.println("1. book_stock");
								System.out.println("2. book_stock2");
								System.out.println("3. book_stock3");
								System.out.println("4: Exit");
								int amended_b_choice2 = amend_b_choice2.nextInt();
								
								
								if (amended_b_choice2 == 2);
						Scanner amend_id_b2 = new Scanner(System.in);
						System.out.println("Enter Item ID");
						String amended_id_b2 = amend_id_b2.next();
						amended_id_b2 = book_stock2.put("ID", amended_id_b2);
						
						Scanner amend_name_b2 = new Scanner(System.in);
						System.out.println("Enter Item Name");
						String amended_name_b2 = amend_name_b2.next();
						amended_name_b2 = book_stock2.put("name", amended_name_b2);
						
						//"description" amending//
						Scanner amend_desc_b2 = new Scanner(System.in);
						System.out.println("Enter description");
						String amended_desc_b2 = amend_desc_b2.next();
						amended_desc_b2 = book_stock2.put("description", amended_desc_b2);
						
						//quantity amending//
						Scanner amend_quan_b2 = new Scanner(System.in);
						System.out.println("Enter quantity");
								String amended_quan_b2 = amend_quan_b2.next();
								amended_quan_b2 = book_stock.put("quantity", amended_quan_b2);
								
								
								//price editing//
								Scanner amend_price_b2 = new Scanner(System.in);
								System.out.println("Enter Price");
								String amended_price_b2 = amend_price_b2.next();
								amended_price_b2 = book_stock2.put("price", amended_price_b2);
						
								Scanner amend_b_choice3 = new Scanner(System.in);
								System.out.println("Select an item from the list:");
								System.out.println("1. book_stock");
								System.out.println("2. book_stock2");
								System.out.println("3. book_stock3");
								System.out.println("4: Exit");
								int amended_b_choice3 = amend_b_choice3.nextInt();
								
								
								//3rd book//
						if (amended_b_choice3 == 3);
						System.out.print(book_stock3);
						Scanner amend_id_b3 = new Scanner(System.in);
						System.out.println("Enter Item ID");
						String amended_id_b3 = amend_id_b3.next();
						amended_id_b3 = book_stock3.put("ID", amended_id_b3);
						
						Scanner amend_name_b3 = new Scanner(System.in);
						System.out.println("Enter Item Name");
						String amended_name_b3 = amend_name_b3.next();
						amended_name_b3 = book_stock3.put("name", amended_name_b3);
						
						//"description" amending//
						Scanner amend_desc_b3 = new Scanner(System.in);
						System.out.println("Enter description");
						String amended_desc_b3 = amend_desc_b3.next();
						amended_desc_b3 = book_stock3.put("description", amended_desc_b3);
						
						//quantity amending//
						Scanner amend_quan_b3 = new Scanner(System.in);
						System.out.println("Enter quantity");
								String amended_quan_b3 = amend_quan_b3.next();
								amended_quan_b3 = book_stock3.put("quantity", amended_quan_b3);
								
								
								//price editing//
								Scanner amend_price_b3 = new Scanner(System.in);
								System.out.println("Enter Price");
								String amended_price_b3 = amend_price_b3.next();
								amended_price_b3 = book_stock3.put("price", amended_price_b3);
						
				
				//cds/
								
								if (amend_choice_stock.equals(check_cd));
								
								Scanner amend_c_choice = new Scanner(System.in);
								System.out.println("Select an item from the list:");
								System.out.println("1. cd_stock");
								System.out.println("2. cd_stock2");
								System.out.println("3. cd_stock3");
								System.out.println("Exit");
								int amended_c_choice = amend_c_choice.nextInt();
								
								//id amending
								
								if (amended_c_choice == 1);
								Scanner amend_id_c = new Scanner(System.in);
								System.out.println("Enter Item ID");
								String amended_id_c = amend_id_c.next();
								amended_id_c = cd_stock.put("ID", amended_id_c);
								
								//name amending//
								
								Scanner amend_name_c = new Scanner(System.in);
								System.out.println("Enter Item Name");
								String amended_name_c = amend_name_c.next();
								amended_name_c = cd_stock.put("name", amended_name_c);
								
								//"description" amending//
								Scanner amend_desc_c = new Scanner(System.in);
								System.out.println("Enter description");
								String amended_desc_c = amend_desc_c.next();
								amended_desc_c = cd_stock.put("description", amended_desc_c);
								
								//quantity amending//
								Scanner amend_quan_c = new Scanner(System.in);
								System.out.println("Enter quantity");
										String amended_quan_c = amend_quan_c.next();
										amended_quan_c = cd_stock.put("quantity", amended_quan_c);
										
										
										//price editing//
										Scanner amend_price_c = new Scanner(System.in);
										System.out.println("Enter Price");
										String amended_price_c = amend_price_c.next();
										amended_price_c = cd_stock.put("price", amended_price_c);
								
										Scanner amend_c_choice2 = new Scanner(System.in);
										System.out.println("Select an item from the list:");
										System.out.println("1. cd_stock");
										System.out.println("2. cd_stock2");
										System.out.println("3. cd_stock3");
										System.out.println("Exit");
										int amended_c_choice2 = amend_c_choice2.nextInt();
										
								if (amended_c_choice2 == 2);
								Scanner amend_id_c2 = new Scanner(System.in);
								System.out.println("Enter Item ID");
								String amended_id_c2 = amend_id_c2.next();
								amended_id_c2 = cd_stock2.put("ID", amended_id_c2);
								
								Scanner amend_name_c2 = new Scanner(System.in);
								System.out.println("Enter Item Name");
								String amended_name_c2 = amend_name_c2.next();
								amended_name_c2 = cd_stock2.put("name", amended_name_c2);
								
								//"description" amending//
								Scanner amend_desc_c2 = new Scanner(System.in);
								System.out.println("Enter description");
								String amended_desc_c2 = amend_desc_c2.next();
								amended_desc_c2 = cd_stock2.put("description", amended_desc_c2);
								
								//quantity amending//
								Scanner amend_quan_c2 = new Scanner(System.in);
								System.out.println("Enter quantity");
										String amended_quan_c2 = amend_quan_c2.next();
										amended_quan_c2 = cd_stock.put("quantity", amended_quan_c2);
										
										
										//price editing//
										Scanner amend_price_c2 = new Scanner(System.in);
										System.out.println("Enter Price");
										String amended_price_c2 = amend_price_c2.next();
										amended_price_c2 = cd_stock2.put("price", amended_price_c2);
								
										Scanner amend_c_choice3 = new Scanner(System.in);
										System.out.println("Select an item from the list:");
										System.out.println("1. cd_stock");
										System.out.println("2. cd_stock2");
										System.out.println("3. cd_stock3");
										System.out.println("4: Exit");
										int amended_c_choice3 = amend_c_choice3.nextInt();
										
										//3rd cd//
								if (amended_c_choice3 == 3);
								System.out.print(cd_stock3);
								Scanner amend_id_c3 = new Scanner(System.in);
								System.out.println("Enter Item ID");
								String amended_id_c3 = amend_id_c3.next();
								amended_id_c3 = cd_stock3.put("ID", amended_id_c3);
								
								Scanner amend_name_c3 = new Scanner(System.in);
								System.out.println("Enter Item Name");
								String amended_name_c3 = amend_name_c3.next();
								amended_name_c3 = cd_stock3.put("name", amended_name_c3);
								
								//"description" amending//
								Scanner amend_desc_c3 = new Scanner(System.in);
								System.out.println("Enter description");
								String amended_desc_c3 = amend_desc_c3.next();
								amended_desc_c = cd_stock3.put("description", amended_desc_c3);
								
								//quantity amending//
								Scanner amend_quan_c3 = new Scanner(System.in);
								System.out.println("Enter quantity");
										String amended_quan_c3 = amend_quan_c3.next();
										amended_quan_c = cd_stock3.put("quantity", amended_quan_c3);
										
										
										//price editing//
										Scanner amend_price_c3 = new Scanner(System.in);
										System.out.println("Enter Price");
										String amended_price_c3 = amend_price_c3.next();
										amended_price_c3 = cd_stock3.put("price", amended_price_c3);
													
if (amend_choice == 2);
System.out.println("2: Create New Stock Entry");
System.out.println("3: Amend Stock Details");
System.out.println("4: Delete Stock Details");
System.out.println("5: Count Stock Quantity");
System.out.println("6: Show Stock Sales Report");
System.out.println("7: Show Re-Order Report");
System.out.println("8: Exit");
System.out.println("");

System.out.println("Enter your choice:");
				
		
		break;
	case "4": 
		System.out.println("Delete Stock Details");
		Scanner delete_stock = new Scanner(System.in);
		
		System.out.println("1: Delete an item");
		System.out.println("2: Exit the menu");
		int delete_stock_o = delete_stock.nextInt();
		if (delete_stock_o == 1);
		
		Scanner list_choice_del = new Scanner(System.in);
		System.out.println("Select an option from the list");
		System.out.println("1: hardware_stock");
		System.out.println("2: book_stock");
		System.out.println("3: software_stock");
		System.out.println("4: cd_stock");
		System.out.println("5: software_stock2");
		System.out.println("");
		System.out.println("6: Delete all");
		int list_choice_del_o = list_choice_del.nextInt();
		if (list_choice_del_o >0 && list_choice_del_o <=6 );
		
		//play message regardless of choice//
		Scanner yn = new Scanner(System.in);
		System.out.println("Are you sure you want to delete this item? 'Y' or 'N'");
		String ynn = yn.next();
		if (ynn == "Y");
		System.out.println("Item details have been deleted.");
		//focus clearance on choice//
		if (list_choice_del_o == 1);
		cd_stock3.clear();
		
		if (list_choice_del_o == 2);
		book_stock.clear();
		
		if (list_choice_del_o == 3);
		software_stock.clear();
		
		if (list_choice_del_o == 4);
		cd_stock.clear();
		
		if (list_choice_del_o == 5);
		software_stock2.clear();
		
		if (list_choice_del_o == 6);
		software_stock.clear();
		software_stock2.clear();
		software_stock3.clear();
		
		hardware_stock.clear();
		hardware_stock2.clear();
		hardware_stock3.clear();
		
		cd_stock.clear();
		cd_stock2.clear();
		cd_stock3.clear();
		
		book_stock.clear();
		book_stock2.clear();
		book_stock3.clear();
		
		if (ynn == "N");
		if (delete_stock_o == 2);
		System.out.println("2: Create New Stock Entry");
		System.out.println("3: Amend Stock Details");
		System.out.println("4: Delete Stock Details");
		System.out.println("5: Count Stock Quantity");
		System.out.println("6: Show Stock Sales Report");
		System.out.println("7: Show Re-Order Report");
		System.out.println("8: Exit");
		System.out.println("");

		System.out.println("Enter your choice:");
		
		break;
	case "5":
		
		
		//fetch total hashmap amount via identification of the relevant key//
		
		String total_book_stock = book_stock.get("quantity") + book_stock2.get("quantity") + book_stock3.get("quantity");
		String total_software_stock = software_stock.get("quantity") + software_stock2.get("quantity") + software_stock3.get("quantity");
		String total_cd_stock = cd_stock.get("quantity") + cd_stock2.get("quantity") + cd_stock3.get("quantity");
		String total_hardware_stock = hardware_stock.get("quantity") + hardware_stock2.get("quantity") + hardware_stock3.get("quantity"); 
		
		
		//parse string to int and add them all together//
		 tbs = Integer.parseInt(total_book_stock);
		 tss = Integer.parseInt(total_software_stock);
		 tcd = Integer.parseInt(total_cd_stock);
		 ths = Integer.parseInt(total_hardware_stock);
		 
	

		
		//Initialise output via fetching stock quantities within Hashmaps//
		System.out.println("Count Stock Quantity");
		System.out.println("Books" + book_stock.get("quantity"));
		System.out.println("CD/DVDs" + cd_stock.get("quantity"));
		System.out.println("Software: " + cd_stock.get("quantity"));
		System.out.println("Hardware " + hardware_stock.get("quantity"));
		
	
		


		
//sum both amounts//
		
		
		Scanner cs_5 = new Scanner(System.in);
		System.out.println("1: Exit menu");
		int cs_5_2 = cs_5.nextInt();
		if (cs_5_2 == 1);
		System.out.println("2: Create New Stock Entry");
		System.out.println("3: Amend Stock Details");
		System.out.println("4: Delete Stock Details");
		System.out.println("5: Count Stock Quantity");
		System.out.println("6: Show Stock Sales Report");
		System.out.println("7: Show Re-Order Report");
		System.out.println("8: Exit");
		System.out.println("");

		System.out.println("Enter your choice:");
		break;
	case "6": 
	
		System.out.println("Show Stock Sales Report");
	System.out.println("Please press 1-4 for what form of the report you would like to view.");
	//break paragraph

	System.out.println("");
	Scanner ad_choice = new Scanner(System.in);
	System.out.println("1: 1 Month");
	System.out.println("2: 3 Months");
	System.out.println("3: 6 Months");
	System.out.println("4: 1 Year");
	System.out.println("5: Exit");
	int ad_choice_1 = ad_choice.nextInt();
	
	
	//1 month report//
	if (ad_choice_1 == 1);
	System.out.println("Stock Sales Report (1 Month)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Quantity Sold: " + total_sum*2);
	System.out.println("");
	
	System.out.println("Types Sold");
	System.out.println("");
	
	System.out.println("Books: " + tbs);
	System.out.println("CD/DVDs" + tcd*2);
	System.out.println("Software: " + tss*2);
	System.out.println("Hardware: " + ths*2);
	
	Scanner echeck = new Scanner(System.in);
	System.out.println("Press '5' to return to the prior menu");
	int echeck_a = echeck.nextInt();

 

	//if choose b//
	if (ad_choice_1 == 2);
	System.out.println("Stock Sales Report (3 Months)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Quantity Sold: " + total_sum*4/2);
	System.out.println("");
	
	System.out.println("Types Sold");
	System.out.println("");
	
	System.out.println("Books: " + tbs*12/2);
	System.out.println("CD/DVDs" + tcd*12/2);
	System.out.println("Software: " + tss*12/2);
	System.out.println("Hardware: " + ths*12/2);
	
	Scanner echeck_b = new Scanner(System.in);
	System.out.println("Press '5' to return to the prior menu");
	int echeckb = echeck_b.nextInt();
	
	
	if (ad_choice_1 == 3);
	
	System.out.println("Stock Sales Report (6 Months)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Quantity Sold: " + total_sum*8/2);
	System.out.println("");
	
	System.out.println("Types Sold");
	System.out.println("");
	
	System.out.println("Books: " + tbs*8/2);
	System.out.println("CD/DVDs" + tcd*8/2);
	System.out.println("Software: " + tss*8/2);
	System.out.println("Hardware: " + ths*8/2);
	
	Scanner echeck_c = new Scanner(System.in);
	System.out.println("Press '5' to return to the prior menu");
	int echeckc = echeck_c.nextInt();
	
	//1 year//
	if (ad_choice_1 == 4);
	System.out.println("Stock Sales Report (1 Year)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Quantity Sold: " + total_sum*12/2);
	System.out.println("");
	
	System.out.println("Types Sold");
	System.out.println("");
	
	System.out.println("Books: " + tbs*12/2);
	System.out.println("CD/DVDs" + tcd*12/2);
	System.out.println("Software: " + tss*12/2);
	System.out.println("Hardware: " + ths*12/2);
	
	Scanner echeck_d = new Scanner(System.in);
	System.out.println("Press '5' to return to the prior menu");
	int echeckd = echeck_d.nextInt();
	
	//break if E is selected//
	if (ad_choice_1 == 5);
	if (echeckd == 5);
	if (echeckc == 5);
	if (echeck_a == 5);
	if (echeckb == 5);
	
	System.out.println("2: Create New Stock Entry");
	System.out.println("3: Amend Stock Details");
	System.out.println("4: Delete Stock Details");
	System.out.println("5: Count Stock Quantity");
	System.out.println("6: Show Stock Sales Report");
	System.out.println("7: Show Re-Order Report");
	System.out.println("8: Exit");
	System.out.println("");

	System.out.println("Enter your choice:");
	
	break;
	
	case "7":
		System.out.println("Show Re-Order Report");
		
	System.out.println("Please press 1-4 for what form of the report you would like to view.");
	//break paragraph

	int automatic_renewal_book = 5;
	int automatic_renewal_cds = 4;
	int automatic_renewal_software = 6;
	int automatic_renewal_hardware = 3;
	
	
	System.out.println("");
	Scanner ad_choice2 = new Scanner(System.in);
	System.out.println("1: 1 Month");
	System.out.println("2: 3 Months");
	System.out.println("3: 6 Months");
	System.out.println("4: 1 Year");
	int ad_choice_2 = ad_choice2.nextInt();
	
	
	if (ad_choice_2 == 1);
	System.out.println("Stock Re-Order Report (1 Month)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Stock Available: " + total_sum);
	System.out.println("");
	
	System.out.println("Types Available");
	System.out.println("");
	
	System.out.println("Books: " + tbs);
	System.out.println("CD/DVDs" + tcd);
	System.out.println("Software: " + tss);
	System.out.println("Hardware: " + ths);
	
	System.out.println("Automatic Stock Renewal Trigger");
	System.out.println("");
	
	//renewal trigger
	System.out.println("Books" + automatic_renewal_book);
	System.out.println("CD/DVDs" + automatic_renewal_cds);
	System.out.println("Software" + automatic_renewal_software);
	System.out.println("Hardware" + automatic_renewal_hardware);
	
	System.out.println("");
	System.out.println("Total Stock Adjustments:");
	
	System.out.println("Books: 0");
	System.out.println("CD/DVDs: 0");
	System.out.println("Software: 0");
	System.out.println("Hardware: 0");
	System.out.println("");
	
	Scanner echeck_3 = new Scanner(System.in);
	System.out.println("Press 'E' to exit out of this report.");
	String echeck_33 = echeck_3.next();
	
	
	
	
	//3 months//
	
	if (ad_choice_2 == 2);
	
	//automatic renewal check//
	
	if (tbs <= automatic_renewal_book);
	 new_tbs = tbs *3;
	
	if (tcd <= automatic_renewal_cds);
	 new_tcd = tcd *3;
	
	if (tss <= automatic_renewal_software);
	 new_tss = tss *3;
	
	if (ths <= automatic_renewal_hardware);
	 new_ths = ths *3;
	
	System.out.println("Stock Re-Order Report (3 Months)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Stock Available: " + total_sum);
	System.out.println("");
	
	System.out.println("Types Available");
	System.out.println("");
	
	System.out.println("Books: " + tbs);
	System.out.println("CD/DVDs" + tcd);
	System.out.println("Software: " + tss);
	System.out.println("Hardware: " + ths);
	
	System.out.println("Automatic Stock Renewal Trigger");
	System.out.println("");
	
	//renewal trigger
	System.out.println("Books" + automatic_renewal_book);
	System.out.println("CD/DVDs" + automatic_renewal_cds);
	System.out.println("Software" + automatic_renewal_software);
	System.out.println("Hardware" + automatic_renewal_hardware);
	
	System.out.println("");
	System.out.println("Total Stock Adjustments:");
	
	System.out.println("Books: " + new_tbs);
	System.out.println("CD/DVDs: " + new_tcd);
	System.out.println("Software: " + new_tss);
	System.out.println("Hardware: " + new_ths);
	System.out.println("");
	
	
	
	Scanner echeck_2 = new Scanner(System.in);
	System.out.println("Press 'E' to exit out of this report.");
	String echeck_22 = echeck_2.next();

	//6 months//
	
	if (ad_choice_2 == 3);
	
	//automatic renewal check//
	
	if (new_tbs <= automatic_renewal_book);
	 new_new_tbs = tbs *6;
	
	if (new_tcd <= automatic_renewal_cds);
	 new_new_tcd = tcd *6;
	
	if (new_tss <= automatic_renewal_software);
	 new_new_tss = tss *6;
	
	if (new_ths <= automatic_renewal_hardware);
	 new_new_ths = ths *6;
	
	System.out.println("Stock Re-Order Report (6 Months)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Stock Available: " + total_sum);
	System.out.println("");
	
	System.out.println("Types Available");
	System.out.println("");
	
	System.out.println("Books: " + new_tbs);
	System.out.println("CD/DVDs" + new_tcd);
	System.out.println("Software: " + new_tss);
	System.out.println("Hardware: " + new_ths);
	
	System.out.println("Automatic Stock Renewal Trigger");
	System.out.println("");
	
	//renewal trigger
	System.out.println("Books" + automatic_renewal_book);
	System.out.println("CD/DVDs" + automatic_renewal_cds);
	System.out.println("Software" + automatic_renewal_software);
	System.out.println("Hardware" + automatic_renewal_hardware);
	
	System.out.println("");
	System.out.println("Total Stock Adjustments:");
	
	System.out.println("Books: " + new_new_tbs);
	System.out.println("CD/DVDs: " + new_new_tcd);
	System.out.println("Software: " + new_new_tss);
	System.out.println("Hardware: " + new_new_ths);
	System.out.println("");
	
	
	
	Scanner echeck_4 = new Scanner(System.in);
	System.out.println("Press 'E' to exit out of this report.");
	String echeck_44 = echeck_4.next();
	
	//1 Year//
	
	if (ad_choice_2 == 4);
	
	//automatic renewal check//
	
	if (new_new_tbs >= automatic_renewal_book);
	new_new_new_tbs = tbs *12;
	
	if (new_new_tcd >= automatic_renewal_cds);
	 new_new_new_tcd = tcd *12;
	
	if (new_new_tss >= automatic_renewal_software);
	 new_new_new_tss = tss *12;
	
	if (new_new_ths >= automatic_renewal_hardware);
	 new_new_new_ths = ths *12;
	
	System.out.println("Stock Re-Order Report (1 Year)");
	//line separators//
	System.out.println("");
	
	System.out.println("Total Stock Available: " + total_sum);
	System.out.println("");
	
	System.out.println("Types Available");
	System.out.println("");
	
	System.out.println("Books: " + new_new_tbs);
	System.out.println("CD/DVDs" + new_new_tcd);
	System.out.println("Software: " + new_new_tss);
	System.out.println("Hardware: " + new_new_ths);
	
	System.out.println("Automatic Stock Renewal Trigger");
	System.out.println("");
	
	//renewal trigger
	System.out.println("Books" + automatic_renewal_book);
	System.out.println("CD/DVDs" + automatic_renewal_cds);
	System.out.println("Software" + automatic_renewal_software);
	System.out.println("Hardware" + automatic_renewal_hardware);
	
	System.out.println("");
	System.out.println("Total Stock Adjustments:");
	
	System.out.println("Books: " + new_new_new_tbs);
	System.out.println("CD/DVDs: " + new_new_new_tcd);
	System.out.println("Software: " + new_new_new_tss);
	System.out.println("Hardware: " + new_new_new_ths);
	System.out.println("");
	
	
	
	Scanner echeck_5 = new Scanner(System.in);
	System.out.println("Press 'E' to exit out of this report.");
	String echeck_55 = echeck_5.next();
	
	
	if (echeck_44.equals(check_e));
	if (echeck_22.equals(check_e));
	if (echeck_33.equals(check_e));
	if (echeck_55.equals(check_e));
	if (ad_choice_2 == 5);
	
	System.out.println("2: Create New Stock Entry");
	System.out.println("3: Amend Stock Details");
	System.out.println("4: Delete Stock Details");
	System.out.println("5: Count Stock Quantity");
	System.out.println("6: Show Stock Sales Report");
	System.out.println("7: Show Re-Order Report");
	System.out.println("8: Exit");
	System.out.println("");

	System.out.println("Enter your choice:");
	
		break;
	
	case "8": 
		System.out.println("Exit");
		System.exit(0);
		input.close();
		break;
	}
	 }while (!option.equals("8"));
	
	
}}

