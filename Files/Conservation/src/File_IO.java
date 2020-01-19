import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;



public class File_IO {

	private Scanner sc;
	private File animal_File;
	private File keeper_File;
	private File cage_File;
	private File Enclosure_File;
	
	private BufferedReader in;
	private BufferedWriter write;
	private BufferedWriter o_put;
	
	
	public File_IO() {
	this.animal_File = new File("data/Animals.txt");
	this.keeper_File = new File("data/Keepers.txt");
	this.cage_File = new File("data_files/Cages.txt");
	this.Enclosure_File = new File("data_files/Enclosures.txt");
	
	}
	
	public void write_Enclosure_Details(ArrayList<Enclosures> enclosure_list) {
		try {
			
		
		write = new BufferedWriter(Enclosure_File);
		o_put = new BufferedWriter(write);
		
		for (Enclosures i : enclosure_list) {
			if (enclosure_list != null) {
				o_put.write(i.get_enclosure_ID() + "/n");
				o_put.write(i.get_enclosure_name() + "/n");
				o_put.write(i.get_enclosure_max() + "/n");
			}
			o_put.flush();
			
		}
		}
	catch (IOException e) {
		System.out.println("An error has occurred");
		e.getCause();
		e.getStackTrace();
	}}
	
	public void write_Animal_Details(ArrayList<Animals> animal_List) {
		try {
			write = new BufferedWriter(animal_File);
			o_put = new BufferedWriter(write);
			
			for(Animals i : animal_List) {
				if(animal_List != null) {
					o_put.write(i.get_Animal_Id() + "\n");
					o_put.write(i.getanimal_Name() + "\n");
					o_put.write(i.get_Animal_Sex() + "\n");
					o_put.write(i.get_Animal_Family() + "\n");
					o_put.write(i.get_Animal_Species() + "\n");
					o_put.write(i.get_Cage_Assignment() + "\n");
				}
				o_put.flush();
			}
		}
			catch (IOException e) {
				System.out.println("Invalid file path has been declared");
				e.getCause();
				e.getStackTrace();
			}
				
				}

		public void write_Keeper_Details(ArrayList<Keepers> keeperList) {
			try {
				write = new FileWriter(keeper_File);
				o_put = new PrintWriter(write);
				
				for(Keepers i : keeperList) {
					if(keeperList != null) {
						o_put.write(i.get_Keeper_ID() + "\n");
						o_put.write(i.get_First_Name() + "\n");
						o_put.write(i.get_Last_Name() + "\n");
						for(String f : i.get_Cage_Assignment()) {
							o_put.write(f + "\n");
						}
					}
				}
				o_put.flush();
			} catch(IOException e) {
				System.err.println("Invalid path has been declared");
				e.printStackTrace();
			}
		}
	
		public void write_Cage_Details(ArrayList<Cages> cage_List) {
			try {
				write = new FileWriter(cage_File);
				o_put = new BufferedWriter(write);
				
				for(Cages i : cage_List) {
					if(cage_List != null) {
						o_put.write(i.get_CageId() + "\n");
						o_put.write(i.get_Cage_Size() + "\n");
						o_put.write(i.get_Cage_Type() + "\n");
						o_put.write(i.get_Max_Animals() + "\n");
						o_put.write(i.get_Max_Keepers() + "\n");
					}
				}
				o_put.flush();
			} catch(IOException z) {
				System.err.println("Invalid path has been declared");
				
				z.printStackTrace();
			}
		}
		
		
}
		