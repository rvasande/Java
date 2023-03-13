public class Program_04 {
    public static void main(String[] args) {
        Triangle ref = new Triangle();
        ref.area();
        ref.perimeter();
    }
}
class Triangle {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public void area(){
        System.out.println(side1*side2*side2);   
    }
    public void perimeter(){
        System.out.println(side1+side2+side2);   
    }
}