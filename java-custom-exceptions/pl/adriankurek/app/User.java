package pl.adriankurek.app;

import pl.adriankurek.exceptions.*;

public class User {
	private String name;
	private int age;

	public void setName(String name) throws WrongNameLengthException {
		if (name.trim().length() < 3) throw new WrongNameLengthException();
		this.name = name;
	}
	
	public void setAge(int age) throws WrongAgeException {
		if (age < 0) throw new WrongAgeException();
		this.age = age;
	}
}