package OOPS;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class DogExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Labrador Retriever");
        Dog dog2 = new Dog("Bella", "German Shepherd");

        System.out.println("Original values:");

        System.out.println("Dog 1:");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println();

        System.out.println("Dog 2:");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println();

        // Modifying the attributes using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("Golden Retriever");

        System.out.println("Updated values:");

        System.out.println("Dog 1:");
        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println();

        System.out.println("Dog 2:");
        System.out.println("Name: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
    }
}
