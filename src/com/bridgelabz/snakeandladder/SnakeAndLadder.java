package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
    public static final int IS_NO_PLAY = 0;
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;


    int playerPosition = 0;
    int newPosition = 0;

    Random randomNum = new Random();

    public void showPosition() {
        if (playerPosition == 100) {
            System.out.println("position of player = " + playerPosition);
            System.out.println("Congratulations you are Winner !!");
        } else {
            System.out.println("position of player = " + playerPosition);
        }

    }

    public int rollDie() {
        int dieNo = randomNum.nextInt(6) + 1;
        return dieNo;
    }

    public void optionPlay(int dieNo) {
        int optionNo = randomNum.nextInt(3);
        System.out.println("Option No : " + optionNo);
        switch (optionNo) {
            case IS_NO_PLAY:
                System.out.println("No Play");
                break;

            case IS_LADDER:
                System.out.println("Player Got Ladder ");
                playerPosition = playerPosition + dieNo;
                if (playerPosition > 100) {
                    System.out.println("Sorry The Position is Out of Board.");
                    playerPosition -= dieNo;
                }
                break;

            case IS_SNAKE:
                System.out.println("Player got snake !!");
                playerPosition = playerPosition - dieNo;

                if (playerPosition < 0) {
                    playerPosition = 0;
                }
                break;

        }
    }

    public static void main(String[] args) {
        SnakeAndLadder P1 = new SnakeAndLadder();
        P1.showPosition();

        while (P1.playerPosition != 100) {
            int dieNo = P1.rollDie();
            System.out.println("Die Number For Player : " + dieNo);

            P1.optionPlay(dieNo);
            P1.showPosition();
            System.out.println("----------------------------------");
        }
    }
}
