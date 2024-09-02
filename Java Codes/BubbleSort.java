import java.util.Scanner;
public class BubbleSort {
    public static void PrintArray(int n1[])  //Printing the Sorted Array
    {
        for(int i=0;i<n1.length;i++)
        {
            System.out.println(n1[i]);
        }
    }
    public static void ArraySort(int n[])   //Sorting the Array
    {
        int i,j;
        for(i=0;i<n.length-1;i++)
        {
            for(j=0;j<n.length-i-1;j++)
            {
                if(n[j]>n[j+1])
                {
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={221,34,54,5434,231,4354,23};
        ArraySort(arr);
        System.out.println("Array in Sorted Order: ");
        PrintArray(arr);
    }
}
