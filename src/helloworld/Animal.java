package helloworld;

public abstract class Animal {

	private int age;
	
	public Animal(int age) {
		this.age = age;
	}
	
	public void printAge() {
		System.out.println("The animal has an age of:" + this.age);;
	}
	
	public abstract void speak();
}
