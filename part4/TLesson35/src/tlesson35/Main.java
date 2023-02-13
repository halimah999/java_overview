package tlesson35;

//***********************************************
public class Main {

	public static void main(String[] args) {
		
		// Encapsulation = 	attributes of a class will be hidden or private, 
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if you don't have a reason to make them public/protected
		
		Car car = new Car("Chevrolet","Camaro",2021);
//		Car car2 = new Car("Ford","Mustang",2022);
		Car car2 = new Car(car);
		
		car.setYear(2022);
//		car2.copy(car);
		car2.setYear(2023);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		
		
	}

}
//***********************************************

