
import org.generation.adoptions.interfaces.Adoptable;
import org.generation.adoptions.models.Aves;
import org.generation.adoptions.models.Cat;
import org.generation.adoptions.models.Pet;
import org.generation.adoptions.exceptions.invalidData;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        try{
            pets.add(new Cat("July", 2, "naranja", "Americano pelo corto"));
            pets.add(new Cat("Yampy", 2, "Fiusha", "Americano Mexicano"));
            pets.add(new Cat("Haru",  4, "verde", "Egipcio"));
            pets.add(new Aves("Piolin",  2, "Amarillo", 25));


        }catch (invalidData error){
            System.out.println("Error al crear mascota" + error.getMessage());
        }

        for (Pet pet : pets){
            pet.showDetails();
            pet.makeSound();
            if(pet instanceof Adoptable){
                ((Adoptable)pet).adopt();
            }
            System.out.println();

        }

        pets.get(0).showDetails();
        pets.get(1).showDetails();
        pets.get(3).showDetails();


    }
}