package joe.wenzel;

public class Main {

    public static void main(String[] args) {
//	    float myMinFloat = Float.MIN_VALUE;
//	    float myMaxFloat = Float.MAX_VALUE;
//        System.out.println("Minimum value = " + myMinFloat);
//        System.out.println("Maximum value = " + myMaxFloat);
//
//        double myMinDouble = Double.MIN_VALUE;
//        double myMaxDouble = Double.MAX_VALUE;
//        System.out.println("Minimum value = " + myMinDouble);
//        System.out.println("Maximum value = " + myMaxDouble);
//
//        int myIntValue = 5/2;
//        float myFloatValue = 5f/2f;
//        double myDoubleValue = 5.0/3.0;
//
//        System.out.println("MyIntValue = " + myIntValue);
//        System.out.println("MyFloatValue = " + myFloatValue);
//        System.out.println("MyDoubleValue = " + myDoubleValue);

        double myPounds = 180d;
        double kiloConversion = .45359237d;
        double myKilo = myPounds * kiloConversion;

        System.out.println("My weight in pounds: " + myPounds);
        System.out.println("My weight in kilos: " + myKilo);
    }
    
}
