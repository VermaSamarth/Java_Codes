//Bellman Ford Algorithm
//Source is randomly generated using Random package.
//

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class BellmanFord
{
    public static int[] BellmanFord(int nodes, ArrayList<ArrayList<Integer>> list, int source)
    {
        int dist[]=new int[nodes];
        for(int i=0;i<nodes;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[source]=0;
        for(int i=0;i<nodes-1;i++)
        {
            for(ArrayList<Integer> num:list)
            {
                int u=num.get(0);
                int v=num.get(1);
                int wt=num.get(2);
                if(dist[u]!=Integer.MAX_VALUE && (dist[u]+wt<dist[v]))
                    dist[v]=dist[u]+wt;
            }
        }
        return dist;
    }
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
        System.out.println("Node1\tNode2\tWeight:");
            for(int j=0;j<list.get(i).size();j++)
            {
                System.out.print(list.get(i).get(j)+" \t ");
            }
            System.out.println();
       }

       Random rand=new Random();
       int source=rand.nextInt(nodes);
       System.out.println(source);

       int arr[]=BellmanFord(nodes,list,source);
       for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
       scan.close();
    }
}