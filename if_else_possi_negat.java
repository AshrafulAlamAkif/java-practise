package java_basic;

import java.util.Scanner;

public class if_else_possi_negat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("Enter Number: ");
		num = input.nextInt();
		
		if(num>0) {
			System.out.println("Possitive");
		}
		else if(num<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("Equal");
		}

	}

}
