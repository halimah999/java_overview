package slesson23;

public class EmployeeDetails {
	  //Blank final variable
	    final int id;
	    String name;

	  //parameterized constructor
	  EmployeeDetails(int idNum,String name) {
	    //Blank final variable must be initialized in constructor
	    id = idNum;
	    this.name = name;
	  }
	  


	  void getDetails() {
	    System.out.println("Id of the Employee is: " + id);
	  }}
