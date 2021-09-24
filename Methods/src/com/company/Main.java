package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameover = true;
        int scor = 800;
        int levelcompleted = 5;
        int bonus = 100;
      int highscor= calculatescor(gameover,scor,levelcompleted,bonus);
        System.out.println("your final scor was =" + highscor);
         scor = 10000;
         levelcompleted = 8;
         bonus = 200;
       highscor =calculatescor(gameover,scor,levelcompleted,bonus);
        System.out.println("your final scor was =" + highscor);



        int highscorposition =calculatehighscorposition(1500);
        displsyhighscorposition("Tim",highscorposition);

        highscorposition =calculatehighscorposition(900);
        displsyhighscorposition("john",highscorposition);

         highscorposition =calculatehighscorposition(400);
        displsyhighscorposition("bob",highscorposition);

         highscorposition =calculatehighscorposition(50);
        displsyhighscorposition("dj",highscorposition);

         highscorposition =calculatehighscorposition(500);
        displsyhighscorposition("kk",highscorposition);

         highscorposition =calculatehighscorposition(1000);
        displsyhighscorposition("ap",highscorposition);

         highscorposition =calculatehighscorposition(100);
        displsyhighscorposition("ak",highscorposition);

    }
    public static int calculatescor(boolean gameover, int scor , int levelcompleted, int bonus){

        if(gameover)
        {
            int finalscor = scor + (levelcompleted * bonus);
              finalscor  += 2000;
            return finalscor;
        }
        else
        {
            return  -1;
        }
    }

    public static void displsyhighscorposition(String player_name,int highscorposition){

        System.out.println(player_name + " managed to get into  position " +
       highscorposition +" on the high scor table ");
    }
    public static int calculatehighscorposition(int playerscor)
    {
        if (playerscor>=1000)
        {
            return  1;
        }
        else if(playerscor>=500 )
        {
            return 2;
        }
        else if(playerscor>=100 )
        {
            return  3;
        }
        return 4;
            }
}
