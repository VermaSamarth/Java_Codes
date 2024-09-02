import java.util.Scanner;

public class StringMismatch {

    public static int Mismatch(char ch1[], char ch2[]) {
        int i,n=0;
        
        for (i = 0; i < ch1.length; i++) 
        {
            if (ch1[i]!=ch2[i]) 
            {
                n=i;
                break;
            }
        }
        if(n == 0 && ch1[0]==ch2[0])
        {
            n=i;
        }
        if(n<ch1.length)
        return n;
        else
        return n+1;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.println("Enter the the two String:");
        str1 = sc.next();
        str2 = sc.next();
        char chr1[]= str1.toCharArray();
        char chr2[]= str2.toCharArray();
        int num = Mismatch(chr1, chr2);
        if(num<chr1.length)
        System.out.println("Character mismatch occurs at "+num);
        else
        System.out.println("No character mismatch.");

    }
}
