package SLesson13;

public class Main {

	public static void main(String[] args) {
		// array used to store multiple value to single variable
		
		String car[] = new String[3];
		
		car[0] = "BMW";
		car[2] = "Tesla";
		car[1] = "Corvette";

	
	
	for(int i= 0;i<car.length;i++) {
		System.out.println(car[i]);
	}

}}
