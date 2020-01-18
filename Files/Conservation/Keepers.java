import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Keepers {
	public Keepers() {}
	
	String external_location = "";
	public void file_external_location() {
		String file_location = "";
		external object = new external();
		 external_location = object.filepath; /*load in the directory file declared before into a string*/
	}
	public void begin() throws IOException {
		file_external_location(); /* so call in order to process the string for loading into a data structure*/
	try {
		
	
	List<String> lines = Files.readAllLines(Paths.get(external_location)); /*load the file into the list*/
	}
	catch (IOException e) {
	e.getStackTrace();	
	}}
	
	


	}

