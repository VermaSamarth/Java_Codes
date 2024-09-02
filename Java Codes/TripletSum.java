import java.util.Scanner;

public class TripletSum {
    public static void tripletSum(int ar[], int x) {
        String a[] = new String[ar.length];
        int c = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                for (int k = j; k < ar.length; k++) {
                    if (i != j && j != k && k != i) {
                        if ((ar[i] + ar[j] + ar[k]) == x) {
                            System.out.println(ar[i] + "" + ar[j] + "" + ar[k]);
                            c++;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int n, x;
        System.out.println("Enter the size of the array: ");
        n = scanInput.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = scanInput.nextInt();
        System.out.println("Enter the sum value:");
        x = scanInput.nextInt();
        tripletSum(arr, x);

    }
}
