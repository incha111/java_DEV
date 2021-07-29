
public class Application {
	public static void main(String[] args) {
		int myVariable = 5;
		String str = "Hello World!";
		
		for(int i = 0; i < 10; i++) {
			if(i == myVariable) {
				continue;
			}
			
			System.out.printf("Value of i = %d\n", i);
			
			if(i == 7) {
				System.out.printf(" - %s\n",str);
			}
		}
	}
}
