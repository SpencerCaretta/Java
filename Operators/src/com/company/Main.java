package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println("Result = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println("Result is now = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println("Result is now = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println("The Remainder is = " + result);

        previousResult = result;
        result++;
        System.out.println("Increment is = " + result);

        previousResult = result;
        result--;
        System.out.println("Decrement is = " + result);

        previousResult = result;
        result += 2;
        System.out.println("Result is now " + result);
        result += 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien.");

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("You got the top score!");

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100!");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true.");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen!");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true.");

        double firstDouble = 20D;
        double secondDouble = 80D;
        double operatorDouble = (firstDouble + secondDouble) * 25D;
        double remainderDouble = operatorDouble % 40;
        if (remainderDouble <= 20)
            System.out.println("Total was over the limit!");



    }
}
