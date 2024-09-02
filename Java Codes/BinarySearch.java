import java.util.Scanner;
public class BinarySearch {
    public static void main(String [] aa) {
        Scanner sc=new Scanner(System.in);
        int n, mid, high, low,se,i;
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        System.out.println("Enter the search element: ");
        se=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        low=0;
        high=n-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(se==a[mid])
            {
                System.out.println("Search Element is at position: "+(mid+1));
                break;
            }
            else if(se<a[mid])
            high=mid-1;
            else
            low=mid+1;
        }
        if(low>high)
        System.out.println("Search Element not found.");
        sc.close();
    }
    
}
