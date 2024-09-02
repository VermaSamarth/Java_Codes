import java.util.Scanner;

public class InsertionSort {
    public static void ArraySort(int a[]) {
        for (int j = 2; j < a.length; j++) {
            int element = a[j];
            int i = j - 1;
            while (i > 0 && element < a[i]) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = element;
        }
    }

    public static void PrintArray(int a[]) {
        System.out.println("Array in the Sorted Order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 8, 6, 1, 5, 9, 5, 4, 7,3 };
        ArraySort(arr);
        PrintArray(arr);
    }

}
