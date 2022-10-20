package com.java.inheritance;

class Cuboid implements Cloneable{
    public double length;
    public double height;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cuboid rec1 = new Cuboid();
        Cuboid rec2 = rec1;
        
        rec2.length = 55.95;

        Cuboid rec3 = (Cuboid) rec1.clone();
        
        rec3.length = 98.35;

        System.out.println("Length of rec1 : " + rec1.length);
        System.out.println("Length of rec2 : " + rec2.length);
        System.out.println("Length of rec3 : " + rec3.length);
        System.out.println("Length of rec1 : " + rec1.length);
    }
}