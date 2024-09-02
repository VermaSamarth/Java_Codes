import java.util.Scanner;

public class sumArmstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, sum, i, d, arm = 0;
        System.out.println("Enter the numbers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        sum = num1 + num2;
        for (i = sum; i != 0; i = i / 10) {
            d = i % 10;
            arm = arm + (d * d * d);
        }
        System.out.println(arm);
        if (sum == arm)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong.");
    }
}