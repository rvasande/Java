import java.util.*;

class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int sum=num * i ;
            System.out.println(sum);
        }
    }
}