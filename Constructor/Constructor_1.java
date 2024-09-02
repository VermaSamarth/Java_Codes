package Constructor;

import java.util.Scanner;

public class Constructor_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, marks;
        String name, regNo;
        System.out.println("Enter the number of students:");
        num = scan.nextInt();

        scan.nextLine();      //Written to avoid string input after interger input error

        Student object[] = new Student[num]; // Creating an Array of objects
        System.out.println("Enter the details of student....");
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the Student Name:");
            name = scan.nextLine();
            System.out.println("Enter the Register Number: ");
            regNo = scan.next();
            System.out.println("Enter the marks of the student: ");
            marks = scan.nextInt();
            scan.nextLine();

            // Storing values in the array of the object
            object[i] = new Student(name, regNo, marks);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(object[i].toString());
        }
        scan.close();
    }
}
