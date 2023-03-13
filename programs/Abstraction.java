abstract class Animal{
abstract void walk();
Animal(){
    System.out.println("Animal class constructor called");
}
public void eat(){
    System.out.println("eating !!");
}
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse class constructor called");
    }
    public void walk(){
        System.out.println("horse walk on 4 legs");
    }
}
class Dog extends Animal{
    public void walk(){
        System.out.println("dog wlk on 4 legs");
    }
}
class Lion extends Animal{
    public void walk(){
        System.out.println("lion wlk on 4 legs");
    }
}
public class Abstraction {

    public static void main(String[] args) {
        Horse horse  = new Horse();
        // Animal animal = new Animal();
        Dog dog  = new Dog();
        horse.eat();
        horse.walk();
        dog.walk();
    }
}