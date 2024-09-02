import java.util.*;

public class xyz5 {
    static boolean palindrome(double n) {
        int p = -1;
        double m = n;
        double num = n;
        double rev = 0;
        while (n > 0) {
            n = n / 10;
            p++;
        }
        while (m > 0) {
            rev += (n % 10) * Math.pow(10, p);
            m = m / 10;
            p--;
        }
        if (rev == num) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double n = 0.0;
        // do {
        //     System.out.println("Enter the palindrome no.:");
        //     n = sc.nextDouble();
        // } while (palindrome(n) == false);
        System.out.println("Enter the number:");
        // n=sc.nextDouble
        System.out.println((int) n + "is a palindrome");
    }
}

