
public class Application {
	public static void main(String[] args) {
		Person person1 = new Person("Incha","N'Goy",47);
		/*person1.firstName = "Incha";
		person1.lastName = "N'Goy";
		person1.age = 47;*/
		
		Person person2 = new Person("Lisa","Matton",38);
		/*person2.firstName = "Lisa";
		person2.lastName = "Matton";
		person2.age = 38;*/
		
		person1.showInfo();
		person1.sayHello();
		person2.showInfo();
		person2.speak("Hello there. I'm " + person2.firstName);
	}
}
