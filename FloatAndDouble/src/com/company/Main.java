package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //width of 32 = 4 bytes
        int myIntValue = 5 / 3;
        //width of 32 = 4 bytes
        float myFloatValue = 5F / 3F;
        //width of 64 = 8 bytes
        double myDoubleValue = 5D / 3D;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double myPounds = 10D;
        double myKilograms = myPounds * 0.45359237D;
        System.out.println("myKilograms = " + myKilograms);

    }
}
