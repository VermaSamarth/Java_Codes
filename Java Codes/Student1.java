/*
 * This is the Business logic code for Application Logic Encap_App.
 * class name   :   Student1
 * methods      :
 * returns      :
 */

public class Student1 {
    String studentName, regNumber;
    int age;
    double cgpa;

    Student1() {
        studentName ="Samarth Verma";
        regNumber = "21BCT0070";
        age = 0;
        cgpa = 7.7;
    }

    Student1(String name1, String regNo, int age1, double marks) {
        this();
        this.studentName = name1;
        this.regNumber = regNo;
        this.age = age1;
        this.cgpa = marks;
    }

    Student1(String name1, String regNo) {
        this();
        this.studentName = name1;
        this.regNumber = regNo;
    }

    Student1(double marks) {
        this();
        this.cgpa = marks;
    }

    Student1(int age1, String name1) {
        this();
        this.studentName = name1;
        this.age = age1;
    }

    @Override
    public String toString() {
        return "Student1 [age=" + age + ", cgpa=" + cgpa + ", regNumber=" + regNumber + ", studentName=" + studentName
                + "]";
    }

}
