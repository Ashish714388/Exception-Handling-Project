package example.exception;

public class ApplicationException extends Exception {

	//constructor with the message...
	public ApplicationException(String message) {
		
		super(message); //calling the constructor of the Exception class..
	}
}
