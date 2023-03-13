/**
 * accessModifiers
 */
public class accessModifiers {

    public static void main(String args[]){
    A ref = new A();
    // System.out.println(ref);
    ref.show();
    }
    
}

class A{
 private int a =10;
 public void show(){
    System.out.println(a);
 }

}