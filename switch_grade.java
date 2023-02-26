package java_basic;

import java.util.Scanner;

public class switch_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter grade: ");
		String grade = input.next().toUpperCase();
		//char grade = input.next().charAt(0);
		
		String message = "";
		switch(grade) {		//(grade.toLowerCase())
			case "A":
				message = "grate";
				break;
			case "B":
				message = "good";
				break;
			default:
				message = "Invalid";
		}
		System.out.println(message);

	}

}
