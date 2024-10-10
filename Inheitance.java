// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks");
    }
}

// Further derived class
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling methods from different levels
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Method of Dog class
    }
}
