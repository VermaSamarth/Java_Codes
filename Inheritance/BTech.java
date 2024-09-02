package Inheritance;

public class BTech extends Student { // Student class is extended into the BTech class
    String collegeName, name, regno;
    String branch;
    int year, studentAge;
    double studentCGPA;

    BTech() { // Non-parameterised constructor
        this.collegeName = "Vellore Institute of Technology";
        this.branch = "Computer Science and Engineering";
        this.year = 02;
        this.name = studentName;
        this.regno = registerNo;
        this.studentAge = age;
        this.studentCGPA = cgpa;
    }

    BTech(String cName, String bName, int cYear) {
        this(); // Parameterised Constructor
        this.collegeName = cName;
        this.branch = bName;
        this.year = cYear;
    }

    @Override
    public String toString() {
        return "------------------------------------" + "\nStudent Name: " + studentName + "\nStudent Register Number: "
                + registerNo + "\nStudent Age: " + age + "\nCollege Name: " + collegeName + "\nBranch: " + branch
                + "\nYear of Study:  " + year + "\nStudent CGPA: " + cgpa + "\n------------------------------------";

    }

}