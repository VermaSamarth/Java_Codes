import java.io.Console;

public class console {
    public static void main(String[] args) {
        Console consoleInput = System.console();
        int firstNumber, secondNumber;
        Arithematic object = new Arithematic();
        System.out.println("Enter two numbers:");
        firstNumber = Integer.parseInt(consoleInput.readLine());
        secondNumber = Integer.parseInt(consoleInput.readLine());
        System.out.println("Sum: " + object.Addition(firstNumber, secondNumber));
    }

}
