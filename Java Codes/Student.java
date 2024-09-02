
/*
 * This is my business logic code for the application logic App3 in java.
 * class name   :    Student
 * methods      :    void checkCredentials(String), void getGrade(int, ArrayList<Integer>)
 * return       :    No return type, It prints the information depending upon the data inputted.
 */

import java.util.*;

public class Student {
    public static void checkCredentials(String cred[]) {
        System.out.println(cred[0]);
        System.out.println(cred[1]);
        if (cred[0] == cred[1])
            System.out.println("Invalid Credentials");
        else
            System.out.println("Welcome User");
    }

    public static void getGrade(ArrayList<Integer> list) // Arraylist as the parameter of the method getGrade
    {
        int points, sum = 0;
        float GPA;
        ArrayList<Character> grades = new ArrayList<Character>(list.size()); // .size() to find the size of the
                                                                             // arraylist
        for (int number : list) {
            if (number >= 90) {
                grades.add('S');
                points = 10;
            } else if (number < 90 && number >= 80) {
                grades.add('A');
                points = 9;
            } else if (number < 80 && number >= 70) {
                grades.add('B');
                points = 8;
            } else if (number < 70 && number >= 60) {
                grades.add('C');
                points = 7;
            } else if (number < 60 && number >= 55) {
                grades.add('D');
                points = 6;
            } else if (number < 55 && number >= 50) {
                grades.add('E');
                points = 5;
            } else {
                grades.add('F');
                points = 0;
            }
            sum = sum + (3 * points);
        }
        GPA = (float) sum / (list.size() * 3);
        System.out.println(list);
        System.out.println(grades);
        System.out.println(GPA);
    }
}
