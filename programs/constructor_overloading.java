/**
 * constructor_overloading
 */
public class constructor_overloading {
int a; int b; String c;
constructor_overloading(){
     a =10;
     b =20;
     c = "vassu";
    //  System.out.println(a + " " + b + " " + c);
}
constructor_overloading(int x){
    a=x;
    // System.out.println(a);
}
constructor_overloading(int m , String n){
    a = m;
    c = n;
    System.out.println(a + " " + c);
}

public static void main(String args []) {
    constructor_overloading ref1 = new constructor_overloading();
    System.out.println(ref1.c);
    constructor_overloading ref2 = new constructor_overloading(10);
    System.out.println(ref2.a);
    constructor_overloading ref3 = new constructor_overloading(30 , "hello");
    System.out.println(ref3);
}
}
    