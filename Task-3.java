import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();

            int a = 0;
            int b = 1;
            int c = a + b;

            System.out.print(a + " " + b + " ");

            while (c < input) {
                System.out.print(c + " ");
                a = b;
                b = c;
                c = a + b;
            }
        }
    }
}
