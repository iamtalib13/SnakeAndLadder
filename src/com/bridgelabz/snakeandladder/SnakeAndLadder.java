package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    int StartPosition=0;

    public void showPosition(){
        System.out.println("Initial position of player = "+StartPosition);

    }

    public static void main(String[] args) {
        SnakeAndLadder P1 = new SnakeAndLadder();

        P1.showPosition();
    }
}
