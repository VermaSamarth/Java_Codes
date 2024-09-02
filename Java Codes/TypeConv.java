import java.util.Scanner;

public class TypeConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        String s, s1;
        System.out.println("Enter the number:");
        num=sc.nextInt();    //For inputting a number
        System.out.println("Enter a string: ");
        s1=sc.next();    //For inputting just one word
        s=Integer.toString(num);       //Type casting from interger to string
        long l1=Long.parseLong(s);
        System.out.println((90+l1));
        System.out.println("90"+s);
        sc.close();
    }
}
