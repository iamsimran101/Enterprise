//interface Animal.java
public interface Animal {
    void speak();
}
//concrete classes implementing the Animal interface 
public class Dog implements Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}
// Factory class to create Animal objects
public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}
// Main class to demonstrate the Factory Pattern
public class Main {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("dog");
        Animal animal2 = AnimalFactory.getAnimal("cat");

        if (animal1 != null) animal1.speak();  // Output: Woof!
        if (animal2 != null) animal2.speak();  // Output: Meow!
    }
}

