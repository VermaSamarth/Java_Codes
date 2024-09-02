import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c = 0, i, sum;
        System.out.print(a + " " + b);
        sum = 1;
        System.out.println("Sum of 2 fibonacci nunbers: " + sum);

        for (i = 0; i < 25; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(" " + c);
            sum += c;
            System.out.println("Sum of " + (i + 3) + " fibonacci numbers: " + sum);
        }
        System.out.println("Final Sum " + sum);
    }
}
