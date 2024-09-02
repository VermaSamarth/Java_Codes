package Polymorphism;

public class Student {
    String name, regno;

    Student() {
        this.name = null;
        this.regno = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegNo(String reg) {
        this.regno = reg;
    }

    public void register(String courseN, String courseC, int num) {
        Course object = new Course();
        object.setCourseCode(courseC);
        object.setCourseName(courseN);
        object.setCourseCredits(num);
        System.out.println(object.toString());
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\nStudent Register Number: " + regno;
    }
}
