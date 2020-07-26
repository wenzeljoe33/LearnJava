package joe.wenzel;

public class Main {

    public static void main(String[] args) {
	    int result = 3;
        System.out.println("1 + 2 = " + result);
        int prevResult = result;
        System.out.println("previous Result =  " + prevResult);
        result -= 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previos result = " + prevResult);

        result *= 10;

        System.out.println("2 * 10 = " + result);
    }

}
