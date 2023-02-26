package java_basic;

import java.util.Scanner;

public class if_else_vowel_Conso {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter letter: ");
		char ch = input.next().charAt(0);
		
		if(ch =='a' || ch == 'e'||ch =='i'||ch =='o' ||ch =='u' ) {
			System.out.println("Vowel");
			if(ch>='a' && ch<='z') {
				System.out.println("small letter");
			}
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("capital letter");
		}
		else {
			System.out.println("Consonent");
		}
		
	}

}
