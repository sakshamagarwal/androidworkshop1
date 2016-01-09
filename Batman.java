public class Batman extends SuperHero {
	
	public Batman(String name, int age, String contact, String alterEgo) {
		super(name, age, contact, alterEgo);
	}
	/*This is something I did not specify in the class
	The constructor of the parent class is not inherited by the child,
	hence you need to implement a constructor here */


	public void executeSuperPower() {
		System.out.println("I am Batman, I can kill the joker!!!");
	}
}