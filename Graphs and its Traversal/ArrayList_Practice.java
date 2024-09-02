import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Practice
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[10];
        ArrayList<Integer> arry=new ArrayList<Integer>();
        System.out.println("Enter the array elements:");
        for(int i=0;i<10;i++)
        {
            arr[i]=scan.nextInt();
            arry.add(arr[i]);
        }
        System.out.println("Printing the Arraylist: ");
        for( int number: arry )
            System.out.print(number+" ");

        Collections.sort(arry);
        System.out.println("Printing the sorted array:");
        for( int number: arry )
            System.out.print(number+" ");
   scan.close();
    }
}