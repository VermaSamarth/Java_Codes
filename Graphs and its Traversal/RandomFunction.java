import java.util.Random;

//import java.util.Scanner;
public class RandomFunction {
    public static void main(String[] args) {
        Random rand=new Random();
        int ans=rand.nextInt(5)+1;
        System.out.println(ans);
    }    
}
