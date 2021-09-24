package com.company;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Dhananjay",50,"AKM");
        System.out.println(" Initial Health = " +player.getNewpoint());
        player.LoseHealth(52);
    }
}
