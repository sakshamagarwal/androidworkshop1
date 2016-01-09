public class Human {
	int age;
	String name;
	String contact;

	public Human(String name, int age, String contact) {
		this.age = age;
		this.name = name;
		this.contact = contact;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

	public String introduce() {
		return "Hey I'm " + name + " and I'm " + age + " years old." + " You can contact me on " + contact;
	}
}