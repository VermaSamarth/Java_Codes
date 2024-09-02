package Polymorphism;

public class BTechSpec extends BTech {
    int credits;
    int marks1, marks2;

    BTechSpec() {
        this.credits = 160;

    }

    BTechSpec(int num) {
        this.credits = num;
    }

    public void setMarks(int num1, int num2) {
        this.marks1 = num1;
        this.marks2 = num2;
    }

    public void setCredits(int num) {
        credits = num;
    }

    @Override
    public String toString() {
        return "Credits: " + credits + "\nMarks in Subject 1: " + marks1 + "\nMarks in Subject 2: " + marks2;
    }
}
