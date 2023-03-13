import java.util.*;

public class Avarage {
// int a , b ,c ;

public int display(int a , int b , int c){
    int out = (a + b + c) /3;
    return out;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num1");
    int a = sc.nextInt();
    System.out.println("enter num2");
    int b = sc.nextInt();
    System.out.println("enter num3");
    int c = sc.nextInt();
    Avarage obj = new Avarage();
    System.out.println("avarage of three number is " + obj.display(a, b, c));

}
    
}