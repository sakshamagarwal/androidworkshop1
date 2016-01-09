public class SuperHero extends Human{
	
	private String alterEgo;
	private SuperPower superPower;

	public SuperHero(String name, int age, String contact, String alterEgo, SuperPower superPower) {
		super(name, age, contact);
		this.alterEgo = alterEgo;
		this.superPower = superPower;
	}

	public String getAlterEgo() {
		return alterEgo;
	}

	@Override
	public String introduce() {
		return super.introduce() + " I'm also known as " + alterEgo + "!";
	}

	public void executeSuperPower() {
		superPower.executeSuperPower();
	}

	/* With inheritence we can easily use all the features that we have already built in our Human Class.
	We save ourseleves from rewriting a lot of code and also its much easier to read and understand the code. :)*/
}