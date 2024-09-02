import java.util.Scanner;
import java.util.Random;
public class RandomisedQuickSort {

    public static void randomPivot(int arr[],int low,int high)
    {
        Random rand=new Random();
        int num=rand.nextInt(high-low)+low;
        int temp=arr[high-1];
        arr[high-1]=arr[num];
        arr[num]=temp;
    }

    public static int partition(int arr[],int low, int high)
    {
        randomPivot(arr,low,high);
        int temp,pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp; 

        return i+1;
    }

    public static void quickSort(int arr[],int low, int high)
    {
        if(low<high)
        {
            int part=partition(arr,low,high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }

    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size;
        System.out.println("Enter the array size: ");
        size=scan.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();
        quickSort(arr,0,size-1);
        System.out.println("Sorted Array: ");
        printArray(arr);
        scan.close();
    }
}
