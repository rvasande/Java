
/**
 * program_01
 */

import java.util.*;

public class Program_01 {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter length");
    int l = sc.nextInt();
    System.out.println("enter breadth");
    int b = sc.nextInt();
    Area ref = new Area();
    ref.setDim(l,b);
    System.out.println("area of rectangle " + ref.getArea());
 }
}

class Area {
    int lenght;
    int breadth;

    public void setDim(int l, int b) {
        lenght = l;
        breadth = b;
    }

    public int getArea() {
        return lenght * breadth;
    }
}