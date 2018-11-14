package helloworld;

import java.util.Random;

public class RandomNumber {

	private int rnd;
	
	public RandomNumber() {
		Random rnd = new Random();
		this.rnd = Math.abs(rnd.nextInt());
	}
	
	public int getNumber() {
		return this.rnd;
	}
}
