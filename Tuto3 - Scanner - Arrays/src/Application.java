import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a sentence please: "); // Creating a scanner object.
		String input = scanner.nextLine(); // nextLine() is for Strings; nextInt() is for integers; nextDouble() is for doubles.
		
		System.out.printf("You entered: %s",input.toString());
	}
}
