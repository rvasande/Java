public class Program_06 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(4,5);
        Rectangle obj2 = new Rectangle(5,8);

        System.out.println("area of first rectangle is " + obj1.area());
        System.out.println("area of second rectangle is " + obj2.area());
       
    }
}

class Rectangle {
    double length, breadth;

    Rectangle(double a, double b) {
        length = a;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }

}