package Polymorphism;

public class BTech {
    int credits;
    int subject1,subject2,subject3;

    BTech() {
        this.credits = 150;
    }
    public void setMarks(int num1,int num2, int num3)
    {
        this.subject1=num1;
        this.subject2=num2;
        this.subject3=num3;
    }

    public void setCredits(int num)
    {
        credits=num;
    }
}
