public class App2 {
    public static void main(String... a) {
        int firstNumber, secondNumber;
        Arithematic object = new Arithematic();
        firstNumber = Integer.parseInt(a[0]);
        secondNumber = Integer.parseInt(a[1]);
        object.Addition(firstNumber, secondNumber);
    }

}
