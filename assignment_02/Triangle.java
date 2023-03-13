
public class Triangle {
int side1 = 3 , side2 = 4 , side3 = 5;

public int Area(){
    return side1*side2*side3;
}
public int perimeter(){
    return side1 + side2 + side3;
}

public static void main(String[] args) {
    Triangle obj = new Triangle();
    System.out.println("area of triangle is " + obj.Area());
    System.out.println("perimeter of triangle is " + obj.perimeter());
}
}