package slesson15;

public class Main {
	  private static String myStr = "Techvidvan: Static Class Article";
	  private static int number1 = 20;
	  private static int number2 = 5;

	  //declaring Static class
	  static class NestedStatic {

	    //declaring non-static method
	    public void display() {
	      int minus = number1 - number2;
	      System.out.println("The Subtraction of number " + number1 + " and " + number2 + " is " + minus);
	      System.out.println(myStr);
	    }
	  }
	  public static void main(String args[]) {
	    NestedStatic obj = new NestedStatic();
	    obj.display();
	  }
	}