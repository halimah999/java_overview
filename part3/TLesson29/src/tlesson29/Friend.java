package tlesson29;

public class Friend {


	String name;
	
	static int numberOfFriends;
	
	Friend(String name){
		this.name=name;
		numberOfFriends++;
	}
	static String  displayFriends() {
		return "you have "+numberOfFriends+" friends";
	}
}
