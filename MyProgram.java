public class MyProgram {
	public static void main(String[] args) {
		
		//Pay speacial attention to how objects are created from the class by calling the constructor
		SuperHero batman = new SuperHero("Bruce Wayne", 25, "9999999999", "Batman");
		System.out.println(batman.getName());
		System.out.println(batman.getAge());
		System.out.println(batman.getContact());
		//The above 3 methods are of the parent class as we have not overriden them
		System.out.println(batman.getAlterEgo());
		System.out.println(batman.introduce());
		//We have overriden the introduce method in the SuperHero class so the method of the SuperHero class is called

		System.out.println();

		SuperHero ironman = new SuperHero("Tony Stark", 28, "123456789", "Ironman");
		System.out.println(ironman.getName());
		System.out.println(ironman.getAge());
		System.out.println(ironman.getContact());
		System.out.println(ironman.getAlterEgo());
		System.out.println(ironman.introduce());

		Human peter = new SuperHero("Peter Parker", 34, "7439828491", "Spiderman");
		System.out.println(peter.getName());
		System.out.println(peter.getAge());
		System.out.println(peter.getContact());
		//System.out.println(peter.getAlterEgo());
		/*Note that I cannot run the getAlterEgo method for the object peter even though it is a superhero
		This is because the variable peter is of type Human and the compiler cannot find a method getAlterEgo method in Human Class
		However, when the following statement is executed introduce method gives us the alterEgo as well!
		Whats happening here is that compiler treats peter as Human only and finds the execution of introduce method valid
		But at the runtime, the introduce method of SuperHero Class is called because peter is actually created as a SuperHero. */
		System.out.println(peter.introduce());

		System.out.println();
		SuperHero spiderman = (SuperHero)peter; //Note that I can typecast a human to superhero only if the object was created as a superhero
		System.out.println(spiderman.getAlterEgo());


		/*The following will be totally invalid:
		SuperHero heisenberg = new Human("Walter White", 45, "6789123456");
		This is because only those Humans can be typecasted to SuperHeros which actually are superheros
		But reverse is always true i.e. each superhero can be typecasted to human*/

	}
	
}