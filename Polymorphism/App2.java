package Polymorphism;

public class App2 {
    public static void main(String[] args) {
        Student object = new Student();
        object.setName("Samarth Verma");
        object.setRegNo("21BCT0070");
        System.out.println(object.toString());
        object.register("Introduction to Programming : JAVA", "BCSE201L", 3);
    }

}
