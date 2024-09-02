import java.util.ArrayList;
import java.util.Scanner;
public class AdjacencyListCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        int num;
        System.out.println("Enter the number of nodes: ");
        num=scan.nextInt();
        for(int i=0;i<num+1;i++)
            list.add(new ArrayList<Integer>());
        
         /* 
         Generalised Version of the Adjacency List
         * list.get(u).add(v);
         * list.get(v).add(u);
         */
        

        //Adjacency nodes of 1
        list.get(1).add(2);
        list.get(1).add(4);
        list.get(1).add(5);
        
        //Adjacency nodes of 2
        list.get(2).add(1);
        list.get(2).add(3);

        //Adjacency nodes of 3
        list.get(3).add(2);
        list.get(3).add(5);

        //Adjacency nodes of 4
        list.get(4).add(1);
        list.get(4).add(5);

        //Adjacenncy nodes of 5
        list.get(5).add(1);
        list.get(5).add(3);
        list.get(5).add(4);
        scan.close();

       for(int i=1;i<num+1;i++)
       {
        System.out.println("Adjacency Elements of Node "+i+":");
        //System.out.println("Adjacency Elements of Node "+(char)(65+i-1)+":");
            for(int j=0;j<list.get(i).size();j++)
            {
                System.out.print(list.get(i).get(j)+" ");
                //System.out.print((char)(65+list.get(i).get(j)-1)+" ");
            }
            System.out.println();
       }
    }
}
