public class prime_array {
    public static void main(String[] args) {
        int arr[] = { 131, 677, 436, 12121, 377892, 6151, 727, 851, 564, 11 };
        int count, i, j;
        System.out.println("Prime numbers are: ");
        for (i = 0; i < arr.length; i++) {
            count = 0;
            for (j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 0)
                System.out.println(arr[i]);
        }
    }
}

