import java.util.Scanner;

public class ReverseCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char c = string.charAt(0);

        if (Character.isAlphabetic(c)) {
            if (Character.isUpperCase(c)) {
                System.out.println(c + " is a capital alphabet!");
            } else {
                System.out.println(c + " is a small alphabet!");
            }
            System.out.println("Reverse case of " + c + " is " + Character.toLowerCase(c));
        } else if (Character.isDigit(c)) {
            System.out.println(c + " is a digit!");
        } else if (Character.isWhitespace(c)) {
            System.out.println(c + " is a whitespace character!");
        } else {
            System.out.println(c + " is not an alphabet, digit or whitespace character!");
        }
    }

}