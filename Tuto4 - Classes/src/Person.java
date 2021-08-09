
public class Person {
	//Data
	String firstName;
	String lastName;
	int age;
	
	// Method
	public void showInfo() {
		//System.out.println("My name is " + firstName + " " + lastName + " and I am " + age + " years old.");
		System.out.printf("My name is %s %s and I'm %d years old.\n",firstName,lastName,age);
	}
}
