package com.java.abstracted;

abstract class Geometry {
    abstract double curvedSurfaceArea();

    abstract double volume();
}

class Cube extends Geometry {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double curvedSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double volume() {
        return Math.pow(side, 3);
    }

}

class Sphere extends Geometry {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double curvedSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double volume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Geometry cube = new Cube(19.50);
        double area = cube.curvedSurfaceArea();
        System.out.println(area);
        double volume = cube.volume();
        System.out.println(volume);
    }
}
