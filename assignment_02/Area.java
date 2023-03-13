
  
import java.util.*;
public class Area {
  // declare length and breadth
  int length, breadth;
  
  // constructor taking length and breadth as parameters
  public Area(int l, int b) {
      this.length = l; 
      this.breadth = b;
  }
  
  // return area of the rectangle
  public int returnArea() {
      int area = length * breadth;
      return area;
  }
  
  public static void main(String[] args) {
      // get length and breadth from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter length of the rectangle: ");
      int l = sc.nextInt();
      System.out.println("Please enter breadth of the rectangle: ");
      int b = sc.nextInt();
      
      // create an object of Area class
      Area rect = new Area(l, b);
      
      // print the area of rectangle
      System.out.println("The area of the rectangle is: " 
              + rect.returnArea());
  }
}