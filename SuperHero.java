public class SuperHero extends Human{
	
	private String alterEgo;

	public SuperHero(String name, int age, String contact, String alterEgo) {
		super(name, age, contact);
		this.alterEgo = alterEgo;
	}

	public String getAlterEgo() {
		return alterEgo;
	}

	public String introduce() {
		return super.introduce() + " I'm also known as " + alterEgo + "!";
	}

	/* With inheritence we can easily use all the features that we have already built in our Human Class.
	We save ourseleves from rewriting a lot of code and also its much easier to read and understand the code. :)*/
}