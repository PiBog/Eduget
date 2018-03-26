package example.Exsample2.Animals;

/**
 * Base class for animals
 * @author Bogdan Pisarenko
 */
public class Animal {

    /**
     * Contains animal's name
     */
    private final String name;

    /**
     * Animal's health
     */
    private boolean health = false;

    /**
     * Gets animal's name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Constructs a animal initialized name
     * @param name - animal's name
     */
    public Animal(final String name){
        this.name = name;
    }


    /**
     * Treat a animal
     */
    private void healing() {
        this.health = true;
    }

    /**
     * Checks if animal is healthy
     */
    private boolean isHealthy() {
        return this.health;
    }
}
