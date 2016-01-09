public class MyProgram {
	public static void main(String[] args) {
		
		//Here is another way to provide superPower to our superHeroes by passing an Interface object to the constructor
		SuperHero batman = new SuperHero("Bruce Wayne", 25, "9999999999", "Batman", new SuperPower() {
			@Override
			public void executeSuperPower() {
				System.out.println("I am Batman ! I can kill Joker!!");
			}
		});
		System.out.println(batman.getName());
		System.out.println(batman.getAge());
		System.out.println(batman.getContact());
		System.out.println(batman.getAlterEgo());
		System.out.println(batman.introduce());
		batman.executeSuperPower();

		System.out.println();

	}
	
}