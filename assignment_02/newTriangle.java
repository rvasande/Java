
public class newTriangle {
    int side1, side2, side3;

    newTriangle(int a, int b, int c) {
        side1 = a;
        side2 = b;
        side3 = c;
    }

public int Area(){
    return side1 * side2 * side3;
}
public int perimeter(){
    return side1 + side2 + side3;
}
public static void main(String[] args) {
    newTriangle obj = new newTriangle(3, 4, 5);
    System.out.println("area of triangle is " + obj.Area());
    System.out.println("perimeter of triangle is " + obj.perimeter());
}
}