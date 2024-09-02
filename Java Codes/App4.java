import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter what you want to search: ");
            String str=scan.nextLine();
            demo object = new demo();
            System.out.println(object.search(str) + "\n");
            System.out.println(object.search1(str) + "\n");
            System.out.println(object.display(str) + "\n");
            System.out.println(object.display1(str) + "\n");
            scan.close();;
        }
    }
}