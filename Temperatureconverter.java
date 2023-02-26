package javacoding;

import java.util.Scanner;

public class Temperatureconverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.println("Celsius = ");
		celsius = input.nextDouble();
		
		fahrenheit = 1.8 * celsius + 32;
		
		System.out.println("Fahrenheit : "+ fahrenheit);

	}

}
