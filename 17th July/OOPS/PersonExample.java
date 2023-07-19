package OOPS;

public class PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person("Sai", 25);
        Person person2 = new Person("Roshan", 30);

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println();

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}
