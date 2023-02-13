package SLesson6;

import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		double x = random.nextDouble(6.0);
		int y = random.nextInt(11)+1;
		System.out.println(x);
		System.out.println(y);

	}

}
