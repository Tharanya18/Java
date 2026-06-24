package Day1;

class Animal {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog barks");
    }
}

public class Exp19 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.bark();
    }
}