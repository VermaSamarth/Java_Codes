package Inheritance;

public class Student {
    String studentName;
    String registerNo;
    int age;
    double cgpa;

    Student() {
        this.cgpa = 0.0;
        this.studentName = null;
        this.registerNo = null;
        this.age = 0;
    }

    Student(String name, String reg) {
        this();
        this.studentName = name;
        this.registerNo = reg;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public void setRegister(String reg) {
        this.registerNo = reg;
    }

    public void setAge(int n) {
        this.age = n;
    }

    public void setCGPA(double c) {
        this.cgpa = c;
    }
}
