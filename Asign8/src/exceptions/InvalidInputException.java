package exceptions;

public class InvalidInputException extends Exception {
	public InvalidInputException() {
		super("dup names detected!!!!");
	}
}
