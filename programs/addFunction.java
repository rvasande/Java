import java.util.*;



class addfunction{

 public static void main(String argsp[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); 
    int b = sc.nextInt(); 
    // add(a,b);
    int result = multiply(a,b);
    System.out.println(result);


 }
// public static int add(int a,int b){
//     int sum = a+ b;
//     System.out.println(sum);
//     return sum;
// }
public static int multiply(int a, int b){
    int mul = a*b;
    return mul;
}
}


