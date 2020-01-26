import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;



public class File_IO {

	boolean max_reached = false;


	public File_IO() {

	}
	
	/*
	 * Load in animal data and output to a string.
	 */
	@SuppressWarnings("resource")
	public void readAnimalData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Animals.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_animals=StringUtils.split(strline, ",");
	            if(arraylist_animals.length != 0){
	            	 
	            	sb.append("\nCage ID: ").append(StringUtils.trim(arraylist_animals[0]));
	            	 sb.append("\nAnimal ID: ").append(StringUtils.trim(arraylist_animals[1]));
	            	 sb.append("\nCategory: ").append(StringUtils.trim(arraylist_animals[2]));
	            	 sb.append("\nSpecies Type: ").append(StringUtils.trim(arraylist_animals[3]));
	            	sb.append("\nDanger Rating: ").append(StringUtils.trim(arraylist_animals[4]));
	         
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
	    }
	
	/*
	 * Load in the Animals file, store in 4 separate arrays for data comparison with to identify animal conditions.
	 */
	
	@SuppressWarnings("resource")
	public void check_animal_compatibility(String entry) throws Exception {
	      boolean  danger = false;
		FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Animals.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] animal_check=StringUtils.split(strline, ",");
	            if(animal_check.length != 0){
	            	 
	            	sb.append("\nCage ID: ").append(StringUtils.trim(animal_check[0]));
	            	 sb.append("\nAnimal ID: ").append(StringUtils.trim(animal_check[1]));
	            	 sb.append("\nSpecies Type: ").append(StringUtils.trim(animal_check[2]));
	            	 sb.append("\nDanger Rating: ").append(StringUtils.trim(animal_check[3]));
	            	 	
	            
	            }
           	 List<String> check_a = Arrays.asList(animal_check[3]);
	            List<String> count = Arrays.asList(animal_check[1]);
	        
	            if (check_a.isEmpty()) 
	             {
	               System.out.println("The danger rating is not allowed");
	                 danger = true;
	                 break;
	            
	        }
	        
