package org.generation.adoptions.models;
import org.generation.adoptions.exceptions.invalidData;

public class Aves extends Pet {

    private double speed; // propiedad exclusiva

    public Aves(String name, int age, String color, double speed)throws invalidData {
        super(name, age, color);
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }


    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " dice pio pio");
    }

    @Override
    public void showDetails() {
        System.out.println("Ave: " + getName());
        System.out.println("Edad: " + getAge());
        System.out.println("Color: " + getColor());
        System.out.println("Velocidad: " + speed + " KM/H");
    }
    @Override
    public void adopt() {
        System.out.println(getName() + " ha sido adoptada.");
    }


}



