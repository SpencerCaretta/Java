package com.company;

public class Main {

    public static void main(String[] args) {

        boolean GameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


//        //Can get rid of brackets if only one line after if statement
//        if(score < 5000 && score > 1000) {
//            //This is a called a code block
//            System.out.println("Your score was less than 5000, but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got Here");
//        }

        if(GameOver) {
            int finalScore = score + (levelCompleted * bonus);
            //duplicating leads to problems when changing things
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }

//        int secondScore = 10000;
//        int secondLevelCompleted = 8;
//        int secondBonus = 200;
//
//        if(GameOver) {
//            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
//            System.out.println("Your final score is " + finalScore);
//        }
//

        //Another solution
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(GameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

    }


}
