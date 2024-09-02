import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter the number of list element:");
        n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        System.out.println("Enter the List element: ");
        for (int i = 0; i < n; i++) {
            int f = input.nextInt();
            list.add(f);
        }
        System.out.println(list);
        for (int number : list) {
            sum = sum + number;
        }
        System.out.println(sum);
        list.add(5, 10);
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        input.close();
    }
}
