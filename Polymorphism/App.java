package Polymorphism;

public class App {
    public static void main(String[] args) {
        BTechSpec object = new BTechSpec();
        object.setCredits(175);
        object.setMarks(99, 89);
        System.out.println(object.toString());
        object.setMarks(89, 87, 79);
        object.setMarks(97, 76);
        System.out.println(object.toString());
    }
}
