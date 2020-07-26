package joe.wenzel;

public class Main {

    public static void main(String[] args) {
		String myString = "This is a String";
		System.out.println(myString);
		myString = myString + " this is more....";
		System.out.println(myString);
		myString = myString + " \u00A9 2020";
		System.out.println(myString);
    }
}
