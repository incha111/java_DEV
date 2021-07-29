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

		/*
		 * System.out.println("Enter a number between 1 and 4 please: "); int input =
		 * scanner.nextInt();
		 * 
		 * switch (input) { case 1: System.out.println("You chose number 1!"); break;
		 * case 2: System.out.println("You chose number 2!"); break; case 3:
		 * System.out.println("You chose number 3!"); break; case 4:
		 * System.out.println("You chose number 4!"); break; default:
		 * System.out.println("Your choice is invalid."); }
		 */

		int[] numbers = new int[3];
		numbers[0] = 16;
		numbers[1] = 25;
		numbers[2] = 10;
		// Display array numbers
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("Value on array position %d is: %d\n",i,numbers[i]);
		}
		
		String[] names = new String[] {"Steven, Mike, Sofia"};
		// Display array names
		for(String name: names) {
			System.out.println(name);
		}
		
		int[] myNumbers = new int[3];
		int counter = 0;
		
		// Filling the array "myNumbers"
		System.out.println("Enter 3 numbers please: ");
		while (counter < myNumbers.length) {
			int input = scanner.nextInt();
			myNumbers[counter] = input;
			System.out.println("Enter the next number please: ");
			counter ++;
		}
		// Display array myNumbers
		for (int i = 0; i < myNumbers.length; i++) {
			System.out.printf("Value on array position %d is: %d\n",i,myNumbers[i]);
		}
		
		
	}
}
