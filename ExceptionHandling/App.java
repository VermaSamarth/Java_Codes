package ExceptionHandling;

public class App {
    public static void main(String[] args) {
        handle object = new handle();
        System.out.println("Enter the first number: ");
        int firstNumber = object.inputNumber();
        System.out.println("Enter the first number: ");
        int secondNumber = object.inputNumber();
        System.out.println(object.add(firstNumber, secondNumber));
        System.out.println(object.divide(firstNumber, secondNumber));
    
    }
}
