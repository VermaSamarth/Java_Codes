import java.util.Scanner;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanInput=new Scanner(System.in);
        Employee object=new Employee();
        int inp,n;
        System.out.println("Enter the size of the arraylist: ");
        n=scanInput.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            inp=scanInput.nextInt();
            list.add(inp);
        }
        Collections.sort(list);
        scanInput.close();

    }
}
