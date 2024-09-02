import java.util.Scanner;

public class divide_even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, l, x, y, sum = 0;
        System.out.println("Enter the Number:");
        String num = scan.nextLine();
        l = num.length();
        n = Integer.parseInt(num);
        if (n % 2 == 0) {
            x = n % (int) Math.pow(10, l / 2);
            y = n / (int) Math.pow(10, l / 2);
            sum = (int) Math.pow((x + y), 2);
        }
        System.out.println(sum);
    }
}
