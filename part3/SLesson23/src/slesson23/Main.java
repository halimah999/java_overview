package slesson23;



public class Main {

	public static void main(String[] args) {
		
		final double PI = 3.14159;
		//class with final method
		Parent parent = new Parent();
				
		//PI = 4;  //You can't change a final variable
		EmployeeDetails employeeDetails = new EmployeeDetails(3,"sara");
		//cannot change "what the object is referring to"
		//but we can modify the object itself
		employeeDetails.name="Maryam";
		System.out.println(employeeDetails.name);
		
		System.out.println(PI);
		
	}}


