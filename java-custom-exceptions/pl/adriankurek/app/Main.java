package pl.adriankurek.app;

import pl.adriankurek.exceptions.*;

public class Main {
	public static void main(String[] args) {
		User user = new User();

		// Wyjątek nie pojawi się.
		try {
			user.setName("Adrian");
			user.setAge(25);
		} catch (WrongNameLengthException e) {
			System.out.println(e.getMessage());
		} catch (WrongAgeException e) {
			System.out.println(e.getMessage());
		}

		// Tutaj wyjątek zostanie rzucony, ponieważ wiek nie może być < 0.
		try {
			user.setName("Adrian");
			user.setAge(-10);
		} catch (WrongNameLengthException e) {
			System.out.println(e.getMessage());
		} catch (WrongAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}