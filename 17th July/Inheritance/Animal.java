package Inheritance;

public class Animal {
    public void makeSound() {
        System.out.println("I am an animal");
    }

    static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
            public static void main(String[] args) {
                Animal animal = new Animal();
                animal.makeSound();

                Cat cat = new Cat();
                cat.makeSound();
            }
        }
    }



