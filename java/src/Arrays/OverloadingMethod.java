package Arrays;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
    void run(){
        System.out.println("Dog Running");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
    void run(){
        System.out.println("my DOg Running");
    }
}


public class OverloadingMethod {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
        dog.run();

    }
}
