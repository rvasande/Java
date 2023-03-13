public class Program_05 {
    public static void main(String[] args) {
        Triangle ref = new Triangle(3,4,5);
        ref.area();
        ref.perimeter();
       
    }
}
class Triangle{
    int side1;
    int side2;
    int side3;

    Triangle(int a , int b ,int c){
     side1 = a;
     side2 = b;
     side3 = c;
    }
    public void area(){
     System.out.println("area of triangle is " + side1*side2*side3 );
    }
    public void perimeter(){
        int sum = side1 + side2 + side3;
     System.out.println("perimeter of triangle is " + sum );
    }
}