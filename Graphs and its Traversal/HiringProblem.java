import java.util.Scanner;
import java.util.Random;
public class HiringProblem {
    public static int HireAssistant(int numm)
    {
        Scanner sc=new Scanner(System.in);
        int correctAnswer,currentAnswer=-1,totalCost=0;
        for(int j=0;j<numm;j++)
        {
            System.out.println("Enter the correct answers of Candidate "+(j+1)+": ");
            correctAnswer=sc.nextInt();
            if(correctAnswer>currentAnswer && correctAnswer<=20)
            {
                currentAnswer=correctAnswer;
                totalCost+=150000;
                System.out.println("Candidate "+(j+1)+" is hired.");
            }
            else
            {
                System.out.println("Candidate "+(j+1)+" is not hired.");
            }
        }
        sc.close();
        return totalCost;
     
    }
    public static void main(String[] args) {
        Random rand=new Random();
        int candidate=12,sum=0,avg=0;
        for(int i=0;i<50;i++)
        {
            //candidate=rand.nextInt(25-15)+15;
            System.out.println("Number of candidates in round "+(i+1)+": "+candidate);
            sum=HireAssistant(candidate);
            avg=avg+sum;
        }
        avg=avg/50;
    }
}
