//Code will only work for the non-weighted graphs.
//It can tell adjacent nodes.
//Works for both directed as well as undirected.


import java.util.Scanner;
import java.util.ArrayList;
public class AdjacencyListDirected {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int nodes;
        System.out.println("Enter the number:");
        nodes=scan.nextInt();
        for(int i=0;i<=nodes;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        
        //For node 1, adjacent nodes are:
        list.get(1).add(2);
        list.get(1).add(3);

        //For node 2, adjacent nodes are:
        list.get(2).add(3);
        list.get(2).add(4);
        list.get(2).add(5);

        //For node 3, adjacent nodes are there.

        //For node 4, adjacent nodes are:
        list.get(4).add(3);

        //For node 5, adjacent nodes are:
        list.get(5).add(4); 
        
        for(int i=1;i<nodes+1;i++)
        {
            System.out.print("Adjacent Nodes of Node "+i+": ");
            for(int j=0;j<list.get(i).size();j++)
            {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
