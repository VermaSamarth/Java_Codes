import java.util.Scanner;
public class AdjacencyMatrixCreation
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("Enter the number of nodes in the graph:");
        num=scan.nextInt();
        int arr[][]=new int[num][num];
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.println("Enter the weight from node "+(char)(65+i)+" to node "+(char)(65+j)+": ");
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        scan.close();
    }
}