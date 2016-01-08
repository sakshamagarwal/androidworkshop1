class Turtle implements Movable{
	private int age;
	private String species;

	public Turtle(int age, String species) {
		this.age = age;
		this.species = species;
	}

	public void move(int miles) {
		System.out.println("I'm a Turtle, I can't move for a mile");
	}
}