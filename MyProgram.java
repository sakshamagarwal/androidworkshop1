public class MyProgram {
	public static void main(String[] args) {
		
		//Pay speacial attention to how objects are created from the class by calling the constructor
		Human sheldon = new Human("Sheldon Cooper", 25, "9999999999");
		System.out.println(sheldon.getName());
		System.out.println(sheldon.getAge());
		System.out.println(sheldon.getContact());
		System.out.println(sheldon.introduce());

		System.out.println();

		Human rachel = new Human("Rachel Zane", 28, "123456789");
		System.out.println(rachel.getName());
		System.out.println(rachel.getAge());
		System.out.println(rachel.getContact());
		System.out.println(rachel.introduce());

		/* By the use of classes I can contain all the properties of sheldon and rachel in one variable.
		Without classes I would have to handle 3 values for each namely 
		sheldon_name, sheldon_age, sheldon_contact
		rachel_name, rachel_age, rachel_contact
		With classes the code is much concise and easier to read and makes much more sense*/
	}
	
}