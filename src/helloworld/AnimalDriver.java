package helloworld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalDriver {

	public static void main(String[] args) {
		Animal a = new Cow(2, "Muuuuh");
		Animal b = new Dog(10, "Wuff");
		
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		myAnimals.add(a);
		myAnimals.add(b);
		
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
		
		
		System.out.println();
		System.out.println("*************************");
		System.out.println("Using a stream");
		List<Animal> as = myAnimals.stream().filter(z -> {
			if(z.getAge()==2) {
				return true;
			}else{
				return false;
			}
		}).collect(Collectors.toList());
		as.forEach(x -> {
			x.printAge();
			x.speak();
		});
		
	}

}
