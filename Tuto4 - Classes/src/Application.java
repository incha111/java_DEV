
public class Application {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.firstName = "Incha";
		person1.lastName = "N'Goy";
		person1.age = 47;
		
		Person person2 = new Person();
		person2.firstName = "Lisa";
		person2.lastName = "Matton";
		person2.age = 38;
		
		person1.showInfo();
		person2.showInfo();
	}
}
