import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;



public class File_IO {


	public File_IO() {

	}
	
	
	public static void readAnimalData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Animals.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_animals=StringUtils.split(strline, ",");
	            if(arraylist_animals.length != 0){
	            	 
	            	sb.append("\nCage ID: ").append(StringUtils.trim(arraylist_animals[0]));
	            	 sb.append("\nCage Number: ").append(StringUtils.trim(arraylist_animals[1]));
	            	 sb.append("\nSpecies: ").append(StringUtils.trim(arraylist_animals[2]));
	            	 sb.append("\nSpecies Type: ").append(StringUtils.trim(arraylist_animals[3]));
	            	sb.append("\nDanger Rating: ").append(StringUtils.trim(arraylist_animals[4]));
	            
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
	    }
	
	public static void readKeeperData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Keepers.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_keepers=StringUtils.split(strline, ",");
	            if(arraylist_keepers.length != 0){
	            	 
	            	sb.append("\nEnclosure: ").append(StringUtils.trim(arraylist_keepers[0]));
	            	 sb.append("\nEnclosure Number: ").append(StringUtils.trim(arraylist_keepers[1]));
	            	 sb.append("\nFirst Name: ").append(StringUtils.trim(arraylist_keepers[2]));
	            	 sb.append("\nSecond Name: ").append(StringUtils.trim(arraylist_keepers[3]));
	            	
	            
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
	    }
	
	public static void readEnclosureData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Enclosures.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_enclosures=StringUtils.split(strline, ",");
	            if(arraylist_enclosures.length != 0){
	            	 
	            	sb.append("\nSelection: ").append(StringUtils.trim(arraylist_enclosures[0]));
	            	 sb.append("\nDescription: ").append(StringUtils.trim(arraylist_enclosures[1]));
	            	 sb.append("\nRating ").append(StringUtils.trim(arraylist_enclosures[2]));
	          
	            	
	            
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
	    }
	
	public static void readCageData() throws Exception {
		  FileInputStream f= new FileInputStream("C:/Users/deckl/eclipse-workspace/Clyde-Conservation/src/Cages.txt");
	        BufferedReader br = new BufferedReader(new InputStreamReader(f));
	        String strline;
	        StringBuffer sb = new StringBuffer();
	        while ((strline = br.readLine()) != null)
	        {
	            String[] arraylist_cages=StringUtils.split(strline, ",");
	            if(arraylist_cages.length != 0){
	            	 
	            	sb.append("\nEnclosure ").append(StringUtils.trim(arraylist_cages[0]));
	            	 sb.append("\nCage Number: ").append(StringUtils.trim(arraylist_cages[1]));
	            	 sb.append("\nCage Description: ").append(StringUtils.trim(arraylist_cages[2]));
	            	 sb.append("\nCage Danger Rating: ").append(StringUtils.trim(arraylist_cages[3]));

	            	
	       
	            } else {
	                System.out.println("Error: "+strline);
	            }
	        }
	        System.out.println("Data: "+sb.toString());
}
}
	




		