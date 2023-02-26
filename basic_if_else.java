package java_basic;

import java.util.Scanner;

public class basic_if_else {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		int number= input.nextInt();
		
		System.out.println("Enter number2: ");
		int number2= input.nextInt();
		
		int sum = number+number2;
		
		if(sum%2 ==0) {
			System.out.println("result is even");
		}
		else {
			System.out.println("result is odd");
		}
		
		
	}

}
