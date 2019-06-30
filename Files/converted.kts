import java.util.*

object Stock_system {
    @JvmStatic
    fun main(args: Array<String>) {

        var option = ""

        var item_id = ""
        var price = ""
        var description = ""
        var name = ""
        var quantity = ""
        val category = ""
        var category_o = 0


        //hashmap declaration// used for avoiding non-itilisation errors//
        val book_stock = HashMap<String, String>() //generate book hashmaps
        val book_stock2 = HashMap<String, String>()
        val book_stock3 = HashMap<String, String>()

        val cd_stock = HashMap<String, String>() //generate CD hashmaps
        val cd_stock2 = HashMap<String, String>()
        val cd_stock3 = HashMap<String, String>()

        val software_stock = HashMap<String, String>() //generate software hashmaps
        val software_stock2 = HashMap<String, String>()
        val software_stock3 = HashMap<String, String>()

        val hardware_stock = HashMap<String, String>() //generate hardware hashmaps
        val hardware_stock2 = HashMap<String, String>()
        val hardware_stock3 = HashMap<String, String>()

        //stock declarations/
        var new_new_new_tbs = 0
        var new_new_new_tcd = 0
        var new_new_new_ths = 0
        var new_new_new_tss = 0

        var new_new_tbs = 0
        var new_new_tcd = 0
        var new_new_ths = 0
        var new_new_tss = 0

        var new_tbs = 0
        var new_tcd = 0
        var new_ths = 0
        var new_tss = 0

        var tbs: Int? = 0
        var tcd: Int? = 0
        var ths: Int? = 0
        var tss: Int? = 0

        val total_sum = 0


        //option report checks for string comparisons
        val check_h = String("Hardware")
        val check_s = String("Software")
        val check_b = String("Books")
        val check_cd = String("CDs")


        //adding hashmap check//

        val check_h1 = 1
        val check_s2 = 2
        val check_b3 = 3
        val check_cd4 = 4


        //option choice check comparisons//
        val check_a = String("A")
        val checkb = String("B")
        val check_c = String("C")
        val check_d = String("D")
        val check_e = String("E")

        println("2: Create New Stock Entry")
        println("3: Amend Stock Details")
        println("4: Delete Stock Details")
        println("5: Count Stock Quantity")
        println("6: Show Stock Sales Report")
        println("7: Show Re-Order Report")
        println("8: Exit")


        val input = Scanner(System.`in`)


        println("Enter your choice:")


        do {
            option = input.nextLine()
            when (option) {

                "2" -> {
                    println("1: Add a stock item")
                    println("2: Exit to main menu")


                    val new_stock = Scanner(System.`in`)
                    println("Enter \"1\" or \"2\"")


                    val stock_choice = new_stock.nextInt()
                    val item_id_input = Scanner(System.`in`)
                    if (stock_choice == 1)
                        println("Please enter Item ID")
                    item_id = item_id_input.next()

                    val item_name = Scanner(System.`in`)
                    println("Enter Item Name")
                    name = item_name.next()


                    val item_description_input = Scanner(System.`in`)
                    println("Enter Description")
                    description = item_description_input.next()


                    val input_quantity = Scanner(System.`in`)
                    println("Enter Quantity (a number)")
                    quantity = input_quantity.next()


                    val input_price = Scanner(System.`in`)
                    println("Enter Price")
                    price = input_price.next()

                    val category_input = Scanner(System.`in`)
                    println("Please choose a category from 1-4")
                    println("1: Hardware")
                    println("2: Software")
                    println("3: Books")
                    println("4: CD/DVDs")
                    println("")
                    category_o = category_input.nextInt()


                    println("")
                    println("Item Added: $item_id")
                    println("Name: $name")
                    println("Description: $description")
                    println("Quantity: $quantity")
                    println("Price: $price")
                    println("")

                    //Hardware Storage//

                    //if key exists, then add it to the second hashmap checks//

                    if (category_o == check_h1) { //utilise hashmaps for storing entered stock/

                        hardware_stock["item_id"] = item_id
                        hardware_stock["description"] = description
                        hardware_stock["price"] = price
                        hardware_stock["quantity"] = quantity
                        hardware_stock["category"] = category
                        hardware_stock["name"] = name


                        if (hardware_stock.containsKey("item_id"))
                            hardware_stock2["item_id"] = item_id
                        hardware_stock2["name"] = name
                        hardware_stock2["description"] = description
                        hardware_stock2["quantity"] = quantity
                        hardware_stock2["price"] = price
                        hardware_stock2["category"] = category


                        if (hardware_stock2.containsKey("item_id"))
                            hardware_stock3["item_id"] = item_id
                        hardware_stock3["name"] = name
                        hardware_stock3["description"] = description
                        hardware_stock3["quantity"] = quantity
                        hardware_stock3["price"] = price
                        hardware_stock3["category"] = category

                    }

                    //Software Storage//
                    if (category_o == check_s2) {//utilise hashmaps for storing entered stock//

                        software_stock["item_id"] = item_id
                        software_stock["name"] = name
                        software_stock["description"] = description
                        software_stock["quantity"] = quantity
                        software_stock["price"] = price
                        software_stock["category"] = category


                        if (software_stock.containsKey("item_id"))
                            software_stock2["item_id"] = item_id
                        software_stock2["name"] = name
                        software_stock2["description"] = description
                        software_stock2["quantity"] = quantity
                        software_stock2["price"] = price
                        software_stock2["category"] = category



                        if (software_stock2.containsKey("item_id"))
                            software_stock3["item_id"] = item_id
                        software_stock3["name"] = name
                        software_stock3["description"] = description
                        software_stock3["quantity"] = quantity
                        software_stock3["price"] = price
                        software_stock3["category"] = category

                    }

                    //Book storage//


                    if (category_o == check_b3) { //utilise hashmaps for storing entered stock//

                        book_stock["ID"] = item_id
                        book_stock["name"] = name
                        book_stock["description"] = description
                        book_stock["quantity"] = quantity
                        book_stock["price"] = price
                        book_stock["category"] = category


                        if (book_stock.containsKey("ID"))
                            book_stock2["ID"] = item_id
                        book_stock2["name"] = name
                        book_stock2["description"] = description
                        book_stock2["quantity"] = quantity
                        book_stock2["price"] = price
                        book_stock2["category"] = category
                    }

                    if (book_stock2.containsKey("ID"));
                    book_stock3["ID"] = item_id
                    book_stock3["name"] = name
                    book_stock3["description"] = description
                    book_stock3["quantity"] = quantity
                    book_stock3["price"] = price
                    book_stock3["category"] = category

                    //CD storage//

                    if (category_o == check_cd4);  //utilise hashmaps for storing entered stock//

                    cd_stock["ID"] = item_id
                    cd_stock["name"] = name
                    cd_stock["description"] = description
                    cd_stock["quantity"] = quantity
                    cd_stock["price"] = price
                    cd_stock["category"] = category

                    if (cd_stock.containsKey("ID"));
                    run({
                        cd_stock2["ID"] = item_id
                        cd_stock2["name"] = name
                        cd_stock2["description"] = description
                        cd_stock2["quantity"] = quantity
                        cd_stock2["price"] = price
                        cd_stock2.run { put("category", category) }
                    })

                    if (cd_stock2.containsKey("ID"));
                    run {
                        cd_stock3["ID"] = item_id
                        cd_stock3["name"] = name
                        cd_stock3["description"] = description
                        cd_stock3["quantity"] = quantity
                        cd_stock3["price"] = price
                        cd_stock3.put("category", category)
                    }

                    if (stock_choice == 2);
                    println("")
                    println("2: Create New Stock Entry")
                    println("3: Amend Stock Details")
                    println("4: Delete Stock Details")
                    println("5: Count Stock Quantity")
                    println("6: Show Stock Sales Report")
                    println("7: Show Re-Order Report")
                    println("8: Exit")
                    println("")

                    println("Enter your choice:")
                }
                "3" -> {
                    println("Amend Stock Details")
                    println("1: Edit an item")
                    println("2. Exit the menu")
                    val amend_stock = Scanner(System.`in`)
                    println("Enter \"1\" or \"2\"")


                    val amend_choice = amend_stock.nextInt()
                    if (amend_choice == 1);

                    //Hardware//

                    val amend_choice_stock = Scanner(System.`in`)

                    println("What category do you want to amend? (Hardware/Software/CD/Books")
                    if (amend_choice_stock == check_h);

                    val amend_h_choice = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1.  hardware_stock")
                    println("2. hardware_stock2")
                    println("3. hardware_stock3")
                    val amended_h_choice = amend_h_choice.nextInt()

                    //id amending

                    if (amended_h_choice == 1);
                    val amend_id_h = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_h = amend_id_h.next()
                    amended_id_h = hardware_stock.put("ID", amended_id_h)

                    //name amending//

                    val amend_name_h = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_h = amend_name_h.next()
                    amended_name_h = hardware_stock.put("name", amended_name_h)

                    //"description" amending//
                    val amend_desc_h = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_h = amend_desc_h.next()
                    amended_desc_h = hardware_stock.put("description", amended_desc_h)

                    //quantity amending//
                    val amend_quan_h = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_h = amend_quan_h.next()
                    amended_quan_h = hardware_stock.put("quantity", amended_quan_h)


                    //price editing//
                    val amend_price_h = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_h = amend_price_h.next()
                    amended_price_h = hardware_stock.put("price", amended_price_h)

                    val amend_choice_stock2 = Scanner(System.`in`)

                    println("What category do you want to amend? (Hardware/Software/CD/Books")
                    if (amend_choice_stock2 == check_h);

                    val amend_h_choice2 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1.  hardware_stock")
                    println("2. hardware_stock2")
                    println("3. hardware_stock3")
                    val amended_h_choice2 = amend_h_choice2.nextInt()

                    if (amended_h_choice2 == 2);
                    val amend_id_h2 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_h2 = amend_id_h2.next()
                    amended_id_h2 = hardware_stock2.put("ID", amended_id_h2)

                    val amend_name_h2 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_h2 = amend_name_h2.next()
                    amended_name_h2 = hardware_stock2.put("name", amended_name_h2)

                    //"description" amending//
                    val amend_desc_h2 = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_h2 = amend_desc_h2.next()
                    amended_desc_h2 = hardware_stock2.put("description", amended_desc_h2)

                    //quantity amending//
                    val amend_quan_h2 = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_h2 = amend_quan_h2.next()
                    amended_quan_h2 = hardware_stock.put("quantity", amended_quan_h2)


                    //price editing//
                    val amend_price_h2 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_h2 = amend_price_h2.next()
                    amended_price_h2 = hardware_stock2.put("price", amended_price_h2)

                    val amend_choice_stock3 = Scanner(System.`in`)

                    println("What category do you want to amend? (Hardware/Software/CD/Books")
                    if (amend_choice_stock3 == check_h);

                    val amend_h_choice3 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1.  hardware_stock")
                    println("2. hardware_stock2")
                    println("3. hardware_stock3")
                    println("4: Exit")
                    val amended_h_choice3 = amend_h_choice3.nextInt()

                    //3rd hardware//
                    if (amended_h_choice3 == 3);
                    print(hardware_stock3)
                    val amend_id_h3 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_h3 = amend_id_h3.next()
                    amended_id_h3 = hardware_stock3.put("ID", amended_id_h3)

                    val amend_name_h3 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_h3 = amend_name_h3.next()
                    amended_name_h3 = hardware_stock3.put("name", amended_name_h3)

                    //"description" amending//
                    val amend_desc_h3 = Scanner(System.`in`)
                    println("Enter description")
                    val amended_desc_h3 = amend_desc_h3.next()
                    amended_desc_h = hardware_stock3.put("description", amended_desc_h3)

                    //quantity amending//
                    val amend_quan_h3 = Scanner(System.`in`)
                    println("Enter quantity")
                    val amended_quan_h3 = amend_quan_h3.next()
                    amended_quan_h = hardware_stock3.put("quantity", amended_quan_h3)


                    //price editing//
                    val amend_price_h3 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_h3 = amend_price_h3.next()
                    amended_price_h3 = hardware_stock3.put("price", amended_price_h3)


                    //software choice - present menu, and add to hashmap

                    if (amend_choice_stock == check_s);

                    val amend_s_choice = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1.  software_stock")
                    println("2. software_stock2")
                    println("3. software_stock3")
                    val amended_s_choice = amend_s_choice.nextInt()

                    //id amending

                    if (amended_s_choice == 1);
                    val amend_id_s = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_s = amend_id_s.next()
                    amended_id_s = software_stock.put("ID", amended_id_s)

                    //name amending//

                    val amend_name_s = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_s = amend_name_s.next()
                    amended_name_s = software_stock.put("name", amended_name_s)

                    //"description" amending//
                    val amend_desc_s = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_s = amend_desc_s.next()
                    amended_desc_s = software_stock.put("description", amended_desc_s)

                    //quantity amending//
                    val amend_quan_s = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_s = amend_quan_s.next()
                    amended_quan_s = software_stock.put("quantity", amended_quan_s)


                    //price editing//
                    val amend_price_s = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_s = amend_price_s.next()
                    amended_price_s = software_stock.put("price", amended_price_s)

                    val amend_s_choice2 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1.  software_stock")
                    println("2. software_stock2")
                    println("3. software_stock3")
                    println("4: Exit")
                    val amended_s_choice2 = amend_s_choice2.nextInt()

                    if (amended_s_choice2 == 2);
                    val amend_id_s2 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_s2 = amend_id_s2.next()
                    amended_id_s2 = software_stock2.put("ID", amended_id_s2)

                    val amend_name_s2 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_s2 = amend_name_s2.next()
                    amended_name_s2 = software_stock2.put("name", amended_name_s2)

                    //"description" amending//
                    val amend_desc_s2 = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_s2 = amend_desc_s2.next()
                    amended_desc_s2 = software_stock2.put("description", amended_desc_s2)

                    //quantity amending//
                    val amend_quan_s2 = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_s2 = amend_quan_s2.next()
                    amended_quan_s2 = software_stock2.put("quantity", amended_quan_s2)


                    //price editing//
                    val amend_price_s2 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_s2 = amend_price_s2.next()
                    amended_price_s2 = software_stock2.put("price", amended_price_s2)


                    val amend_s_choice3 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1.  software_stock")
                    println("2. software_stock2")
                    println("3. software_stock3")
                    println("4: Exit")
                    val amended_s_choice3 = amend_s_choice3.nextInt()
                    //3rd software//
                    if (amended_s_choice3 == 3);
                    print(software_stock3)
                    val amend_id_s3 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_s3 = amend_id_s3.next()
                    amended_id_s3 = software_stock3.put("ID", amended_id_s3)

                    val amend_name_s3 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_s3 = amend_name_s3.next()
                    amended_name_s3 = software_stock3.put("name", amended_name_s3)

                    //"description" amending//
                    val amend_desc_s3 = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_s3 = amend_desc_s3.next()
                    amended_desc_s3 = software_stock3.put("description", amended_desc_s3)

                    //quantity amending//
                    val amend_quan_s3 = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_s3 = amend_quan_s3.next()
                    amended_quan_s3 = software_stock3.put("quantity", amended_quan_s3)


                    //price editing//
                    val amend_price_s3 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_s3 = amend_price_s3.next()
                    amended_price_s3 = software_stock3.put("price", amended_price_s3)


                    //books///


                    if (amend_choice_stock == check_b);

                    val amend_b_choice = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1. book_stock")
                    println("2. book_stock2")
                    println("3. book_stock3")
                    val amended_b_choice = amend_b_choice.nextInt()

                    //id amending

                    if (amended_b_choice == 1);
                    val amend_id_b = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_b = amend_id_b.next()
                    amended_id_b = book_stock.put("ID", amended_id_b)

                    //name amending//

                    val amend_name_b = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_b = amend_name_b.next()
                    amended_name_b = book_stock.put("name", amended_name_b)

                    //"description" amending//
                    val amend_desc_b = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_b = amend_desc_b.next()
                    amended_desc_b = book_stock.put("description", amended_desc_b)

                    //quantity amending//
                    val amend_quan_b = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_b = amend_quan_b.next()
                    amended_quan_b = book_stock.put("quantity", amended_quan_b)


                    //price editing//
                    val amend_price_b = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_b = amend_price_b.next()
                    amended_price_b = book_stock.put("price", amended_price_b)


                    val amend_b_choice2 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1. book_stock")
                    println("2. book_stock2")
                    println("3. book_stock3")
                    println("4: Exit")
                    val amended_b_choice2 = amend_b_choice2.nextInt()


                    if (amended_b_choice2 == 2);
                    val amend_id_b2 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_b2 = amend_id_b2.next()
                    amended_id_b2 = book_stock2.put("ID", amended_id_b2)

                    val amend_name_b2 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_b2 = amend_name_b2.next()
                    amended_name_b2 = book_stock2.put("name", amended_name_b2)

                    //"description" amending//
                    val amend_desc_b2 = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_b2 = amend_desc_b2.next()
                    amended_desc_b2 = book_stock2.put("description", amended_desc_b2)

                    //quantity amending//
                    val amend_quan_b2 = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_b2 = amend_quan_b2.next()
                    amended_quan_b2 = book_stock.put("quantity", amended_quan_b2)


                    //price editing//
                    val amend_price_b2 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_b2 = amend_price_b2.next()
                    amended_price_b2 = book_stock2.put("price", amended_price_b2)

                    val amend_b_choice3 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1. book_stock")
                    println("2. book_stock2")
                    println("3. book_stock3")
                    println("4: Exit")
                    val amended_b_choice3 = amend_b_choice3.nextInt()


                    //3rd book//
                    if (amended_b_choice3 == 3);
                    print(book_stock3)
                    val amend_id_b3 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_b3 = amend_id_b3.next()
                    amended_id_b3 = book_stock3.put("ID", amended_id_b3)

                    val amend_name_b3 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_b3 = amend_name_b3.next()
                    amended_name_b3 = book_stock3.put("name", amended_name_b3)

                    //"description" amending//
                    val amend_desc_b3 = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_b3 = amend_desc_b3.next()
                    amended_desc_b3 = book_stock3.put("description", amended_desc_b3)

                    //quantity amending//
                    val amend_quan_b3 = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_b3 = amend_quan_b3.next()
                    amended_quan_b3 = book_stock3.put("quantity", amended_quan_b3)


                    //price editing//
                    val amend_price_b3 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_b3 = amend_price_b3.next()
                    amended_price_b3 = book_stock3.put("price", amended_price_b3)


                    //cds/

                    if (amend_choice_stock == check_cd);

                    val amend_c_choice = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1. cd_stock")
                    println("2. cd_stock2")
                    println("3. cd_stock3")
                    println("Exit")
                    val amended_c_choice = amend_c_choice.nextInt()

                    //id amending

                    if (amended_c_choice == 1);
                    val amend_id_c = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_c = amend_id_c.next()
                    amended_id_c = cd_stock.put("ID", amended_id_c)

                    //name amending//

                    val amend_name_c = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_c = amend_name_c.next()
                    amended_name_c = cd_stock.put("name", amended_name_c)

                    //"description" amending//
                    val amend_desc_c = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_c = amend_desc_c.next()
                    amended_desc_c = cd_stock.put("description", amended_desc_c)

                    //quantity amending//
                    val amend_quan_c = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_c = amend_quan_c.next()
                    amended_quan_c = cd_stock.put("quantity", amended_quan_c)


                    //price editing//
                    val amend_price_c = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_c = amend_price_c.next()
                    amended_price_c = cd_stock.put("price", amended_price_c)

                    val amend_c_choice2 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1. cd_stock")
                    println("2. cd_stock2")
                    println("3. cd_stock3")
                    println("Exit")
                    val amended_c_choice2 = amend_c_choice2.nextInt()

                    if (amended_c_choice2 == 2);
                    val amend_id_c2 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_c2 = amend_id_c2.next()
                    amended_id_c2 = cd_stock2.put("ID", amended_id_c2)

                    val amend_name_c2 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_c2 = amend_name_c2.next()
                    amended_name_c2 = cd_stock2.put("name", amended_name_c2)

                    //"description" amending//
                    val amend_desc_c2 = Scanner(System.`in`)
                    println("Enter description")
                    var amended_desc_c2 = amend_desc_c2.next()
                    amended_desc_c2 = cd_stock2.put("description", amended_desc_c2)

                    //quantity amending//
                    val amend_quan_c2 = Scanner(System.`in`)
                    println("Enter quantity")
                    var amended_quan_c2 = amend_quan_c2.next()
                    amended_quan_c2 = cd_stock.put("quantity", amended_quan_c2)


                    //price editing//
                    val amend_price_c2 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_c2 = amend_price_c2.next()
                    amended_price_c2 = cd_stock2.put("price", amended_price_c2)

                    val amend_c_choice3 = Scanner(System.`in`)
                    println("Select an item from the list:")
                    println("1. cd_stock")
                    println("2. cd_stock2")
                    println("3. cd_stock3")
                    println("4: Exit")
                    val amended_c_choice3 = amend_c_choice3.nextInt()

                    //3rd cd//
                    if (amended_c_choice3 == 3);
                    print(cd_stock3)
                    val amend_id_c3 = Scanner(System.`in`)
                    println("Enter Item ID")
                    var amended_id_c3 = amend_id_c3.next()
                    amended_id_c3 = cd_stock3.put("ID", amended_id_c3)

                    val amend_name_c3 = Scanner(System.`in`)
                    println("Enter Item Name")
                    var amended_name_c3 = amend_name_c3.next()
                    amended_name_c3 = cd_stock3.put("name", amended_name_c3)

                    //"description" amending//
                    val amend_desc_c3 = Scanner(System.`in`)
                    println("Enter description")
                    val amended_desc_c3 = amend_desc_c3.next()
                    amended_desc_c = cd_stock3.put("description", amended_desc_c3)

                    //quantity amending//
                    val amend_quan_c3 = Scanner(System.`in`)
                    println("Enter quantity")
                    val amended_quan_c3 = amend_quan_c3.next()
                    amended_quan_c = cd_stock3.put("quantity", amended_quan_c3)


                    //price editing//
                    val amend_price_c3 = Scanner(System.`in`)
                    println("Enter Price")
                    var amended_price_c3 = amend_price_c3.next()
                    amended_price_c3 = cd_stock3.put("price", amended_price_c3)

                    if (amend_choice == 2);
                    println("2: Create New Stock Entry")
                    println("3: Amend Stock Details")
                    println("4: Delete Stock Details")
                    println("5: Count Stock Quantity")
                    println("6: Show Stock Sales Report")
                    println("7: Show Re-Order Report")
                    println("8: Exit")
                    println("")

                    println("Enter your choice:")
                }
                "4" -> {
                    println("Delete Stock Details")
                    val delete_stock = Scanner(System.`in`)

                    println("1: Delete an item")
                    println("2: Exit the menu")
                    val delete_stock_o = delete_stock.nextInt()
                    if (delete_stock_o == 1);

                    val list_choice_del = Scanner(System.`in`)
                    println("Select an option from the list")
                    println("1: hardware_stock")
                    println("2: book_stock")
                    println("3: software_stock")
                    println("4: cd_stock")
                    println("5: software_stock2")
                    println("")
                    println("6: Delete all")
                    val list_choice_del_o = list_choice_del.nextInt()
                    if (list_choice_del_o > 0 && list_choice_del_o <= 6);

                    //play message regardless of choice//
                    val yn = Scanner(System.`in`)
                    println("Are you sure you want to delete this item? 'Y' or 'N'")
                    val ynn = yn.next()
                    if (ynn === "Y");
                    println("Item details have been deleted.")
                    //focus clearance on choice//
                    if (list_choice_del_o == 1);
                    cd_stock3.clear()

                    if (list_choice_del_o == 2);
                    book_stock.clear()

                    if (list_choice_del_o == 3);
                    software_stock.clear()

                    if (list_choice_del_o == 4);
                    cd_stock.clear()

                    if (list_choice_del_o == 5);
                    software_stock2.clear()

                    if (list_choice_del_o == 6);
                    software_stock.clear()
                    software_stock2.clear()
                    software_stock3.clear()

                    hardware_stock.clear()
                    hardware_stock2.clear()
                    hardware_stock3.clear()

                    cd_stock.clear()
                    cd_stock2.clear()
                    cd_stock3.clear()

                    book_stock.clear()
                    book_stock2.clear()
                    book_stock3.clear()

                    if (ynn === "N");
                    if (delete_stock_o == 2);
                    println("2: Create New Stock Entry")
                    println("3: Amend Stock Details")
                    println("4: Delete Stock Details")
                    println("5: Count Stock Quantity")
                    println("6: Show Stock Sales Report")
                    println("7: Show Re-Order Report")
                    println("8: Exit")
                    println("")

                    println("Enter your choice:")
                }
                "5" -> {


                    //fetch total hashmap amount via identification of the relevant key//

                    val total_book_stock = book_stock["quantity"] + book_stock2["quantity"] + book_stock3["quantity"]
                    val total_software_stock =
                        software_stock["quantity"] + software_stock2["quantity"] + software_stock3["quantity"]
                    val total_cd_stock = cd_stock["quantity"] + cd_stock2["quantity"] + cd_stock3["quantity"]
                    val total_hardware_stock =
                        hardware_stock["quantity"] + hardware_stock2["quantity"] + hardware_stock3["quantity"]


                    //parse string to int and add them all together//
                    tbs = Integer.parseInt(total_book_stock)
                    tss = Integer.parseInt(total_software_stock)
                    tcd = Integer.parseInt(total_cd_stock)
                    ths = Integer.parseInt(total_hardware_stock)


                    //Initialise output via fetching stock quantities within Hashmaps//
                    println("Count Stock Quantity")
                    println("Books" + book_stock["quantity"])
                    println("CD/DVDs" + cd_stock["quantity"])
                    println("Software: " + cd_stock["quantity"])
                    println("Hardware " + hardware_stock["quantity"])


                    //sum both amounts//


                    val cs_5 = Scanner(System.`in`)
                    println("1: Exit menu")
                    val cs_5_2 = cs_5.nextInt()
                    if (cs_5_2 == 1);
                    println("2: Create New Stock Entry")
                    println("3: Amend Stock Details")
                    println("4: Delete Stock Details")
                    println("5: Count Stock Quantity")
                    println("6: Show Stock Sales Report")
                    println("7: Show Re-Order Report")
                    println("8: Exit")
                    println("")

                    println("Enter your choice:")
                }
                "6" -> {

                    println("Show Stock Sales Report")
                    println("Please press 1-4 for what form of the report you would like to view.")
                    //break paragraph

                    println("")
                    val ad_choice = Scanner(System.`in`)
                    println("1: 1 Month")
                    println("2: 3 Months")
                    println("3: 6 Months")
                    println("4: 1 Year")
                    println("5: Exit")
                    val ad_choice_1 = ad_choice.nextInt()


                    //1 month report//
                    if (ad_choice_1 == 1);
                    println("Stock Sales Report (1 Month)")
                    //line separators//
                    println("")

                    println("Total Quantity Sold: $total_sum")
                    println("")

                    println("Types Sold")
                    println("")

                    println("Books: " + tbs!!)
                    println("CD/DVDs" + tcd!!)
                    println("Software: " + tss!!)
                    println("Hardware: " + ths!!)

                    val echeck = Scanner(System.`in`)
                    println("Press 'E' to see the next report.")
                    val echeck_a = echeck.next()

                    if (echeck_a === check_e) {
                        break
                    }


                    //if choose b//
                    if (ad_choice_1 == 2);
                    println("Stock Sales Report (3 Months)")
                    //line separators//
                    println("")

                    println("Total Quantity Sold: " + total_sum * 4 / 2)
                    println("")

                    println("Types Sold")
                    println("")

                    println("Books: " + tbs * 2)
                    println("CD/DVDs" + tcd * 4 / 2)
                    println("Software: " + tss * 4)
                    println("Hardware: " + ths * 6 / 2)

                    val echeck_b = Scanner(System.`in`)
                    println("Press 'E' to see the next report.")
                    val echeckb = echeck_b.next()
                    if (echeckb === check_e) {
                        break
                    }

                    if (ad_choice_1 == 3);

                    println("Stock Sales Report (6 Months)")
                    //line separators//
                    println("")

                    println("Total Quantity Sold: " + total_sum * 8 / 4)
                    println("")

                    println("Types Sold")
                    println("")

                    println("Books: " + tbs * 6 / 4)
                    println("CD/DVDs" + tcd * 6 / 4)
                    println("Software: " + tss * 6 / 4)
                    println("Hardware: " + ths * 8 / 2)

                    val echeck_c = Scanner(System.`in`)
                    println("Press 'E' to see the next report.")
                    val echeckc = echeck_c.next()
                    if (echeckc === check_e) {
                        break
                    }
                    //1 year//
                    if (ad_choice_1 == 4);
                    println("Stock Sales Report (1 Year)")
                    //line separators//
                    println("")

                    println("Total Quantity Sold: " + total_sum * 8 / 2)
                    println("")

                    println("Types Sold")
                    println("")

                    println("Books: " + tbs * 8 / 2)
                    println("CD/DVDs" + tcd * 8 / 2)
                    println("Software: " + tss * 8 / 2)
                    println("Hardware: " + ths * 8 / 2)

                    val echeck_d = Scanner(System.`in`)
                    println("Press 'E' to return to the prior menu.")
                    val echeckd = echeck_d.next()
                    if (echeckd === check_e) {
                        break
                    }
                    //break if E is selected//

                    println("2: Create New Stock Entry")
                    println("3: Amend Stock Details")
                    println("4: Delete Stock Details")
                    println("5: Count Stock Quantity")
                    println("6: Show Stock Sales Report")
                    println("7: Show Re-Order Report")
                    println("8: Exit")
                    println("")

                    println("Enter your choice:")
                }

                "7" -> {
                    println("Show Re-Order Report")

                    println("Please press 1-4 for what form of the report you would like to view.")
                    //break paragraph

                    val automatic_renewal_book = 5
                    val automatic_renewal_cds = 4
                    val automatic_renewal_software = 6
                    val automatic_renewal_hardware = 3


                    println("")
                    val ad_choice2 = Scanner(System.`in`)
                    println("1: 1 Month")
                    println("2: 3 Months")
                    println("3: 6 Months")
                    println("4: 1 Year")
                    val ad_choice_2 = ad_choice2.nextInt()


                    if (ad_choice_2 == 1);
                    println("Stock Re-Order Report (1 Month)")
                    //line separators//
                    println("")

                    println("Total Stock Available: $total_sum")
                    println("")

                    println("Types Available")
                    println("")

                    println("Books: " + tbs!!)
                    println("CD/DVDs: " + tcd!!)
                    println("Software: " + tss!!)
                    println("Hardware: " + ths!!)

                    println("Automatic Stock Renewal Trigger")
                    println("")

                    //renewal trigger
                    println("Books: $automatic_renewal_book")
                    println("CD/DVDs: $automatic_renewal_cds")
                    println("Software: $automatic_renewal_software")
                    println("Hardware: $automatic_renewal_hardware")

                    println("")
                    println("Total Stock Adjustments:")

                    println("Books: 0")
                    println("CD/DVDs: 0")
                    println("Software: 0")
                    println("Hardware: 0")
                    println("")

                    val echeck_3 = Scanner(System.`in`)
                    println("Press 'E' to see the next report.")
                    val echeck_33 = echeck_3.next()
                    if (echeck_33 === check_e)
                    //stop the script if E is checked//
                    {
                        break
                    }


                    //3 months//

                    if (ad_choice_2 == 2);

                    //automatic renewal check//

                    if (tbs <= automatic_renewal_book);
                    new_tbs = tbs * 3

                    if (tcd <= automatic_renewal_cds);
                    new_tcd = tcd * 3

                    if (tss <= automatic_renewal_software);
                    new_tss = tss * 3

                    if (ths <= automatic_renewal_hardware);
                    new_ths = ths * 3

                    println("Stock Re-Order Report (3 Months)")
                    //line separators//
                    println("")

                    println("Total Stock Available: $total_sum")
                    println("")

                    println("Types Available")
                    println("")

                    println("Books: $tbs")
                    println("CD/DVDs$tcd")
                    println("Software: $tss")
                    println("Hardware: $ths")

                    println("Automatic Stock Renewal Trigger")
                    println("")

                    //renewal trigger
                    println("Books$automatic_renewal_book")
                    println("CD/DVDs$automatic_renewal_cds")
                    println("Software$automatic_renewal_software")
                    println("Hardware$automatic_renewal_hardware")

                    println("")
                    println("Total Stock Adjustments:")

                    println("Books: $new_tbs")
                    println("CD/DVDs: $new_tcd")
                    println("Software: $new_tss")
                    println("Hardware: $new_ths")
                    println("")


                    val echeck_2 = Scanner(System.`in`)
                    println("Press 'E' to see the next report.")
                    val echeck_22 = echeck_2.next()
                    if (echeck_22 === check_e) {
                        break
                    }

                    //6 months//

                    if (ad_choice_2 == 3);

                    //automatic renewal check//

                    if (new_tbs <= automatic_renewal_book);
                    new_new_tbs = tbs * 6

                    if (new_tcd <= automatic_renewal_cds);
                    new_new_tcd = tcd * 6

                    if (new_tss <= automatic_renewal_software);
                    new_new_tss = tss * 6

                    if (new_ths <= automatic_renewal_hardware);
                    new_new_ths = ths * 6

                    println("Stock Re-Order Report (6 Months)")
                    //line separators//
                    println("")

                    println("Total Stock Available: $total_sum")
                    println("")

                    println("Types Available")
                    println("")

                    println("Books: $new_tbs")
                    println("CD/DVDs: $new_tcd")
                    println("Software: $new_tss")
                    println("Hardware: $new_ths")

                    println("Automatic Stock Renewal Trigger")
                    println("")

                    //renewal trigger
                    println("Books: $automatic_renewal_book")
                    println("CD/DVDs: $automatic_renewal_cds")
                    println("Software: $automatic_renewal_software")
                    println("Hardware: $automatic_renewal_hardware")

                    println("")
                    println("Total Stock Adjustments:")

                    println("Books: $new_new_tbs")
                    println("CD/DVDs: $new_new_tcd")
                    println("Software: $new_new_tss")
                    println("Hardware: $new_new_ths")
                    println("")


                    val echeck_4 = Scanner(System.`in`)
                    println("Press 'E' to see the next report.")
                    val echeck_44 = echeck_4.next()
                    if (echeck_44 === check_e) {
                        break
                    }
                    //1 Year//

                    if (ad_choice_2 == 4);

                    //automatic renewal check//

                    if (new_new_tbs >= automatic_renewal_book);
                    new_new_new_tbs = tbs * 12

                    if (new_new_tcd >= automatic_renewal_cds);
                    new_new_new_tcd = tcd * 12

                    if (new_new_tss >= automatic_renewal_software);
                    new_new_new_tss = tss * 12

                    if (new_new_ths >= automatic_renewal_hardware);
                    new_new_new_ths = ths * 12

                    println("Stock Re-Order Report (1 Year)")
                    //line separators//
                    println("")

                    println("Total Stock Available: $total_sum")
                    println("")

                    println("Types Available")
                    println("")

                    println("Books: $new_new_tbs")
                    println("CD/DVDs$new_new_tcd")
                    println("Software: $new_new_tss")
                    println("Hardware: $new_new_ths")

                    println("Automatic Stock Renewal Trigger")
                    println("")

                    //renewal trigger
                    println("Books: $automatic_renewal_book")
                    println("CD/DVDs: $automatic_renewal_cds")
                    println("Software: $automatic_renewal_software")
                    println("Hardware: $automatic_renewal_hardware")

                    println("")
                    println("Total Stock Adjustments:")

                    println("Books: $new_new_new_tbs")
                    println("CD/DVDs: $new_new_new_tcd")
                    println("Software: $new_new_new_tss")
                    println("Hardware: $new_new_new_ths")
                    println("")


                    val echeck_5 = Scanner(System.`in`)
                    println("Press 'E' to return to the prior menu.")
                    val echeck_55 = echeck_5.next()
                    if (echeck_55 === check_e) {
                        break
                    }


                    println("2: Create New Stock Entry")
                    println("3: Amend Stock Details")
                    println("4: Delete Stock Details")
                    println("5: Count Stock Quantity")
                    println("6: Show Stock Sales Report")
                    println("7: Show Re-Order Report")
                    println("8: Exit")
                    println("")

                    println("Enter your choice:")
                }

                "8" -> {
                    println("Exit")
                    System.exit(0)
                    input.close()
                }
            }
        } while (option != "8")


    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}

