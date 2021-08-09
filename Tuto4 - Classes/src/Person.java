
public class Person {
	//Data
	String firstName;
	String lastName;
	int age;
	
	// Constructor
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// Method
	public void showInfo() {
		//System.out.println("My name is " + firstName + " " + lastName + " and I am " + age + " years old.");
		System.out.printf("My name is %s %s and I'm %d years old.\n",firstName,lastName,age);
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	public void speak (String str) {
		System.out.println(str);
	}
}
