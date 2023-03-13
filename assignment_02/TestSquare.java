 class Square {
 
    double side;
 
    public Square(double side) {
        this.side = side;
    }
 
    public double area() {
        return side*side;
    }
 
    public double perimeter() {
        return 4*side;
    }
}
 
public class TestSquare {
 
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Area of square = " + s.area());
        System.out.println("Perimeter of square = " + s.perimeter());
    }
}