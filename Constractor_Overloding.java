package java_Advance;

import java.util.Scanner;

public class Constractor_Overloding {
	double width; //private double width;
	double length; //private double length;
	//public Scanner input = new Scanner(System.in);
	private Scanner input = new Scanner(System.in);
	
	//default constructor
	public Constractor_Overloding() {
		width = 5;
		length = 5;
		System.out.println("Default");	
	}
	
	//customize constructor
	public Constractor_Overloding(double length_1, double width_1) {
		this.width = width_1; // this name class of name
		this.length = length_1;
		System.out.println("Custom");
	}

	public static void main(String[] args) {
		//class object create
		//after new constructor name
		Constractor_Overloding ConstractorOverloding = new Constractor_Overloding();
		//hold value inside length and width
//		double length = ConstractorOverloding.getRoomLength();
//		double width = ConstractorOverloding.getRoomWidth();
		ConstractorOverloding.input.close();
		
//		System.out.println(width * length);
		
		//print default
		System.out.println(ConstractorOverloding.length * ConstractorOverloding.width);
		
		Constractor_Overloding ConstractorOverloding1 = new Constractor_Overloding(3.0, 3.0);
		System.out.println(ConstractorOverloding1.length * ConstractorOverloding1.width);


	}
	public double getRoomLength() {
		System.out.println("Enter length of your room: ");
		double length = input.nextDouble();
		return length;	
	}
	public double getRoomWidth() {
		System.out.println("Enter width of your room: ");
		double width = input.nextDouble();
		return width;	
	}

}
