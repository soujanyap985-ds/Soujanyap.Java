class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Rabbit extends Animal {
    void jump() {
        System.out.println("Rabbit jumps");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();

        System.out.println("Dog:");
        dog.eat();
        dog.bark();

        System.out.println("\nRabbit:");
        rabbit.eat();
        rabbit.jump();
    }
}
