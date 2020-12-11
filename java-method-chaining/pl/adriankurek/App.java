package pl.adriankurek;

public class App {
	public static void main(String[] args) {
		new Notification().setTitle("My lorem title")
						  .setMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
						  .print();

		new Notification().setTitle("Notification title")
						  .setMessage("Lorem ipsum dolor sit amet, consectetur adipiscing elit...")
						  .setCornerChar('#')
						  .setHorizontalChar('=')
						  .setVerticalChar('|')
						  .print();

		Notification notification = new Notification().setTitle("Nice notification")
													  .setMessage("Nice notification message.")
										   			  .setCornerChar('*')
										   			  .setHorizontalChar('*')
										   			  .setVerticalChar('*');

		notification.print();
	}
}