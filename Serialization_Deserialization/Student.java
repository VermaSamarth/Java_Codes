package Serialization_Deserialization;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String regno;
    Integer marks;

    Student() {
        this.name = "XYZ";
        this.regno = "21BCT0099";
        this.marks = 100;
    }

    Student(String n) {
        this();
        this.name = n;
    }

    Student(String n, String reg) {
        this();
        this.name = n;
        this.regno = reg;
    }

    Student(String n, String reg, int num) {
        this();
        this.name = n;
        this.regno = reg;
        this.marks = num;
    }
}
