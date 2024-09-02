package Abstract_Interface;

public class App {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        BTech object1 = new BTech("Samarth Verma", "Samarth123");
        object1.studentInfo("Computer Science and Engineering with Specialization in Internet of Things");
        System.out.println("--------------------------------------------");
        MTech object2 = new MTech("Aditya Sinha", "Aditya123");
        object2.studentInfo("Computer Science and Engineering with Specialization in Blockchain Technology");
        System.out.println("--------------------------------------------");
    }
}
