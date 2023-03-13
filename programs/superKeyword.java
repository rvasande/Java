class A{
    int a =10;
    public void show(){
        System.out.println("this is the super class method");
    }
}

class B extends A{
    int a =20;
    public void show(){
        System.out.println("super class variable a is " + super.a);
        super.show();
        System.out.println("this is the subclass method");
    }
    
}
public class superKeyword {
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}
