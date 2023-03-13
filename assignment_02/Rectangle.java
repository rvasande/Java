
public class Rectangle {
    int lenght, breadth;

    Rectangle(int a, int b) {
        lenght = a;
        breadth = b;
    }
  public int Area(){
    System.out.println("lenght of rectangle is " + lenght);
    System.out.println("breadth of rectangle is " + breadth);
    return lenght * breadth;
  }

  public static void main(String[] args) {
    Rectangle obj1 = new Rectangle(4, 5);
    System.out.println("area of rectangle is " + obj1.Area());
System.out.println();
    Rectangle obj2 = new Rectangle(5, 8);
    System.out.println("area of rectangle is " + obj2.Area());
  }
}