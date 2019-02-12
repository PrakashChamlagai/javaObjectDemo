package cat.demo;

public class Cat {
	private String name;
	private double age;
	private String color;
	private double height;
	private double weight;
	
	//Default Constructor
	public Cat() {
		this.name = " ";
		this.age = 0.0;
		this.color = "White";
		this.height = 0.0;
		this.weight = 0.0;
	}
	
	//Constructor with fields
	public Cat(String name, double age, String color, double height, double weight) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat name = " + name + ", age = " + age + ", color = " + color + ", height = " + height + ", weight = " + weight;
	}
}
