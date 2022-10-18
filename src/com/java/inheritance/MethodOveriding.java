package com.java.inheritance;

class Shape {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double shapeArea() {
        return this.length * this.length;
    }
}

class Circle extends Shape {
    private double radius;

    public void setRadius(double length) {
        this.radius = length;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double shapeArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double shapeArea() {
        return this.getLength() * this.getBreadth();
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(10.66);
        double area = circle1.shapeArea();
        System.out.println("The area of circle is : " + area);
    }
}
