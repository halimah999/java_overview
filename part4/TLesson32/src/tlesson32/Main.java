package tlesson32;

public class Main {

	public static void main(String[] args) {
		
		// super = 	keyword refers to the superclass (parent) of an object
		//very similar to the "this" keyword
		
		Hero hero = new Hero("Batman",43,"$$$");
//		System.out.println(hero.power);
//		System.out.println(hero.name);
					
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Superman",43,"everything");
		System.out.println(hero2.toString());
			


	}

}
