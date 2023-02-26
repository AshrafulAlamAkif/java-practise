package java_basic;

import java.util.Scanner;

public class if_else_even_oddPossiNagat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number1: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter number2: ");
		int num2 = input.nextInt();
		
		int sum  = num1 +num2;
		
		if(sum%2 == 0 && sum >= 0) {
			System.out.println("even and " + " sum is possitive");
		}
		else if(sum%2 != 0 && sum >= 0){
				System.out.println("odd and" + " sum is possitive");
			}
		else if(sum%2 == 0 && sum < 0) {
			System.out.println("even and" + " sum is negative");
		}
		else {
			System.out.println("odd and" + " sum is negative");
		}
	}
	
}
	
