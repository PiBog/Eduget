package example.Exsample2.Clinic;

import example.Exsample2.Animals.Animal;

import java.util.Collections;
import java.util.List;

/**
 * Class implements clients
 */
public class Client {
    /**
     * Client's name
     */
    private String name;


    /**
     * List of client's pets
     */
    private final List<Animal> animals = Collections.EMPTY_LIST;

    /**
     * Constructs a client initialized name and added one pet
     *
     * @param name   - client's name
     * @param animal - client's pet
     */
    public Client(final String name, final Animal animal) {
        this.name = name;
        this.animals.add(animal);
    }

    // Getter returns client's name
    public String getName() {
        return this.name;
    }

    //Setter sets client's name
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method adds new animal to client's animal list
     * @param animal
     */
    public void addPet(Animal animal) {
        this.animals.add(animal);
    }

    /**
     * Modifies information about client's pet
     * @param oldPet
     * @param newPet
     */
    public void modifyPet(Animal oldPet, Animal newPet) {
        int index = this.animals.indexOf(oldPet);
        this.animals.set(index, newPet);
    }

    /**
     * Method return list of client's pets
     * @return list of animals
     */
    public List<Animal> getPetsList() {
        return animals;
    }

    /**
     * Method returns a pet by nickname
     * @param nickname
     * @return pet with nickname or null if pet absent
     */
    public Animal getPet(String nickname) {
        Animal selectedPet = null;
        for (Animal pet : animals) {
            if (nickname == pet.getName()) selectedPet = pet;
        }
        return selectedPet;
    }

    /**
     * Print list of client's pets
     */
    public void printPetslist() {
        this.animals.forEach(animal -> System.out.print(animal.getName() + ", "));
    }

}
