package trustly.models;

public class Person {
    private int age;
	private String name;
	private String dream;
	private String nationality;

	public Person(int age, String name, String nationality, String dream)
	{
		this.age = age;
		this.name = name;
		this.dream = dream;
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDream() {
		return dream;
	}

	public void setDream(String dream) {
		this.dream = dream;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public @Override String toString()
	{
		String site_name[] = {this.name, String.valueOf(this.age), this.nationality, this.dream};        
		return "Hey, my name is %s, I'm %s years old, I'm %s and my dream is to %s".formatted(site_name);
	}
}
