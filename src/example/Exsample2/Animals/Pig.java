package example.Exsample2.Animals;

/**
 * Class describes a pig
 */
public class Pig extends Animal implements Pets {

    /**
     * Constructs a pig initialized name
     * @param name - pig's name
     */
    public Pig(String name) {
        super(name);
    }

    /**
     * Creates a pig's voice
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("Roof %s", this.getName()));;

    }
}
