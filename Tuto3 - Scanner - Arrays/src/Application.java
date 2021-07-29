import java.util.Arrays;
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
		
		// Multidimensional array
		int[][] multiArray = {
				{1,2,3},
				{4,5},
				{6,7,8,9,10}
		};
		System.out.println();
		System.out.println("Display multiArray");
		// First way to display the multiArray
		/*for(int[] mArray: multiArray) {
			System.out.println(Arrays.toString(mArray));
		}*/
		
		// Second way to display the multiArray
		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
				System.out.print(multiArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.printf("Value of multiArray on position[0][2] is: %d\n",multiArray[0][2]);
		System.out.printf("Value of multiArray on position[1][0] is: %d\n",multiArray[1][0]);
		System.out.printf("Value of multiArray on position[2][3] is: %d\n",multiArray[2][3]);
	}
}
