//import java.util.*;

public class BKT0017 {
    static int min(int n) {
        int min = n % 10;
        n = n % 10;
        while (n > 0) {
            int num = n % 10;
            n = n / 10;
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static int max(int n) {
        int max = n % 10;
        n = n % 10;
        while (n > 0) {
            int num = n % 10;
            n = n / 10;
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[] = { 131, 677, 436, 12121, 377892, 6151, 727, 851, 564, 11 };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = max(arr[i]);
            } else
                arr[i] = min(arr[i]);

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
