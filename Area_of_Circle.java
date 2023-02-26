package javacoding;

import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double radius, area;
		
		System.out.println("Enter radius : ");
		
		radius = input.nextDouble();
		
		area = 3.1416 * radius * radius;
		
		System.out.println("Enter area of Circle : "+area);
			

	}

}
