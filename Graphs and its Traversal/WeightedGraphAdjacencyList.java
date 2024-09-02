import java.util.ArrayList;
import java.util.Scanner;
public class WeightedGraphAdjacencyList
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int nodes,edges,x,y,z;
        System.out.println("Enter the number of nodes and edges respectively: ");
        nodes=scan.nextInt();
        edges=scan.nextInt();
        for(int i=0;i<edges;i++)
            list.add(new ArrayList<Integer>());
        
        for(int i=0;i<edges;i++)
        {
            System.out.println("Enter the nodes and the weight of the edge respectively: ");
            x=scan.nextInt();
            y=scan.nextInt();
            z=scan.nextInt();
            list.get(i).add(x);
            list.get(i).add(y);
            list.get(i).add(z);
        }

        for(int i=0;i<edges;i++)
        {
            System.out.println("First Node \t Second Node \t Weight of the edge:");
                for(int j=0;j<list.get(i).size();j++)
                {
                    System.out.print(list.get(i).get(j)+"\t");
                }    
                System.out.println();
        }    
        scan.close();
    }
}