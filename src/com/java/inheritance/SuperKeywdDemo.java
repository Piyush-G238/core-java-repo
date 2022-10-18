package com.java.inheritance;

class Animal {
    private int height_cms;
    private double weight;
    private String type;

    public Animal() {
        this.height_cms = 150;
        this.weight = 56.75;
        this.type = "Carnivorous";
    }

    public int getHeight_cms() {
        return height_cms;
    }

    public void setHeight_cms(int height_cms) {
        this.height_cms = height_cms;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println(
                "Type of animal : " + type + "\n" +
                        "Height of animal : " + height_cms + "\n" +
                        "Weight of animal : " + weight);
    }
}

class Lion extends Animal {
    private String name;
    private String breed;
    private int age;
    private boolean isCarnivorous;

    public Lion() {
        this.name = "Lion";
        this.breed = "Asiatic Lion";
        this.age = 12;
        this.isCarnivorous = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean isCarnivorous) {
        this.isCarnivorous = isCarnivorous;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(
                "Name of animal : " + this.name + "\n" +
                        "Breed of animal : " + this.breed + "\n" +
                        "Is Carnivorous : " + this.isCarnivorous);
    }
}

public class SuperKeywdDemo {
    public static void main(String[] args) {
        Lion cub = new Lion();
        // System.out.println(cub.getBreed());
        cub.display();
    }
}
