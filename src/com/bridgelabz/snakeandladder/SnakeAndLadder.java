package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    int StartPosition=0;

    public void showPosition(){
        System.out.println("Initial position of player = "+StartPosition);

    }
    public int rollDie()
    {
        int dieNo=(int) Math.floor(Math.random()*10)%6+1;
        return dieNo;
    }

    public static void main(String[] args) {
        SnakeAndLadder P1 = new SnakeAndLadder();

        P1.showPosition();
        System.out.println("Die Number For Player : "+P1.rollDie());
    }
}
