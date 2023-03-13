import java.util.*;

class Condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("number is equal");
        }
        if (a > b) {
            System.out.println("a is greater than b");
        }
        if (a < b) {
            System.out.println("a is smaller than b");
        } else {
            // System.out.println("invalid");
        }

    }
}