package ExceptionHandling;

import java.util.Scanner;

public class handle {
    Scanner scan = new Scanner(System.in);

    public int inputNumber() {
        int num;
        num = scan.nextInt();
        return num;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int divide(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception");
            return -1;
        } finally {
            System.out.println("Maths is shit");
        }
    }
}
