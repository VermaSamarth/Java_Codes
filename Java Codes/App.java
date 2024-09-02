import java.util.*;
public class App
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc=new Scanner(System.in);
		Arithematic object=new Arithematic();
		int firstInput, secondInput;
		System.out.println("Enter the two numbers:" );
		firstInput=sc.nextInt();
		secondInput=sc.nextInt();
		object.Addition(firstInput,secondInput);
		object.Substraction(firstInput,secondInput);
		object.Multiplication(firstInput,secondInput);
		object.Division(firstInput,secondInput);
		sc.close();
	}
}