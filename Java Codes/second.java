
/*It is program to find the basic arithmatic calculations of the two numbers.
 * Name: Samarth Verma
 * Reg No.: 21BCT0070
 * 
 * Input two numbers in n1 and n2.
 * Print the sum, difference, quotient and product of the two numbers.
 */
import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Sum: " + (n1 + n2));
        System.out.println("Difference: " + (n1 - n2));
        System.out.println("Product: " + (n1 * n2));
        System.out.println("Quotient: " + ((double) (n1) / n2));
        sc.close();
    }

}
