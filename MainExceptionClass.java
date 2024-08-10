package exceptionHandlingPartOne;
import example.exception.*;
import exceptionHandlingPartTwo.*;

public class MainExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExceptionHandling handler = new MyExceptionHandling();
		
		String filePath = "C:\\Users\\Admin\\Desktop\\New folder\\AssignmentFile.txt";
		
		try {
			
			handler.readFile(filePath);
		}
		
		//Handling ApplicationException thrown by MyExceptionHandling class...
		catch(ApplicationException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
