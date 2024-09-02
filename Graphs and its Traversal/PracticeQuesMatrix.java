import java.util.Scanner;
public class PracticeQuesMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int nodes;
        System.out.println("Enter the number of nodes: ");
        nodes=scan.nextInt();
        int Matrix[][]=new int[nodes+1][nodes+1];
        
        //For node 1, Adjacent nodes are:
        Matrix[1][2]=-1;
        Matrix[1][3]=4;
        
        //For node 2, Adjacent nodes are:
        Matrix[2][3]=3;
        Matrix[2][4]=2;
        Matrix[2][5]=2;
        
        //For node 4, Adjacent nodes are:
        Matrix[4][2]=1;
        Matrix[4][3]=5;

        //For node 5, Adjacent nodes are:
        Matrix[5][4]=-3;

        System.out.println("\tA\tB\tC\tD\tE");
        for(int i=1;i<nodes+1;i++)
        {
            System.out.print((char)(65+i-1)+"\t");
            for(int j=1;j<nodes+1;j++)
            {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
