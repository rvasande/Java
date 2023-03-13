abstract class shape {
    abstract int area();
}

class rect extends shape {
    int length = 10, breadth = 20;

    @Override
    int area() {
        // TODO Auto-generated method stub
        return length*breadth; 
    }
}

class triangle extends shape{
    int side1=2 , side2=4;

    @Override
    int area() {
        // TODO Auto-generated method stub
        return side1*side2;
    }
    
} 

public class newAbstract {
public static void main(String[] args) {
    
    rect obj1 = new rect();
    triangle obj2 =new triangle();
    System.out.println(obj1.area());;
    System.out.println(obj2.area());;
}
}
