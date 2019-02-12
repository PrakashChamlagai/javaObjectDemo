package cat.demo;

import java.util.Scanner;

public class CatDemo {

	public static void main(String[] args) {
		
		//Create Cat object using Constructor with parameters and display it
		Cat aaya = new Cat("Aaya", 4.5, "White", 25.2, 17.7);
		System.out.println(aaya.toString());
		
		//Create second Cat object using Default constructor
		Cat Meow = new Cat();
		//display the default value stored by Meow cat object
		System.out.println("\nDefault value stored in Meow object: \n" + Meow.toString());
		
		//Set all the propertries of Meow object
		Meow.setName("Roja");
		Meow.setAge(5.2);
		Meow.setWeight(18.5);
		Meow.setHeight(21.3);
		Meow.setColor("Black");
		
		//Dispalay Meow object after setting it's properties
		System.out.println("\nAfter updating the properties of Meow: \n" + Meow.toString());
		
		//Change the name of the cat aaya
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter new name for you cat.");
		String name;
		
		//Check if the name is an empty string
		do {
			name = scan.nextLine();
		}while(name.isEmpty());
		
		//Otherwise assign new name
		aaya.setName(name);
		
		//After updating name display it
		System.out.println("New name of your cat is " + aaya.getName());
		System.out.println();
		
		//Update cat's weight;
		double weight;
		//Check if the weight is <= 0
		do{
			System.out.println("Enter your cat's new weight. Cat weight should be greater than 0.");
			weight = scan.nextDouble();
		}while(weight <= 0);
		
		aaya.setWeight(weight);
		
		System.out.println("New weight of " + aaya.getName() + " is " + aaya.getWeight() + " Lbs");
		
		System.out.println();
		System.out.println(" Updated info of your cat");
		System.out.println("--------------------------");
		System.out.println(aaya.toString());
		
		scan.close();
	}

}
