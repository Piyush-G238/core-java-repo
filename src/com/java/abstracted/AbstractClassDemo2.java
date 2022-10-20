package com.java.abstracted;

abstract class Player{
    String name;
    int age;
    String DOB;
    public Player(String name, int age, String dOB) {
        this.name = name;
        this.age = age;
        DOB = dOB;
    }
    // this is not allowed to use final keyword with abstract methods
    // final abstract public void getDetails();
    abstract public void getDetails();
}

class CricketPlayer extends Player{
    String position;
    double battingAvg;
    double bowlingAvg;
    public CricketPlayer(String name, int age, String dOB,double...ds) {
        super(name, age, dOB);
        this.battingAvg = ds[0];
        this.bowlingAvg = ds[1];
    }

    @Override
    public void getDetails() {
        System.out.println(
            "Name :" + super.name + "\n" +
            "Sports : cricket" + "\n" +
            "Position : "
        );
    }

}

class FootballPlayer extends Player{

    public FootballPlayer(String name, int age, String dOB) {
        super(name, age, dOB);
    }

    @Override
    public void getDetails() {
        
    }

}
public class AbstractClassDemo2 {
    
}
