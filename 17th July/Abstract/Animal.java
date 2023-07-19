package Abstract;

public abstract class Animal {
    abstract void sound();
}

 class Lion extends Animal {

    @Override
    void sound() {
        System.out.println("Roar");
    }
}

class Tiger extends Animal {

    @Override
    void sound() {
        System.out.println("Grr");
    }
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();

        Tiger tiger = new Tiger();
        tiger.sound();
    }
}
