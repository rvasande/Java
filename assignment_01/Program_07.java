import java.util.*;

public class Program_07 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lenght");
        int length = sc.nextInt();
        System.out.println("enter breadth");
        int breadth = sc.nextInt();

        Area obj1 = new Area(length ,breadth);
        obj1.returnArea();
    }
}

class Area {
    int a, b;

    Area(int length , int breadth) {
       this.a  =length;
       this.b  =breadth;
    }

    public void returnArea(){
        System.out.println("area if rectangle is " + a * b);
    }
}
