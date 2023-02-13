package package1;
import package2.*;


public class A {
	// protected String  protectedMessage ="This is protected";
	public static void main(String[] args) {
		//System.out.println(c.defultMessage); error
		C c = new C();
		System.out.println(c.publicMessage);


	}

}
