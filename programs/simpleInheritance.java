/**
 * simpleInheritance
 */

 class colors {
    String color;
}

class Car extends colors{
    public void display(){
        System.out.println("car is running on 4 wheels");
    }
}

class Truck extends colors{
    public void display(){
        System.out.println("color of truck is " + color);
    }
}

public class simpleInheritance {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.color="red";
        System.out.println(obj.color);
        Truck obj1 = new Truck();
        obj1.color = "green";
        obj1.display();
    }
}