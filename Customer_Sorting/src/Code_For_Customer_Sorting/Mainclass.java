package Code_For_Customer_Sorting;
import java.io.FileReader;

import org.*;
import org.json.simple.parser.JSONParser;
public class Mainclass {

// i have customer database :-
	// i need to access this database
	// get our customer data
	// what i will do with this data is :-
	// 1- sorting our customer by ages
	//2- sorting our customers by IQ.
	//3- sorting our customers by  their jobs
	//4- get the high smart customer
	//5- get the low smart customer
	//6-get the most used customer name
	//7- get the most used child name
	//8- get file for all previous points.
	//9- save this file in separate database(the sorted database). 
	
	public static void main(String[] args) {
		//how to read JSON file in java 
		
		
		JSONParser parser= new JSONParser();
		try {
			Object object=parser.parse(new FileReader("myJson.json"));
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
