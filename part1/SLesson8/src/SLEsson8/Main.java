package SLEsson8;

public class Main {

	public static void main(String[] args) {
		/* switch = statement that allows a variable 
		to be tested for equality against a list of values*/
		
		String day = "Pizza";
		switch(day) {
		case "Sunday" : System.out.println("it is Sundy");
		break;
		case "Monday" : System.out.println("it is Monday");
		break;
		case "Tuesday" : System.out.println("it is Tundy");
		break;
		case "Wensday" : System.out.println("it is Wensday");
		break;
		case "Thursday" : System.out.println("it is Thursday");
		break;
		case "Friday" : System.out.println("it is Friday");
		break;
		case "Saturday" : System.out.println("it is Saturday");
		break;
		default:System.out.println("it is invalid value");
		break;
		}

	}

}
