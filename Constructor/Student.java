package Constructor;

public class Student {
    String studentName;
    String studentRegNo;
    int internalMarks;

    Student() // Default Constructor
    {
        this.studentName = null;
        this.studentRegNo = null;
        this.internalMarks = 0;
    }

    Student(String name, String reg) // Parameterised Constructor with 2 parameters
    {
        this();
        this.studentName = name;
        this.studentRegNo = reg;
    }

    Student(String name, String reg, int marks) // Parameterised Constructor with 2 parameters
    {
        this();
        this.studentName = name;
        this.studentRegNo = reg;
        this.internalMarks = marks;
    }

    // Function overriding
    @Override
    public String toString() {
        return "Student Name: " + studentName + "\nStudent Register Number: " + studentRegNo
                + "\nStudent Internal Marks: " + internalMarks + "\n-------------------------------";
    }
}
