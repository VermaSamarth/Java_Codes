import java.util.Scanner;
import java.util.InputMismatchException;

public class exception1 {
    public static void main(String[] args) throws Exception {
        int number1, number2;
        calculator obj = new calculator();
        System.out.println("Enter first number");
        number1 = obj.readInt();
        System.out.println("Enter second number");
        number2 = obj.readInt();
        System.out.println("DIVISION RESULT = " + obj.divide(number1, number2));
        System.out.println("ADDITION RESULT = " + obj.add(number1, number2));
    }
}

class calculator {
    int number1, number2, temp, result;

    public int readInt() {
        Scanner input = new Scanner(System.in);
        try {
            if (!input.hasNextInt())
                throw new InputException("InputException...");
            else
                temp = input.nextInt();
        } catch (InputException e) {
            System.out.println("Input should be an Integer");
        }
        return temp;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        try {
            if (b == 0)
                throw new DBZException("DBZException...");
            else
                return a / b;
        } catch (DBZException e) {
            System.out.println("Divide By Zero exception occurred...");
        }
        return 0;
    }

}

class DBZException extends ArithmeticException {
    public DBZException(String msg) {
        super(msg);
    }
}

class InputException extends InputMismatchException {
    public InputException(String msg) {
        super(msg);
    }
}