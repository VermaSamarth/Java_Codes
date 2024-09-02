
/*
 * This is the application logic for the program 
 */
import java.util.Scanner;

public class Encap_App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student1 object1 = new Student1();
        Student1 object2 = new Student1("Samarth Verma", "21BKT0022", 18, 8.9);
        Student1 object3 = new Student1("Samarth Verma", "21BCT0069");
        Student1 object4 = new Student1(18, "Samarth Verma");
        Student1 object5 = new Student1(9.9);
        System.out.println(object1.toString());
        System.out.println(object2.toString());
        System.out.println(object3.toString());
        System.out.println(object4.toString());
        System.out.println(object5.toString());
        // String name, regNo;
        // int age;
        // double cgpa;
        // for (int count = 0; count < 3; count++) {
        // System.out.println("Enter the details of the student: ");
        // System.out.println("Enter the age: ");
        // age = scan.nextInt();
        // System.out.println("Enter the cgpa: ");
        // cgpa = scan.nextDouble();
        // scan.nextLine();
        // System.out.println("Enter the name: ");
        // name = scan.nextLine();
        // System.out.println("Enter the regNO: ");
        // regNo = scan.next();
        // object[count] = new Student1(name, regNo, age, cgpa);
        // // }
        // for (int i = 0; i < 3; i++) {
        // System.out.println(object[i].toString());
        // }
    }
}