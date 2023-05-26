class Animal {
    public void eat() {
        System.out.println("The animal is eating");
    }
}

interface Pet {
    public void play();
}

class Dog extends Animal implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(this.name + " is playing");
    }

    public void bark() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido");
        myDog.eat();
        myDog.play();
        myDog.bark();
    }

    public void display() {
    }
}
