import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.println("Enter a sentence please: "); // Creating a scanner
		 * object. String input = scanner.nextLine(); // nextLine() is for Strings;
		 * nextInt() is for integers; nextDouble() is for doubles.
		 * 
		 * System.out.printf("You entered: %s",input.toString());
		 */

		System.out.println("Enter a number between 1 and 4 please: ");
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("You chose number 1!");
			break;
		case 2:
			System.out.println("You chose number 2!");
			break;
		case 3:
			System.out.println("You chose number 3!");
			break;
		case 4:
			System.out.println("You chose number 4!");
			break;
		default:
			System.out.println("Your choice is invalid.");
		}
	}
}
