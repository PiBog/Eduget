package example.Exsample2.Animals;


/**
 * Class describes a cat.
 * It is able to catch mice and mew.
 * @author Bogdan Pisarenko
 */
public class Cat extends Animal implements Pets{

    /**
     * Constructs a cat initialized name
     * @param name - cat's name
     */
    public Cat(final String name){
        super(name);
    }


    /**
     * Creates a cats's voice
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("Mew %s", this.getName()));;
    }
}
