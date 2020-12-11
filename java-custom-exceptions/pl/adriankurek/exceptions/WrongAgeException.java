package pl.adriankurek.exceptions;

// Dziedziczymy po RuntimeException.
public class WrongAgeException extends RuntimeException {
	public WrongAgeException() {
		super("Age can not be less than 0!");
	}
}