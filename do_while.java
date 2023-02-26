package java_basic;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		String state = "";
		do {
			System.out.println("enter num1: ");
			int num1 = input.nextInt();
			System.out.println("enter num2: ");
			int num2 = input.nextInt();
			
			int sum = num1+num2;
			System.out.println("the sum is: "+sum);
			
			System.out.println("run again? enter y");
			state = input.next();
			
			
		}while(state.toLowerCase().equals("y"));
		
//		for(int i=0; i<=4; i++) {
//			System.out.println(i);
//			for(int j=10; j>=2; j-=2) {
//				System.out.println(j);
//			}
//		}

	}

}
