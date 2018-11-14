package helloworld;

import java.util.ArrayList;

public class AnimalDriver {

	public static void main(String[] args) {
		Animal a = new Cow(2, "Muuuuh");
		Animal b = new Dog(10, "Wuff");
		Animal c = new Bird(3, "Zzzzz");
		
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		myAnimals.add(a);
		myAnimals.add(b);
		myAnimals.add(c);
		
		System.out.println("Using a for-loop");
		for(Animal x : myAnimals) {
			x.printAge();
			x.speak();
		}
		
		System.out.println();
		System.out.println("*************************");
		System.out.println("Using a Lambda function");
		
		myAnimals.forEach(l -> {
			l.printAge();
			l.speak();
		});
		
	}

}
