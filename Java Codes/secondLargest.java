import java.util.ArrayList;
import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        System.out.println("enter the list elements:");
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            list.add(j);
        }
        Collections.sort(list);
        System.out.println(list.get(n - 2));
    }
}
