import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scan.nextDouble();
        System.out.println("Enter the positive integer n: ");
        int n = scan.nextInt();
        double result = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            result += Math.pow(-1, i + 1) * Math.pow(x, 2 * i - 1) / (factorial *= i * 2);
        }
        System.out.println("Result: "+result);
    }
}