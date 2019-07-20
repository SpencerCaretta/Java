package com.company;

public class Main {

    public static void main(String[] args) {

        boolean GameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);


    }

    public static void calculateScore(boolean GameOver, int score, int levelCompleted, int bonus) {

        if(GameOver) {
            int finalScore = score + (levelCompleted * bonus);
            //duplicating leads to problems when changing things
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
        }

    }
}
