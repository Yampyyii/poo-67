
import org.generation.adoptions.models.Cat;

public class Main {
    public static void main(String[] args) {
        Cat july = new Cat("July", 2, "naranja", "naranja");
        Cat haru = new Cat("Haru",  4, "color", "rojo");
        july.showDetails();
        july.makeSound();
        july.adopt();
        july.adopt("Yampy");
        july.adopt(4);
        july.makeSound(4);
        july.showDetails("Feliz");

        haru.showDetails();
        haru.makeSound();
        haru.adopt();
        haru.adopt("Katia");
        haru.adopt(3);
        haru.makeSound(5);
        haru.showDetails("Alegre");
    }
}