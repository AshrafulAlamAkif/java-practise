package java_basic;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		
		System.out.print("Enter your namme: ");
		name = input.nextLine();
		
		System.out.print("Ener number = ");
		num = input.nextInt();
		
		System.out.println("name is: "+name);
		System.out.println("the number is: "+num);
		
	}

}
