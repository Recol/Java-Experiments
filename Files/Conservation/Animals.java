import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Animals {
	public Animals () {}
	String external_location = "";
	public void file_external_location() {
		String file_location = "";
		external object = new external();
		 this.external_location = object.filepath; /*load in the directory file declared before into a string*/
	}
	public void begin() throws IOException {
		 /* so call in order to process the string for loading into a data structure*/
	file_external_location();
	Scanner s = new Scanner(new File(external_location));
	ArrayList<String> list = new ArrayList<String>();
	while (s.hasNext()){
	    list.add(s.next());
	}
	s.close();
	
	for (int i= 0; i <list.size(); i++) {
		System.out.println(list.toString());
	}
	}}
	
	
	
	


	

