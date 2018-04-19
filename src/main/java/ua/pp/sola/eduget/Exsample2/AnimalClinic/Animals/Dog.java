package example.Exsample2.Animals;

public class Dog extends Animal implements Pets {
    /**
     * Constructs a animal initialized name
     *
     * @param name - animal's name
     */
    public Dog(final String name) {
        super(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("Woof %s", this.getName()));;
    }
}
