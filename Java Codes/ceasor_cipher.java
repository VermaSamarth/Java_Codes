import java.util.Scanner;

public class ceasor_cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, j, x, sum = 0, c=0;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        for(j=num;j!=0;j/=10)
        c++;
        System.out.println("Enter the value of I : ");
        i = sc.nextInt();
        for (j = 0; j < c; j++) {
            x = num % 10;
            num = num / 10;
            x = x + i;
            if (x > 9) {
                x = x - 10;
            }
            sum = (int) Math.pow(10, j) * x + sum;
        }
        System.out.println(sum);
    }
}