 	                System.out.println("The danger rating is allowed");
 	               danger = false;
 	                break;
	            
	        }
	        Animals animal = new Animals();
	        animal.danger(danger);
	}
           	 	
	
	/*
	 * Static due to limitations with Java reading current lines, pass in the value as a string from other classes, then filter and remove the line.
	 * Load in the file, and replace with the output stream.
	 */
	public static void removeKeeper(String data) throws IOException{
		   {
		        try
		        {
		                BufferedReader file = new BufferedReader(new FileReader("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Keepers.txt"));
		                String line;
		                String input = "";
		                while ((line = file.readLine()) != null) 
		                {
		                    //System.out.println(line);
		                    if (line.contains(data))
		                    {
		                        line = "";
		                        System.out.println("Line deleted.");
		                    }
		                    input += line + '\n';
		                }
		                FileOutputStream File = new FileOutputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Keepers.txt");
		                File.write(input.getBytes());
		                file.close();
		                File.close();
		        }
		        catch (IOException e)
		        {
		                System.out.println("Problem reading file.");
		                e.getCause();
		        }
		        catch (Exception ex) {
		        	System.out.println("An unhandled fatal exception has occurred.");
		        	ex.getCause();
		        	ex.getStackTrace();
		        }
		   }
	}
	
	/*
	 * Read keeper data, and output the stringbuffer to a string.
	 */
	@SuppressWarnings("resource")
	public void readKeeperData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Keepers.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_keepers=StringUtils.split(strline, ",");
	            if(arraylist_keepers.length != 0){
	            	 
	            	sb.append("\nEnclosure ID: ").append(StringUtils.trim(arraylist_keepers[0]));
	            	 sb.append("\n:Cage ID ").append(StringUtils.trim(arraylist_keepers[1]));
	            	 sb.append("\nFirst Name: ").append(StringUtils.trim(arraylist_keepers[2]));
	            	 sb.append("\nSecond Name: ").append(StringUtils.trim(arraylist_keepers[3]));
	            	
	            
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
	    }
	
	/*
	 * Load in enclosure data, and output to a string.
	 */
	
	public void readEnclosureData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Enclosures.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_enclosures=StringUtils.split(strline, ",");
	            if(arraylist_enclosures.length != 0){
	            	 
	            	sb.append("\nEnclosure ID: ").append(StringUtils.trim(arraylist_enclosures[0]));
	            	 sb.append("\nDescription: ").append(StringUtils.trim(arraylist_enclosures[1]));
	            	 sb.append("\nNumber of cages: ").append(StringUtils.trim(arraylist_enclosures[2]));
	          
	            	
	            
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
	    }
	
	
	/*
	 * Load in cage data, then output to a string.
	 */
	public void readCageData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Cages.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_cages=StringUtils.split(strline, ",");
	            if(arraylist_cages.length != 0){
	            	 
	            	sb.append("\nEnclosure ID: ").append(StringUtils.trim(arraylist_cages[0]));
	            	 sb.append("\nCage ID: ").append(StringUtils.trim(arraylist_cages[1]));
	            	 sb.append("\nCage Description: ").append(StringUtils.trim(arraylist_cages[2]));
	            	 sb.append("\nNumber Of Keepers: ").append(StringUtils.trim(arraylist_cages[3]));
	            	 	
	            	
	       
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
}
	
	
	/*
	 * Receive passed string, and write to the file.
	 * Respective file writters, to append changes to the end of each file.
	 */
		public static void writeKeeperData(String data) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Keepers.txt", true)))) {
			    out.println(data);
			} catch (IOException e) {
			    System.err.println(e);
			}
		}
	
		public static void writeCageData(String data) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Cages.txt", true)))) {
			    out.println(data);
			} catch (IOException e) {
			    System.err.println(e);
			}
		}
		
		public static void writeEnclosureData(String data) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Enclosures.txt", true)))) {
			    out.println(data);
			} catch (IOException e) {
			    System.err.println(e);
			}
		}
		
		public static void writeAnimalData(String data) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Animals.txt", true)))) {
			    out.println(data);
			} catch (IOException e) {
			    System.err.println(e);
			}
		}
		
	/*
	 * This method will be passed in from the Keepers class and read the Cage file.
	 * Afterwards, the delimiter will split it into 4 array blocks for comparison.
	 * 2 lists are then initialised for matching the read conditions with the arrays based on the ID as a String.
	 * 
	 */
	@SuppressWarnings("unlikely-arg-type")
	public void check_max_cage_assignment(String entry) throws Exception {
		FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Cages.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] max_cage_check=StringUtils.split(strline, ",");
	            if(max_cage_check.length != 0){
	            	 
	            	sb.append("\nEnclosure ID: ").append(StringUtils.trim(max_cage_check[0]));
	            	 sb.append("\nCage ID: ").append(StringUtils.trim(max_cage_check[1]));
	            	 sb.append("\nCage Description: ").append(StringUtils.trim(max_cage_check[2]));
	            	 sb.append("\nNumber Of Keepers: ").append(StringUtils.trim(max_cage_check[3]));
	            	 	
	            	 
	            }
	            List<String> check_entry = Arrays.asList(max_cage_check[1]);
           	 List<String> check = Arrays.asList(max_cage_check[3]);
	            List<String> count = Arrays.asList(max_cage_check[1]);

           	 	for (int i = 0; i < count.size(); i++) 
	            {
           	 
           	 		if (!check.contains("4")){
 	                System.out.println("The maximum has not been reached");
 	                max_reached = false;
 	                break;
 	            }     
 	            
            
	             if (check.contains("4")){
	                System.out.println("The maximum has been reached.");
	                break;
	             }     
           	 	

	             else if (!check_entry.equals(entry) ) {
       	 			System.out.println("The ID cannot be found");
       	 			break;
       	 		}
	             if (i == count.size()-1) 
	           	 		break;  
		
	            }
       	 		
           	 	
           	 	}
	        }
}

	




		