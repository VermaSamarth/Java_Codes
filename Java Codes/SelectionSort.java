import java.util.Scanner;
public class SelectionSort {
    public static void ArraySort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=a[i];
            int k=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    k=j;
                }
            }
            a[k]=a[i];
            a[i]=min;
        }
    }
    public static void PrintArray(int a[])
    {
        System.out.println("Array in the sorted order: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={4,6,1,3,9,5};
        ArraySort(arr);
        PrintArray(arr);
    }
    
}
