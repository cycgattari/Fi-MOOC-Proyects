
public class Person {

    private String name;
    private Pet pet;

    public Person(String name, String petName, String breed) {
        this.name = name;
        this.pet = new Pet(petName, breed);
    }
    
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet; 
    }

    public Person(String name) {
        this(name, "Toothless", "dragon");
    }

    public Person() {
        this("Lilo", "Stitch", "blue alien");
    }

    @Override
    public String toString() {
        return this.name + ", has a friend called " + pet.getName()   + "(" + pet.getBreed() + ")";
    }

}
