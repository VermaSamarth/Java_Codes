import javax.sql.rowset.spi.SyncResolver;

import java.util.Scanner;
public class practice {
     public static void printArray(int n[])
    {
        for(int i=0;i<5;i++)
        System.out.println(n[i]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,6,4,7,4};
        printArray(arr);
    }

    
}
