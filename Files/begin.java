import java.util.Scanner;
import java.util.HashMap;

public class begin {
	 @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	
		 String option = "";
		 
		 String item_id = "";
		 String price = "";
		 String ID = "";
		 String description = "";
		 String name = "";
		String quantity = "";
		String category = "";
				 
	System.out.println("1: Load Stock System");
	System.out.println("2: Create New Stock Entry");
	System.out.println("3: Amend Stock Details");
	System.out.println("4: Delete Stock Details");
	System.out.println("5: Count Stock Quantity");
	System.out.println("6: Show Stock Sales Report");
	System.out.println("7: Show Re-Order Report");
	System.out.println("8: Exit");

	Hardware hard = new Hardware();
	Books book = new Books();
	Software software = new Software();
	CD cd = new CD();
	
	
	Scanner input = new Scanner(System.in);
	

	System.out.println("Enter your choice");
	

do {
	option = input.nextLine();	
	switch (option) {
	case "1":
		System.out.println("Load Stock System");
		break;
	case "2": 
		System.out.println("1: Add a stock item");
		System.out.println("2: Exit to main menu");	
		
		
		Scanner new_stock = new Scanner(System.in);
		System.out.println("Enter \"1\", \"2\" or \"3\"");
		
		
		int stock_choice = new_stock.nextInt();
		Scanner item_id_input = new Scanner(System.in);	
		while (stock_choice != 2)
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
			System.out.println("Please type in a category (Hardware/Software/CDs/Books");
			category = category_input.next();
			
			
			System.out.println("Item Added:" + item_id);
			System.out.println("Name: " + name);
			System.out.println("Description " + description);
			System.out.println("Quantity" + quantity);
			System.out.println("Price " + price);
			System.out.println("Your stock item will be stored as stock_h_1, use this for editing the stock.");
			
	//Hardware Storage//
			if (category_input.equals("Hardware")); //utilise hashmaps for storing entered stock//
			HashMap<String, String> hardware_stock = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			hardware_stock.put(item_id, name);
			hardware_stock.put(description, quantity);
			hardware_stock.put(price, category);
			
			HashMap<String, String> hardware_stock2 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(hardware_stock.containsKey(item_id));
			hardware_stock2.put(item_id, name);
			hardware_stock2.put(description, quantity);
			hardware_stock2.put(price, category);
			
			HashMap<String, String> hardware_stock3 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(hardware_stock2.containsKey(item_id));
			hardware_stock3.put(item_id, name);
			hardware_stock3.put(description, quantity);
			hardware_stock3.put(price, category);
			
			
			//Software Storage//
			if (category_input.equals("Software")); //utilise hashmaps for storing entered stock//
			HashMap<String, String> software_stock = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			software_stock.put(item_id, name);
			software_stock.put(description, quantity);
			software_stock.put(price, category);
			
			HashMap<String, String> software_stock2 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(software_stock.containsKey(item_id));
			software_stock2.put(item_id, name);
			software_stock2.put(description, quantity);
			software_stock2.put(price, category);
			
			HashMap<String, String> software_stock3 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(software_stock2.containsKey(item_id));
			software_stock3.put(item_id, name);
			software_stock3.put(description, quantity);
			software_stock3.put(price, category);
			
		
			
			//Book storage//
			
			
			if (category_input.equals("Books")); //utilise hashmaps for storing entered stock//
			HashMap<String, String> book_stock = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			book_stock.put(item_id, name);
			book_stock.put(description, quantity);
			book_stock.put(price, category);
			
			HashMap<String, String> book_stock2 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(book_stock.containsKey(item_id));
			book_stock2.put(item_id, name);
			book_stock2.put(description, quantity);
			book_stock2.put(price, category);
			
			HashMap<String, String> book_stock3 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(book_stock2.containsKey(item_id));
			book_stock3.put(item_id, name);
			book_stock3.put(description, quantity);
			book_stock3.put(price, category);
			
			
			//CD storage//
			
			if (category_input.equals("CDs")); //utilise hashmaps for storing entered stock//
			HashMap<String, String> cd_stock = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			cd_stock.put(item_id, name);
			cd_stock.put(description, quantity);
			cd_stock.put(price, category);
			
			HashMap<String, String> cd_stock2 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(cd_stock.containsKey(item_id));
			cd_stock2.put(item_id, name);
			cd_stock2.put(description, quantity);
			cd_stock2.put(price, category);
			
			HashMap<String, String> cd_stock3 = new HashMap<String, String>(); //generate hashmaps for editing them later on//
			if(cd_stock2.containsKey(item_id));
			cd_stock3.put(item_id, name);
			cd_stock3.put(description, quantity);
			cd_stock3.put(price, category);
			
			
		
		break;
	case "3":
		System.out.println("Amend Stock Details");
		System.out.println("1: Edit an item");
		System.out.println("2. Exit the menu");
		Scanner amend_stock = new Scanner(System.in);
		System.out.println("Enter \"1\" or \"2\"");
		
		
		int amend_choice = amend_stock.nextInt();
		while (amend_choice !=2);
		
		//Hardware//
		
		Scanner amend_choice_stock = new Scanner(System.in);
		System.out.println("What category do you want to amend? (Hardware/Software/CD/Books");
		if (amend_choice_stock.equals("Hardware"));
		
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
		amended_id_h = hardware_stock.put(ID, amended_id_h);
		
		//name amending//
		
		Scanner amend_name_h = new Scanner(System.in);
		System.out.println("Enter Item Name");
		String amended_name_h = amend_name_h.next();
		amended_name_h = hardware_stock.put(name, amended_name_h);
		
		//description amending//
		Scanner amend_desc_h = new Scanner(System.in);
		System.out.print("Enter Description");
		String amended_desc_h = amend_desc_h.next();
		amended_desc_h = hardware_stock.put(description, amended_desc_h);
		
		//quantity amending//
		Scanner amend_quan_h = new Scanner(System.in);
		System.out.println("Enter quantity");
				String amended_quan_h = amend_quan_h.next();
				amended_quan_h = hardware_stock.put(quantity, amended_quan_h);
				
				
				//price editing//
				Scanner amend_price_h = new Scanner(System.in);
				System.out.println("Enter Price");
				String amended_price_h = amend_price_h.next();
				amended_price_h = hardware_stock.put(price, amended_price_h);
		
		if (amended_h_choice == 2);
		Scanner amend_id_h2 = new Scanner(System.in);
		System.out.println("Enter Item ID");
		String amended_id_h2 = amend_id_h.next();
		amended_id_h2 = hardware_stock2.put(ID, amended_id_h2);
		
		Scanner amend_name_h2 = new Scanner(System.in);
		System.out.println("Enter Item Name");
		String amended_name_h2 = amend_name_h.next();
		amended_name_h2 = hardware_stock2.put(name, amended_name_h2);
		
		//description amending//
		Scanner amend_desc_h2 = new Scanner(System.in);
		System.out.print("Enter Description");
		String amended_desc_h2 = amend_desc_h.next();
		amended_desc_h2 = hardware_stock2.put(description, amended_desc_h2);
		
		//quantity amending//
		Scanner amend_quan_h2 = new Scanner(System.in);
		System.out.println("Enter quantity");
				String amended_quan_h2 = amend_quan_h2.next();
				amended_quan_h2 = hardware_stock.put(quantity, amended_quan_h2);
				
				
				//price editing//
				Scanner amend_price_h2 = new Scanner(System.in);
				System.out.println("Enter Price");
				String amended_price_h2 = amend_price_h2.next();
				amended_price_h2 = hardware_stock2.put(price, amended_price_h2);
		
		
				
				//3rd hardware//
		if (amended_h_choice == 3);
		System.out.print(hardware_stock3);
		Scanner amend_id_h3 = new Scanner(System.in);
		System.out.println("Enter Item ID");
		String amended_id_h3 = amend_id_h.next();
		amended_id_h3 = hardware_stock3.put(ID, amended_id_h3);
		
		Scanner amend_name_h3 = new Scanner(System.in);
		System.out.println("Enter Item Name");
		String amended_name_h3 = amend_name_h.next();
		amended_name_h3 = hardware_stock3.put(name, amended_name_h3);
		
		//description amending//
		Scanner amend_desc_h3 = new Scanner(System.in);
		System.out.print("Enter Description");
		String amended_desc_h3 = amend_desc_h.next();
		amended_desc_h = hardware_stock3.put(description, amended_desc_h3);
		
		//quantity amending//
		Scanner amend_quan_h3 = new Scanner(System.in);
		System.out.println("Enter quantity");
				String amended_quan_h3 = amend_quan_h.next();
				amended_quan_h = hardware_stock3.put(quantity, amended_quan_h3);
				
				
				//price editing//
				Scanner amend_price_h3 = new Scanner(System.in);
				System.out.println("Enter Price");
				String amended_price_h3 = amend_price_h.next();
				amended_price_h3 = hardware_stock3.put(price, amended_price_h3);
		
				
				
				//software
				
				if (amend_choice_stock.equals("Software"));
				
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
				amended_id_s = software_stock.put(ID, amended_id_s);
				
				//name amending//
				
				Scanner amend_name_s = new Scanner(System.in);
				System.out.println("Enter Item Name");
				String amended_name_s = amend_name_s.next();
				amended_name_s = software_stock.put(name, amended_name_s);
				
				//description amending//
				Scanner amend_desc_s = new Scanner(System.in);
				System.out.print("Enter Description");
				String amended_desc_s = amend_desc_s.next();
				amended_desc_s = software_stock.put(description, amended_desc_s);
				
				//quantity amending//
				Scanner amend_quan_s = new Scanner(System.in);
				System.out.println("Enter quantity");
						String amended_quan_s = amend_quan_s.next();
						amended_quan_s = software_stock.put(quantity, amended_quan_s);
						
						
						//price editing//
						Scanner amend_price_s = new Scanner(System.in);
						System.out.println("Enter Price");
						String amended_price_s = amend_price_s.next();
						amended_price_s = software_stock.put(price, amended_price_s);
				
				if (amended_s_choice == 2);
				Scanner amend_id_s2 = new Scanner(System.in);
				System.out.println("Enter Item ID");
				String amended_id_s2 = amend_id_s.next();
				amended_id_s2 = software_stock2.put(ID, amended_id_s2);
				
				Scanner amend_name_s2 = new Scanner(System.in);
				System.out.println("Enter Item Name");
				String amended_name_s2 = amend_name_s.next();
				amended_name_s2 = software_stock2.put(name, amended_name_s2);
				
				//description amending//
				Scanner amend_desc_s2 = new Scanner(System.in);
				System.out.print("Enter Description");
				String amended_desc_s2 = amend_desc_s.next();
				amended_desc_s2 = software_stock2.put(description, amended_desc_s2);
				
				//quantity amending//
				Scanner amend_quan_s2 = new Scanner(System.in);
				System.out.println("Enter quantity");
						String amended_quan_s2 = amend_quan_s2.next();
						amended_quan_s2 = software_stock.put(quantity, amended_quan_s2);
						
						
						//price editing//
						Scanner amend_price_s2 = new Scanner(System.in);
						System.out.println("Enter Price");
						String amended_price_s2 = amend_price_s2.next();
						amended_price_s2 = software_stock2.put(price, amended_price_s2);
				
				
						
						//3rd software//
				if (amended_s_choice == 3);
				System.out.print(software_stock3);
				Scanner amend_id_s3 = new Scanner(System.in);
				System.out.println("Enter Item ID");
				String amended_id_s3 = amend_id_s.next();
				amended_id_s3 = software_stock3.put(ID, amended_id_s3);
				
				Scanner amend_name_s3 = new Scanner(System.in);
				System.out.println("Enter Item Name");
				String amended_name_s3 = amend_name_s.next();
				amended_name_s3 = software_stock3.put(name, amended_name_s3);
				
				//description amending//
				Scanner amend_desc_s3 = new Scanner(System.in);
				System.out.print("Enter Description");
				String amended_desc_s3 = amend_desc_s.next();
				amended_desc_s3 = software_stock3.put(description, amended_desc_s3);
				
				//quantity amending//
				Scanner amend_quan_s3 = new Scanner(System.in);
				System.out.println("Enter quantity");
						String amended_quan_s3 = amend_quan_s.next();
						amended_quan_s3 = software_stock3.put(quantity, amended_quan_s3);
						
						
						//price editing//
						Scanner amend_price_s3 = new Scanner(System.in);
						System.out.println("Enter Price");
						String amended_price_s3 = amend_price_s.next();
						amended_price_s3 = software_stock3.put(price, amended_price_s3);
				
				
				
				
				//books///
						
						
						if (amend_choice_stock.equals("Books"));
						
						Scanner amend_b_choice = new Scanner(System.in);
						System.out.println("Select an item from the list:");
						System.out.println("1.  book_stock");
						System.out.println("2. book_stock2");
						System.out.println("3. book_stock3");
						int amended_b_choice = amend_b_choice.nextInt();
						
						//id amending
						
						if (amended_b_choice == 1);
						Scanner amend_id_b = new Scanner(System.in);
						System.out.println("Enter Item ID");
						String amended_id_b = amend_id_b.next();
						amended_id_b = book_stock.put(ID, amended_id_b);
						
						//name amending//
						
						Scanner amend_name_b = new Scanner(System.in);
						System.out.println("Enter Item Name");
						String amended_name_b = amend_name_b.next();
						amended_name_b = book_stock.put(name, amended_name_b);
						
						//description amending//
						Scanner amend_desc_b = new Scanner(System.in);
						System.out.print("Enter Description");
						String amended_desc_b = amend_desc_b.next();
						amended_desc_b = book_stock.put(description, amended_desc_b);
						
						//quantity amending//
						Scanner amend_quan_b = new Scanner(System.in);
						System.out.println("Enter quantity");
								String amended_quan_b = amend_quan_b.next();
								amended_quan_b = book_stock.put(quantity, amended_quan_b);
								
								
								//price editing//
								Scanner amend_price_b = new Scanner(System.in);
								System.out.println("Enter Price");
								String amended_price_b = amend_price_b.next();
								amended_price_b = book_stock.put(price, amended_price_b);
						
						if (amended_b_choice == 2);
						Scanner amend_id_b2 = new Scanner(System.in);
						System.out.println("Enter Item ID");
						String amended_id_b2 = amend_id_b.next();
						amended_id_b2 = book_stock2.put(ID, amended_id_b2);
						
						Scanner amend_name_b2 = new Scanner(System.in);
						System.out.println("Enter Item Name");
						String amended_name_b2 = amend_name_b.next();
						amended_name_b2 = book_stock2.put(name, amended_name_b2);
						
						//description amending//
						Scanner amend_desc_b2 = new Scanner(System.in);
						System.out.print("Enter Description");
						String amended_desc_b2 = amend_desc_b.next();
						amended_desc_b2 = book_stock2.put(description, amended_desc_b2);
						
						//quantity amending//
						Scanner amend_quan_b2 = new Scanner(System.in);
						System.out.println("Enter quantity");
								String amended_quan_b2 = amend_quan_b2.next();
								amended_quan_b2 = book_stock.put(quantity, amended_quan_b2);
								
								
								//price editing//
								Scanner amend_price_b2 = new Scanner(System.in);
								System.out.println("Enter Price");
								String amended_price_b2 = amend_price_b2.next();
								amended_price_b2 = book_stock2.put(price, amended_price_b2);
						
						
								
								//3rd book//
						if (amended_b_choice == 3);
						System.out.print(book_stock3);
						Scanner amend_id_b3 = new Scanner(System.in);
						System.out.println("Enter Item ID");
						String amended_id_b3 = amend_id_b.next();
						amended_id_b3 = book_stock3.put(ID, amended_id_b3);
						
						Scanner amend_name_b3 = new Scanner(System.in);
						System.out.println("Enter Item Name");
						String amended_name_b3 = amend_name_b.next();
						amended_name_b3 = book_stock3.put(name, amended_name_b3);
						
						//description amending//
						Scanner amend_desc_b3 = new Scanner(System.in);
						System.out.print("Enter Description");
						String amended_desc_b3 = amend_desc_b.next();
						amended_desc_b = book_stock3.put(description, amended_desc_b3);
						
						//quantity amending//
						Scanner amend_quan_b3 = new Scanner(System.in);
						System.out.println("Enter quantity");
								String amended_quan_b3 = amend_quan_b.next();
								amended_quan_b = book_stock3.put(quantity, amended_quan_b3);
								
								
								//price editing//
								Scanner amend_price_b3 = new Scanner(System.in);
								System.out.println("Enter Price");
								String amended_price_b3 = amend_price_b.next();
								amended_price_b3 = book_stock3.put(price, amended_price_b3);
						
				
				//cds/
								
								if (amend_choice_stock.equals("cd"));
								
								Scanner amend_c_choice = new Scanner(System.in);
								System.out.println("Select an item from the list:");
								System.out.println("1.  cd_stock");
								System.out.println("2. cd_stock2");
								System.out.println("3. cd_stock3");
								int amended_c_choice = amend_c_choice.nextInt();
								
								//id amending
								
								if (amended_c_choice == 1);
								Scanner amend_id_c = new Scanner(System.in);
								System.out.println("Enter Item ID");
								String amended_id_c = amend_id_c.next();
								amended_id_c = cd_stock.put(ID, amended_id_c);
								
								//name amending//
								
								Scanner amend_name_c = new Scanner(System.in);
								System.out.println("Enter Item Name");
								String amended_name_c = amend_name_c.next();
								amended_name_c = cd_stock.put(name, amended_name_c);
								
								//description amending//
								Scanner amend_desc_c = new Scanner(System.in);
								System.out.print("Enter Description");
								String amended_desc_c = amend_desc_c.next();
								amended_desc_c = cd_stock.put(description, amended_desc_c);
								
								//quantity amending//
								Scanner amend_quan_c = new Scanner(System.in);
								System.out.println("Enter quantity");
										String amended_quan_c = amend_quan_c.next();
										amended_quan_c = cd_stock.put(quantity, amended_quan_c);
										
										
										//price editing//
										Scanner amend_price_c = new Scanner(System.in);
										System.out.println("Enter Price");
										String amended_price_c = amend_price_c.next();
										amended_price_c = cd_stock.put(price, amended_price_c);
								
								if (amended_c_choice == 2);
								Scanner amend_id_c2 = new Scanner(System.in);
								System.out.println("Enter Item ID");
								String amended_id_c2 = amend_id_c.next();
								amended_id_c2 = cd_stock2.put(ID, amended_id_c2);
								
								Scanner amend_name_c2 = new Scanner(System.in);
								System.out.println("Enter Item Name");
								String amended_name_c2 = amend_name_c.next();
								amended_name_c2 = cd_stock2.put(name, amended_name_c2);
								
								//description amending//
								Scanner amend_desc_c2 = new Scanner(System.in);
								System.out.print("Enter Description");
								String amended_desc_c2 = amend_desc_c.next();
								amended_desc_c2 = cd_stock2.put(description, amended_desc_c2);
								
								//quantity amending//
								Scanner amend_quan_c2 = new Scanner(System.in);
								System.out.println("Enter quantity");
										String amended_quan_c2 = amend_quan_c2.next();
										amended_quan_c2 = cd_stock.put(quantity, amended_quan_c2);
										
										
										//price editing//
										Scanner amend_price_c2 = new Scanner(System.in);
										System.out.println("Enter Price");
										String amended_price_c2 = amend_price_c2.next();
										amended_price_c2 = cd_stock2.put(price, amended_price_c2);
								
								
										
										//3rd cd//
								if (amended_c_choice == 3);
								System.out.print(cd_stock3);
								Scanner amend_id_c3 = new Scanner(System.in);
								System.out.println("Enter Item ID");
								String amended_id_c3 = amend_id_c.next();
								amended_id_c3 = cd_stock3.put(ID, amended_id_c3);
								
								Scanner amend_name_c3 = new Scanner(System.in);
								System.out.println("Enter Item Name");
								String amended_name_c3 = amend_name_c.next();
								amended_name_c3 = cd_stock3.put(name, amended_name_c3);
								
								//description amending//
								Scanner amend_desc_c3 = new Scanner(System.in);
								System.out.print("Enter Description");
								String amended_desc_c3 = amend_desc_c.next();
								amended_desc_c = cd_stock3.put(description, amended_desc_c3);
								
								//quantity amending//
								Scanner amend_quan_c3 = new Scanner(System.in);
								System.out.println("Enter quantity");
										String amended_quan_c3 = amend_quan_c.next();
										amended_quan_c = cd_stock3.put(quantity, amended_quan_c3);
										
										
										//price editing//
										Scanner amend_price_c3 = new Scanner(System.in);
										System.out.println("Enter Price");
										String amended_price_c3 = amend_price_c.next();
										amended_price_c3 = cd_stock3.put(price, amended_price_c3);
													

				
				
		
		break;
	case "4": 
		System.out.println("Delete Stock Details");
		Scanner delete_stock = new Scanner(System.in);
		
		System.out.println("1: Delete an item");
		System.out.println("2: Exit the menu");
		int delete_stock_o = delete_stock.nextInt();
		while (delete_stock_o != 2);
		
		Scanner list_choice_del = new Scanner(System.in);
		System.out.println("Select an option from the list");
		System.out.println("1: cd_stock3");
		System.out.println("2: book_stock2");
		System.out.println("3: software_stock");
		System.out.println("4: cd_stock");
		System.out.println("5: software_stock2");
		int list_choice_del_o = list_choice_del.nextInt();
		if (list_choice_del_o >0 && list_choice_del_o <=5 );
		
		//play message regardless of choice//
		Scanner yn = new Scanner(System.in);
		System.out.println("Are you sure you want to delete this item? 'Y' or 'N'");
		String ynn = yn.next();
		while (ynn != "N");
		System.out.println("Item details have been deleted.");
		//focus clearance on choice//
		if (list_choice_del_o == 1);
		cd_stock3.clear();
		
		if (list_choice_del_o == 2);
		book_stock2.clear();
		
		if (list_choice_del_o == 3);
		software_stock.clear();
		
		if (list_choice_del_o == 4);
		cd_stock.clear();
		
		if (list_choice_del_o == 5);
		software_stock2.clear();
		break;
	
	case "5":
		
		//Initialise count via fetching stock quantities within Hashmaps//
		System.out.println("Count Stock Quantity");
		System.out.println("Books" + book_stock.get(quantity) + book_stock2.get(quantity) + book_stock3.get(quantity));
		System.out.println("Software: " + software_stock.get(quantity) + software_stock2.get(quantity) + software_stock3.get(quantity));
		System.out.println("Hardware " + hardware_stock.get(quantity) + hardware_stock2.get(quantity) + hardware_stock3.get(quantity));
		
		Scanner cs_5 = new Scanner(System.in);
		System.out.println("1: Exit menu");
		int cs_5_2 = cs_5.nextInt();
		if (cs_5_2 == 5);
		
		break;
	case "6": 
	System.out.println("Show Stock Sales Report");
	break;
	
	case "7":
		System.out.println("Show Re-Order Report");
		break;
	
	case "8": 
		System.out.println("Exit");
		break;
	}
}while (!option.equals("8"));
	

	 

	
	
	}

}