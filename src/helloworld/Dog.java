package helloworld;

public class Dog extends Animal{

	private String voice;
	
	public Dog(int age, String voice) {
		super(age);
		this.voice = voice;
	}
	
	public void speak() {
		System.out.println("Speaking..." + voice);
	}
}
