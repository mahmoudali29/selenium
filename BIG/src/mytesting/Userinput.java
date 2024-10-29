package mytesting;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		System.out.print("Please Enter your Name : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Welcome " + name);
		
		System.out.print("Please Enter your Age : ");
		Scanner input_age = new Scanner(System.in);
		String age = input_age.nextLine();
		int age_ = Integer.parseInt(age);
		
		System.out.print("Your age is " + (age_+5));
	}
}
