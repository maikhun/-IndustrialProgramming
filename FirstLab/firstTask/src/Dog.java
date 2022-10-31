import Interfaces.*;

public class Dog extends Animal implements Biteable, Shoutable, Runable, Jumpable {
    protected String animalClass = "Dog";

    public Dog(String name) {
        super(name);
    }

    @Override
    public void printName() {
        super.printName();
        System.out.println("Animal class: " + animalClass);
    }

    @Override
    public void bite() {
        System.out.println(animalClass + " " + name + " bite the human");
    }

    @Override
    public void jump() {
        System.out.println(animalClass + " " + name + " jump throught the window");
    }

    @Override
    public void run() {
        System.out.println(animalClass + " " + name + " run to the shop for my chips");
    }

    @Override
    public void makeSound() {
        System.out.println(animalClass + " " + name + " screaming");
    }

    @Override
    public boolean equals(Object obj) {
        Dog dog = (Dog) obj;
        if (this.name == dog.getName()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + animalClass;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31;
    }
}
