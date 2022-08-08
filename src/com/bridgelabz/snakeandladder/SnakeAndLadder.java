package com.bridgelabz.snakeandladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    public static final int IS_NO_PLAY = 0;
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;


    int playerPosition = 0;
    int newPosition = 0;
    int diceCount = 0;
    static int player1Play = 1;

    Random randomNum = new Random();

    public void showPosition(int playerNo) {

        System.out.println("Player " + playerNo + " Position : " + playerPosition);
        if(playerNo==1 && playerPosition==100)
        {
            System.out.println("-----------------------");
            System.out.println("Player 1 is Winner . .");
        }
        else if(playerNo==2 && playerPosition==100){
            System.out.println("-----------------------");
            System.out.println("Player 2 is Winner . .");
        }
    }

    public int rollDie() {
        int dieNo = randomNum.nextInt(6) + 1;
        diceCount++;
        System.out.println("Dice Count : " + diceCount);
        return dieNo;
    }

    public void playGame(int playerNo) {
        int dieNo = rollDie();
        System.out.println("Die Number for Player " + playerNo + ": " + dieNo);
        optionPlay(dieNo);
        showPosition(playerNo);
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

    public static void playerChance() {
        if (player1Play == 1) {
            player1Play = 0;
        } else {
            player1Play = 1;
        }

    }

    public boolean checkWin() {
        if (playerPosition == 100) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int checkLadder = 0;
        SnakeAndLadder P1 = new SnakeAndLadder();
        SnakeAndLadder P2 = new SnakeAndLadder();
        P1.showPosition(1);
        P2.showPosition(2);


        while (!P1.checkWin() && !P2.checkWin()) {
            if (player1Play == 1) {
                P1.playGame(1);
            } else {
                P2.playGame(2);
            }
            playerChance();

        }
    }
}
