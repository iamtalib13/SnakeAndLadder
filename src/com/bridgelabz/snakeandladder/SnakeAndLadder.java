package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    public static final int IS_NO_PLAY=0;
    public static final int IS_LADDER=1;
    public static final int IS_SNAKE=2;


    int playerPosition=0;
    int newPosition=0;

    public void showPosition(){
        System.out.println("Initial position of player = "+playerPosition);

    }
    public int rollDie()
    {
        int dieNo=(int) Math.floor(Math.random()*10)%6+1;
        return dieNo;
    }

    public void optionPlay(int dieNo)
    {
        int optionNo= (int) Math.floor(Math.random()*10)%3+1;
        System.out.println("Option No : "+optionNo);
        switch (optionNo)
        {
            case IS_NO_PLAY :
                System.out.println("No Play");
                newPosition=0;
                break;
            case IS_LADDER:
                System.out.println("Player Got Ladder");
                playerPosition=playerPosition+dieNo;
                break;
            case IS_SNAKE:
                System.out.println("Player got snake");
                playerPosition= playerPosition-dieNo;
                if(playerPosition<0)
                {
                    playerPosition=0;
                }
                break;

        }
    }
    public static void main(String[] args) {
        SnakeAndLadder P1 = new SnakeAndLadder();


        System.out.println("Die Number For Player : "+P1.rollDie());
        P1.optionPlay(P1.rollDie());
        P1.showPosition();
    }
}
