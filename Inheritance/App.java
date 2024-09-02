package Inheritance;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BTech object1 = new BTech();
        System.out.println("Enter the name of the student: ");
        String name = scan.nextLine();
        System.out.println("Enter the register number of the student: ");
        String reg = scan.nextLine();
        System.out.println("Enter the age of the student: ");
        int age = scan.nextInt();
        System.out.println("Enter the cgpa of the student: ");
        double cgpa = scan.nextDouble();
        object1.setName(name);
        object1.setRegister(reg);
        object1.setAge(age);
        object1.setCGPA(cgpa);

        System.out.println(object1.toString());
        scan.close();
    }
}
