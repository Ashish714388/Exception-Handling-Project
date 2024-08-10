package exceptionHandlingPartTwo;
import java.io.*;
import example.exception.*;

public class MyExceptionHandling {
	
	
	//Method to read the contents of the file and handle exceptions..
	public void readFile(String filePath) throws ApplicationException {
		
		BufferedReader br = null;
		
		try {
		
		br = new BufferedReader(new FileReader(filePath));
		
		String line = "";
		
		while((line = br.readLine()) != null) {
			
			//reading the content of the file line by line using object of BufferedReader..
			System.out.println(line);
		}
		
		}
		
		catch(FileNotFoundException e) {
			
			//Handling the FileNotFoundException..
			throw new ApplicationException("File Not Found Exception has occurred..");
		}
		
		catch(IOException e) {
			
			//Handling the IOException..
			throw new ApplicationException("Error reading the file Exception has occurred");
		}
		
		finally {
			
			//Ensuring the resources are closed...
			
			if(br != null) { //if it is not included then NullPointerException will occur..
				
				try {
					br.close();
				}
				catch(IOException e) {
					
					throw new ApplicationException("Error while closing the file..");
				}
			}
		}
	}
}
