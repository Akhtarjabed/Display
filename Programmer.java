package assignment5;

class Programmer {
	public static void display(){
		System.out.println("The Original Code");
	}
}

class Hacker extends Programmer{
	public static void display(){
		System.out.println("Your code is hacked");
	}
}
