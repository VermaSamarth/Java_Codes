import java.util.*;

public class sine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fact, k = -1;
        double x, sum = 0.0, z;
        System.out.println("Enter the value of x and n: ");
        x = sc.nextDouble();
        n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            fact = 1;
            k = k * (-1);
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            z = (k * (Math.pow(x, i)) / (double)fact);
            sum = sum + z;
        }
        System.out.println(sum);
    }
}
