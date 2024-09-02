import java.util.Scanner;
import java.util.ArrayList;
public class AdjacencyListWeighted {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int nodes,edges,startNode,endNode,edgeWeight;
        System.out.println("Enter the number of nodes and edges: ");
        nodes=scan.nextInt();
        edges=scan.nextInt();
        
        //Creating list inside the arraylist.
        for(int i=0;i<=edges;i++)
        {
            list.add(new ArrayList<Integer>());
        }

        //Inputting the weight between the two nodes.
        for(int i=1;i<=edges;i++)
        {
            System.out.println("Enter the start node, end node and the edge weight: ");
            startNode=scan.nextInt();
            endNode=scan.nextInt();
            edgeWeight=scan.nextInt();
            list.get(i).add(startNode);
            list.get(i).add(endNode);
            list.get(i).add(edgeWeight);
        }

        //Printing the adjacents of each node with their respective weights
        for(int i=1;i<=nodes;i++)
        {
            System.out.print("Adjacents of Node "+i+": ");
            for(int j=1;j<=edges;j++)
            {
                if(i==(list.get(j).get(0)))
                    System.out.print(list.get(j));
            }
            System.out.println();
        }
        scan.close();
    }
}
