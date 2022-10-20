package com.java.interfaced;

interface Vehicle{
    double mileage = 55.75;

    public void increaseSpeed(double s);

    default void decreaseSpeed(double s){
        s -= 5;
        System.out.println("speed slowed");
    }

    public double getMileage();
}

class Car implements Vehicle{
    String name;
    double speed;
    
    @Override
    public void increaseSpeed(double s) {
        this.speed +=s;
    }

    public void decreaseSpeed(double s) {
        this.speed -= s;
    }

    @Override
    public double getMileage() {
        return Vehicle.mileage;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car hondaCity = new Car();
        hondaCity.name="Honda City";
        hondaCity.speed=70.88;
        hondaCity.increaseSpeed(12.66);
        hondaCity.decreaseSpeed(12);
        double mileage = hondaCity.getMileage();
        System.out.println("Mileage of car : "+mileage);
    }
}
