public class MyProgram {
	public static void main(String[] args) {
		
		//
		Batman batman = new Batman("Bruce Wayne", 25, "9999999999", "Batman");
		System.out.println(batman.getName());
		System.out.println(batman.getAge());
		System.out.println(batman.getContact());
		//The above 3 methods are of the parent class as we have not overriden them
		System.out.println(batman.getAlterEgo());
		System.out.println(batman.introduce());
		batman.executeSuperPower();
		//We have overriden the introduce method in the SuperHero class so the method of the SuperHero class is called

		System.out.println();

		//A shorthand way of doing the above thing is like this

		SuperHero ironman = new SuperHero("Tony Stark", 28, "123456789", "Ironman") {

			@Override
			public void executeSuperPower() {
				System.out.println("Sorry the battery is low, can't execute my super power");
			}
		};

		System.out.println(ironman.getName());
		System.out.println(ironman.getAge());
		System.out.println(ironman.getContact());
		System.out.println(ironman.getAlterEgo());
		System.out.println(ironman.introduce());
		ironman.executeSuperPower();

	}
	
}