import java.util.Scanner;

public class unique {
    public static void unique(int a[]) {
        int i, j, c;
        for (i = 0; i < a.length; i++) {
            c = 0;
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    c++;
                }
            }
            if (c == 1)
                System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array: ");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:  ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        unique(arr);
    }

}
