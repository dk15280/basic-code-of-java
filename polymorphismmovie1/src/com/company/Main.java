package com.company;


class movie {
    public String name;

    public movie(String name) {
        this.name = name;
    }
    public String plot()
    {
        return "No plots are there";
    }

    public String getName() {
        return name;
    }
}
class jaws extends movie
{
   public jaws()
   {
       super("jaws");
   }
   public String plot()
   {
       return "A sark eats lots of people";
   }
}
class independenceday extends movie
{
    public independenceday()
    {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Allians attempt to takeover the earth ";
    }
}
class mazerunner extends movie{
    public mazerunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "A kid try and escape from maze";
    }
}
class starwar extends movie{
    public starwar(){
        super("Star War");
    }

    @Override
    public String plot() {
        return "An imperial forces try to take over the universe";
    }
}
class forgatable extends movie{
    public forgatable(){
        super("Forgetable");
    }
}
public class Main {

    public static void main(String[] args) {

        for (int i =1;i<11;i++)
        {
            movie m = randomMovie();
            System.out.println(" Movie# "+i+ ":" +m.getName() +"/n"+
                                " Plot :" + m.plot() + "\n");
        }
    }
    public static movie randomMovie()
    {
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println(" Random Number generated are :" +randomNumber);
        switch (randomNumber)
        {
            case 1:
            {
                return new jaws();
            }
            case 2:
            {
                return new independenceday();
            }
            case 3:
            {
                return new mazerunner();
            }
            case 4:
            {
                return new starwar();
            }
            case 5:
            {
                return new forgatable();
            }


        }
        return null;
    }
}
