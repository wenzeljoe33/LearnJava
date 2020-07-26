package joe.wenzel;

public class Main {

    public static void main(String[] args) {
//        int myVal = 10000;
//        int myMaxIntTest = 2_147_483_647;
//        int myMin = Integer.MIN_VALUE;
//        int myMax = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value = " + myMin);
//        System.out.println("Integer Maximum Value = " + myMax);
//        System.out.println("Busted: " + (myMax+1)); //Overflow
//        System.out.println("Busted: " + (myMin-1)); //Overflow
//
//        byte myMinByte = Byte.MIN_VALUE;
//        byte myMaxByte = Byte.MAX_VALUE;
//        System.out.println("Byte Maximum Value = " + myMaxByte);
//        System.out.println("Byte Minimum Value = " + myMinByte);
//
//        short myMinShort = Short.MIN_VALUE;
//        short myMaxShort = Short.MAX_VALUE;
//        System.out.println("Short Maximum Value = " + myMaxShort);
//        System.out.println("Short Minimum Value = " + myMinShort);
//
//        long myLongVal = 100L;
//        long myMinLong = Long.MIN_VALUE;
//        long myMaxLong = Long.MAX_VALUE;
//        System.out.println("Long Maximum Value = " + myMaxLong);
//        System.out.println("Long Minimum Value = " + myMinLong);
//
//        long bigLong = 2_147_483_647_234L;
//
//        short bigShort = 32678;
//
//        int myTotal = (myMin/2);
//        byte myNewByte = (byte) (myMinByte/2);
//        short myNewShort = (short) (myMinShort/2);
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        int mySum = (myByte + myShort + myInt);
        long myLong = 50000L + 10L * (mySum);
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 *
                (mySum));


    }
}
