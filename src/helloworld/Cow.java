package helloworld;

public class Cow extends Animal{

	private String voice; 
	
	public Cow(int age, String voice) {
		super(age);
		this.voice = voice;
	}
	
	public void speak() {
		System.out.println("Speaking..." + voice);
	}
	
	public void presentCow() {
		System.out.println("Hello I'm the cow");
	}
}
