/**
 * copyConstructor
 */
public class copyConstructor {
public static void main(String args[]) {
    A ref = new A(10);
    // A ref2 = new A(ref2);
    System.out.println(ref.a);
}
    
}

class A{
    int a;
    A(int x ){
        // System.out.println(a);
        a =x ;
    }
}