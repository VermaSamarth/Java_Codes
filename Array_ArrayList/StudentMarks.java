// package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int num = scan.nextInt();
        scan.nextLine();
        ArrayList<Integer> marks = new ArrayList<Integer>(num);
        ArrayList<Character> grades = new ArrayList<Character>(num);
        String str[] = new String[2];
        System.out.println("Enter the name and the passcode: ");
        str[0] = scan.nextLine();
        str[1] = scan.nextLine();
        System.out.println("Enter the marks in " + num + " subjects: ");
        for (int i = 0; i < num; i++) {
            marks.add(scan.nextInt());
        }
        double sum = 0.0;
        for (int i : marks) {
            if (i >= 90) {
                grades.add('S');
                sum = sum + 10;
            } else if (i >= 80 && i < 90) {
                grades.add('A');
                sum = sum + 9;
            } else if (i >= 70 && i < 80) {
                grades.add('B');
                sum = sum + 8;
            } else if (i >= 60 && i < 70) {
                grades.add('C');
                sum = sum + 7;
            } else if (i >= 50 && i < 60) {
                grades.add('D');
                sum = sum + 6;
            } else if (i >= 40 && i < 50) {
                grades.add('E');
                sum = sum + 6;
            } else {
                grades.add('F');
                sum = sum + 5;
            }
        }
        if (str[0].equals(str[1])) {
            System.out.println("Invalid Credentials.....");
        }
        System.out.println(marks);
        System.out.println(grades);
        System.out.println(sum / num);
        scan.close();
    }
}
