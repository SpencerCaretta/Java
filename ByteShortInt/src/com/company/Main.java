package com.company;

public class Main {

    public static void main(String[] args) {

        // Int has a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // Byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);

        // Short has a width of 16
        short myShortValue = 32767;

        // Put L after a long value and has a width of 64
        long myLongValue = 100L;


        byte eqByte = 60;
        short eqShort = 2740;
        int eqInt = 839201;
        long eqLong = 50000L + (10L * (eqByte + eqShort + eqInt));

        System.out.println(eqLong);

    }
}
