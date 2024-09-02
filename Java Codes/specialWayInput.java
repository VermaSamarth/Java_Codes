import java.util.Scanner;

public class specialWayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        int c = 0;
        for (int i = 0; i < Math.ceil(n / 2.0); i++) {
            a[i] = ++c;
            if (i < n / 2)
                a[n - i - 1] = ++c;
        }
        System.out.println("Array: ");
        for (int number : a) {
            System.out.print(number + " ");
        }
    }
}
