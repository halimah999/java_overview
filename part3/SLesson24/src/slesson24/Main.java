package slesson24;


//*******************************************
public class Main {

	public static void main(String[] args) {
		//an object = instance of class that may contain attributes and methods
		
		Car myCar1 = new Car();
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
	}
}
