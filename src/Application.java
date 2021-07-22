
public class Application {

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		String str = "Hello World!";
		displayVariable(str);
		
		byte myByte = 102;
		short myShort = 16;
		int myInt = 32500;
		long myLong = 124578;
		
		float myFloat = 32.5f;
		double myDouble = 2514.235;
		
		char myChar = 'C';
		boolean myBoolean = true;
		
		displayVariable(myByte);
		displayVariable(myShort);
		displayVariable(myInt);
		displayVariable(myLong);
		displayVariable(myFloat);
		displayVariable(myDouble);
		displayVariable(myChar);
		displayVariable(myBoolean);

	}
	
	public static void displayVariable(byte myByte) {
		System.out.println(myByte);
	}
	
	public static void displayVariable(short myShort) {
		System.out.println(myShort);
	}
	
	public static void displayVariable(int myInt) {
		System.out.println(myInt);
	}
	
	public static void displayVariable(long myLong) {
		System.out.println(myLong);
	}
	
	public static void displayVariable(float myFloat) {
		System.out.println(myFloat);
	}
	
	public static void displayVariable(double myDouble) {
		System.out.println(myDouble);
	}
	
	public static void displayVariable(char myChar) {
		System.out.println(myChar);
	}
	
	public static void displayVariable(boolean myBoolean) {
		System.out.println(myBoolean);
	}
	
	public static void displayVariable(String str) {
		System.out.println(str);
	}

}
