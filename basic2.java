package java_basic;

import java.util.Scanner;

public class basic2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter number2: ");
		int number2 = input.nextInt();
		
		int result= number1+number2;
		//or
		result = number1+=number2;
		//or
		number1+=number2;
		
		System.out.println("Result is = "+result);
		System.out.println("Result is = "+result);
		System.out.println("Result is = "+number1);
		
		
		System.out.println();
		System.out.println("Hello World");
		
	}

}
