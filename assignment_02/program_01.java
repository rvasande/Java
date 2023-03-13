import java.util.*;
public class program_01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter lenght");
    int x = sc.nextInt();
    System.out.println("enter breadth");
    int y = sc.nextInt();

    Area obj = new Area();
    obj.setDim(x, y);
    System.out.println("area of rectangle is " + obj.getArea());
}
    
}

class Area{
    int lenght , breadth;
    public void setDim(int x ,int y){
           lenght = x;
           breadth = y;
    }

    public int getArea(){
        return lenght * breadth;
    }
}