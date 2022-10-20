package com.java.interfaced;

interface FlyingObject{
    int no_of_seats = 800;
    public void setAltitude(double h);

    public void increaseSpeed(double s);

    public void setRoute(String s1, String s2);
}

class AeroPlane implements FlyingObject, Vehicle{
    String typeOfFuel;
    double height_m;
    String start_place;
    String dest_place;
    double speed;

    @Override
    public void increaseSpeed(double s) {
        this.speed += s;
    }

    @Override
    public double getMileage() {
        return Vehicle.mileage;
    }

    @Override
    public void setAltitude(double h) {
        this.height_m = h;
    }

    @Override
    public void setRoute(String s1, String s2) {
        this.start_place = s1;
        this.dest_place = s2;
    }

}
public class InterfaceDemo2 {
    public static void main(String[] args) {
        AeroPlane boeing = new AeroPlane();
        boeing.speed = 245.55;
        boeing.height_m = 115;
        boeing.setAltitude(100.20);
    }
}
