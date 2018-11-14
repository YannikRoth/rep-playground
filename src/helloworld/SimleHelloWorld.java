package helloworld;

import java.util.Scanner;

public class SimleHelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String value = scan.nextLine();
		
		System.out.println("Hello " + value);
		
		RandomNumber r = new RandomNumber();
		System.out.println(r.getNumber());

	}

}
