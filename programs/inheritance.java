class Shape{
    String color ;
}
class Triangle extends Shape{
    public void show(){
        System.out.println("this is a triangle");
    }
}
class NewTriangle extends Triangle{
    public void name() {
        System.out.println("new triangle");
    }
}

class Circle extends Shape{
    
}
class Rectangle extends Shape{

}
public class inheritance {
public static void main(String[] args) {
    Triangle ref = new Triangle();
    ref.color="red";
    System.out.println(ref.color);
    ref.show();
    NewTriangle ref2 = new NewTriangle();
    ref2.show();
    ref2.name();
    Circle ref3 = new Circle();
    ref3.color="blue";
    System.out.println(ref3.color);
    Rectangle ref4 = new Rectangle();
    ref4.color="green";
    System.out.println(ref4.color);
}
    
}