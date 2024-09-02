
/*
 * This is my first my application to test the application logic and business logic for a ArrayList program.
 * @author     :    Samarth Verma
 * @version    :    01
 * @since      :    09 August 2022 
 */
import java.util.ArrayList;
import java.util.*;

public class practice01 {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        Employee object = new Employee();
        int n;
        System.out.println("Enter the number of elements in list: ");
        n = scanInput.nextInt();
        ArrayList<Double> list = new ArrayList<Double>(n);
        ArrayList<String> names = new ArrayList<String>(n);
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            double in = scanInput.nextDouble();
            list.add(in);
        }
        scanInput.nextLine();
        for (int i = 0; i < n; i++) {

            String s = scanInput.nextLine();
            names.add(s);
        }
        System.out.println(names);
        System.out.println(list);
        System.out.println(object.taxing(list));
    }
}
