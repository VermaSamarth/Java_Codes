import java.util.Scanner;

public class primeproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c = 0;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    c++;
            }
            if (c == 2) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }

    }
}
