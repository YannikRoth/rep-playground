package helloworld;

public class Bird extends Animal{
	
	private String voice;
	
	public Bird(int age, String voice) {
		super(age);
		this.voice = voice;
	}
	
	public void speak() {
		System.out.println("Speaking..." + voice);
	}

}
