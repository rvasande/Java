import java.util.*;

class EvenNum{
    public static void main (String args[]){
        Scanner num = new Scanner(System.in);
        int num2 = num.nextInt();
        if(num2 % 2 ==0){
            System.out.println("number is even ");
        }else{
            System.out.println("number is odd");
        }
    }
}