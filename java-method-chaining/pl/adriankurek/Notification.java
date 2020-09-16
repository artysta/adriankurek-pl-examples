package pl.adriankurek;

public class Notification {
	public final static char MAX_TITLE_LENGTH = 20;
	private char horizontalChar = '-';
	private char verticalChar = ':';
	private char cornerChar = '+';
	private String title = "Default title";
	private String message = "Default message";
	private int width;
	private int margin;

	public Notification setTitle(String title) {
		// Set title only if it is not empty or whitespace string.
		if (!title.trim().equals("")) this.title = title;

		// Substring title if its lenght > MAX_TITLE_LENGTH.
		if (this.title.length() > MAX_TITLE_LENGTH) {
			this.title = this.title.substring(0, MAX_TITLE_LENGTH);
			this.title += "...";
		}
		return this;
	}

	public Notification setMessage(String message) {
		// Set message only if it is not empty or whitespace string.
		if (!message.trim().equals("")) this.message = message;
		return this;
	}

	public Notification setHorizontalChar(char c) {
		this.horizontalChar = c;
		return this;
	}

	public Notification setVerticalChar(char c) {
		this.verticalChar = c;
		return this;
	}

	public Notification setCornerChar(char c) {
		this.cornerChar = c;
		return this;
	}

	public void print() {
		// Set max width of notification frame.
		this.width = title.length() + 10;

		// Set "title margin", so title can be printed on the center.
		this.margin = (width - title.length()) / 2;

		// Print beginning horizontal line.
		printHorizontalLine();
		breakLine();
		printChar(verticalChar);

		// Print title and its "margin".
		printChar(' ', margin);
		System.out.print(title);
		printChar(' ', margin);
		printChar(verticalChar);

		// Print empty line between title and message.
		breakLine();
		printEmptyLine();
		breakLine();

		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (count == 0) printChar(verticalChar);
			printChar(message.charAt(i));
			count++;

			// Break line if count is equal to max width.
			if (count == width) {
				printChar(verticalChar);
				breakLine();
				count = 0;
			}
		}

		// Fill the rest of available width with whitespaces.
		if (count > 0) {
			while (count < width) {
				printChar(' ');
				count++;
			}
		}

		printChar(verticalChar);
		breakLine();

		// Print ending horizontal line.
		printHorizontalLine();
		breakLine();
	}

	// Methods that help to print.
	private void printHorizontalLine() {
		printChar(cornerChar);
		printChar(horizontalChar, width);
		printChar(cornerChar);
	}

	private void printEmptyLine() {
		printChar(verticalChar);
		printChar(' ', width);
		printChar(verticalChar);
	}

	private void printChar(char c, int n) {
		while (n-- > 0) this.printChar(c);
	}

	private void printChar(char c) {
		System.out.print(c);
	}

	private void printString(String s) {
		for (int i = 0; i < s.length(); i++) {
			printChar(s.charAt(i));
		}
	}

	private void breakLine() {
		System.out.print("\n");
	}
}
