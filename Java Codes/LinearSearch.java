import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, se, i;
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the search element: ");
        se = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (se == a[i]) {
                System.out.println("Number at: " + (i + 1));
                break;
            }
        }
        if (i == n)
            System.out.println("Not found");
        sc.close();
    }

}



