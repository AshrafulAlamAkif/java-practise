package java_basic;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String state = "Y";
		while(state.toLowerCase().equals("y")) {
			System.out.println("Enter num1: ");
			int num1 = input.nextInt();
			
			System.out.println("Enter num2: ");
			int num2 = input.nextInt();
			int sum = num1+num2;
			
			System.out.println("sum is: "+sum);
			System.out.println("do you want to sum again? type y");
			state = input.next();
			
		}

	}

}
