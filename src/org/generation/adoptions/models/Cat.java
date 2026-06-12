package org.generation.adoptions.models;


import org.generation.adoptions.exceptions.invalidData;
import org.generation.adoptions.interfaces.Adoptable;

public class Cat extends Pet implements Adoptable {

    private String breed;

    /**
     * para signar valor a las propiedades eredadas(name, age, color)
     * usamos el metodo super(); el cual va a fijar la propiedsades eredadas de
     * la clase super
     * @param name
     * @param age
     * @param color
     * @param breed
     * @throws invalidData
     */
    public Cat(String name, int age, String color, String breed)throws invalidData {
        super(name, age, color);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("😺 "+ getName() + " hace miau!!");
    }
    public void makeSound(int maullidos){
        System.out.println("El gato: "+ getName() + " hace " + maullidos + " maullidos cuando esta feliz");
    }

    @Override
    public void showDetails() {
        System.out.println(
                "Nombre: " + getName() + "\n"
                        + "Edad: " + getAge() + "\n"
                        + "Color: " + getColor() + "\n"
                        + "y de raza: " + getBreed()
        );
    }
    public void showDetails(String felling){
        System.out.println("El gato se siente: " + felling + " al verte");
    }

    @Override
    public void adopt() {
        System.out.println("Felicidades " + getName() + " Fue adoptado");
    }

    /**
     * Sobrecarga de metodos, method overloading
     * Es una tecnoca de programacion orienteda a objetos
     * Donde podemos tener varios metodos con el mismo nombr epero diferente cantidad
     * y tipo de parametros
     * para que dependiendo del parametro actue diferente
     * Esto ocurre en tiempo de compilacion
     */

    public void adopt(String ownerName){
        System.out.println("Felicidades " + getName() + " Fue adoptado por " + ownerName);
    }

    public void adopt(int memberNumber){
        System.out.println("Felicidades " + getName() + " Fue adoptado por una familia de " + memberNumber);
    }

}