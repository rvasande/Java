import java.util.*;

class demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A first angle of triangle");
        int angle1 = sc.nextInt();
        System.out.println("Enter A second angle of triangle");
        int angle2 = sc.nextInt();
        System.out.println("Enter A third angle of triangle");
        int angle3 = sc.nextInt();

        if(angle1+angle2+angle3==180){
            System.out.println("this triangle is valid");
        }else{
            System.out.println("triangle is invalid");
        }
    }
}
