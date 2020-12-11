package pl.adriankurek.exceptions;

// Dziedziczymy po Exception.
public class WrongNameLengthException extends Exception {
	public WrongNameLengthException() {
		super("Name length must be at least 3!");
	}
}