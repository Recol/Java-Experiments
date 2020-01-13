import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Enclosures {
	public Enclosures() {}
	
	String external_location = "";
	public void file_external_location() {
		String file_location = "";
		Scanner file_loc = new Scanner(System.in);
		System.out.println("Please define the location of the file");/*load in the directory file declared before into a string*/
		this.external_location = file_loc.next();
	}
	
	public void begin() throws IOException {
		 /* so call in order to process the string for loading into a data structure*/
	file_external_location();
	Scanner s = new Scanner(new File(external_location)); 
	ArrayList<String> list = new ArrayList<String>(); /*store in an arraylist*/
	while (s.hasNext()){
	    list.add(s.next());
	}
	s.close();
	
	for (int i= 0; i <list.size(); i++) {
		System.out.println(list.toString());
	}
	}}
	

	

