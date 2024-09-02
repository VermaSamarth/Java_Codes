package Polymorphism;

public class Course {
    String courseName;
    String courseCode;
    int courseCredits;

    Course() {
        this.courseName = null;
        this.courseCode = null;
        this.courseCredits = 0;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public void setCourseCode(String code) {
        this.courseCode = code;
    }

    public void setCourseCredits(int num) {
        this.courseCredits = num;
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + "\nCourse Name: " + courseName + "\nCourse Credits: " + courseCredits;
    }
}
