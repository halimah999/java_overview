package SLesson9;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// logical operators = used to connect two or more expressions
		//
		//						&& = (AND) both conditions must be true
		// 						|| = (OR) either condition must be true
		//						! = (NOT) reverses boolean value of condition

		// ---------Example1------------
		float temp = 69;
		if(temp>30) {
			System.out.println("It is hot outside");
			
		}
		else if (temp>=20 && temp<=30) {
			System.out.println("It is warm outside");

		}
		else {
			System.out.println("It is cold outside");

		}
		// ---------Example2------------
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String respons = scanner.next();
		if(respons.equals("q") || respons.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game ");
		}
	}

}