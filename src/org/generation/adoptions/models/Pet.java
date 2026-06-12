package org.generation.adoptions.models;
import org.generation.adoptions.exceptions.invalidData;

public abstract class Pet {
    private String name;
    private int age;
    private String color;

    /**
     * Metodo constructor, es un meotodo especial
     * Que se llama igual que la clase
     * y se activa cuando creamos un objeto, en especifico al usar
     * la palabra reservada New
     * @param name -tipo string
     * @param age - tipo int
     * @param color -tipo string
     * @throws invalidData -tipo excepcion
     */
    public Pet(String name, int age, String color) throws invalidData{
        setName(name);
        setAge(age);
        this.color =  color;
    }

    /**
     * Metodo setter de nombre , si el nombre esta vacio arroja una excepcion
     * @param name -type string
     * @throws invalidData -Exception
     */
    public void setName(String name)throws invalidData{
        //early return, si el nombre esta vacio lanza la excepcion
        if(name == null || name.trim().isEmpty()) throw new invalidData("El nombre no puede estar vacio");
        this.name = name;
    }


    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age)throws invalidData{
        if( age <=0 )throw new invalidData("La edad no puede ser menor o igual a cero");
        this.age = age;
    }
    public String getColor(){
        return color;
    }
    public abstract void makeSound();
    public abstract void showDetails();

    public abstract void adopt();
}