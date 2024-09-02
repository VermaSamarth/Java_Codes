import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BR {
    public static void main(String[] args) throws Exception {
        Arithematic object=new Arithematic();
        BufferedReader bufferInput = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber, secondNumber;
        System.out.println("Enter the two number: ");
        firstNumber = Integer.parseInt(bufferInput.readLine());
        secondNumber = Integer.parseInt(bufferInput.readLine());
        System.out.println(object.Addition(firstNumber, secondNumber));
    }
}
