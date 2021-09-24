package com.company;

public class Player {

    private String name;
    private int newpoint = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health>0 && health<=100) {
            this.newpoint = health;
        }
        this.weapon = weapon;
    }
    public void LoseHealth(int damage)
    {
        this.newpoint = this.newpoint -damage;
        System.out.println(" Remaining Health = " +this.newpoint);
        if (this.newpoint <=0) {
            System.out.println(" Player Kocked out ");
        }
    }

    public int getNewpoint() {
        return newpoint;
    }
}
