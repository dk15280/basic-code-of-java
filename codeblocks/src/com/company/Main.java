package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameover = true;
        int scor = 800;
        int levelcompleted = 5;
        int bonus = 100;



//
//        if(scor < 5000 && scor >1000) {
//            System.out.println("your scor less than 5000 but greater than 1000");
//        }
//
//        else if(scor<1000)
//        {
//            System.out.println("your scor less than 1000");
//        }
//        else
//        {
//            System.out.println("get here");
//        }


      if(gameover = true)
        {
            int finalscor = scor + (levelcompleted * bonus);
          //  finalscor  += 1000;
            System.out.println("your final scor was =" + finalscor);
        }

        if(gameover = true)
        {
             scor = 10000;
             levelcompleted = 8;
             bonus = 200;

            int secondscor = scor + (levelcompleted * bonus);
            System.out.println("your second scor = " + secondscor);
        }

    }
}
