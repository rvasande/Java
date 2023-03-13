interface p1{
    double p1 =3.14;
}

abstract class shape{
    double radius=10.90087;
}
class Area extends shape implements p1{
    public double area(){
        return p1*radius;
    }
}
public class interfaceExample {
   
    public static void main(String[] args) {
        Area ref = new Area();
        System.out.println(ref.area());
    }
}
