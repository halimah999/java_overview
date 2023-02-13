package SLesson12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int coulmn;
		String symbol;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter # rows");
		row=scanner.nextInt();
		System.out.println("Enter # coulmns");
		coulmn=scanner.nextInt();
		System.out.println("Enter symbol");
		symbol=scanner.next();
		
		for(int i =1;i<=row;i++) {
			System.out.println();
			for(int j =1;j<=i;j++) {
				System.out.print(symbol);}}
		}}
