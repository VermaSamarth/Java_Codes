/* 
 * 
 public class Constructor_App {
     
     public static void main(String args[]) {
        Student object1 = new Student1(22);
        Student object2 = new Student1(8.9);
        Student object3 = new Student1("Samarth");
        Student object4 = new Student1("21BCT0070");
        Student object5 = new Student1("Samarth Verma", "21BCT0070", 18, 8.9);
        Student object6 = new Student1(object5); // Copy Constructor
        Student object7 = object5; // Call by Reference
        System.out.println(object1.name);
        System.out.println(object2.name);
        System.out.println(object3.name);
        System.out.println(object4.name + "\n");
        System.out.println(object5.toString()); // Printing the constructor with 4 arguments
        System.out.println(object6.toString()); // Printing the copied constructor
        System.out.println(object7.toString() + "\n"); // Printing the constructor (Call by Reference)
        object5.age = 25; // Changing the age
                          // Printing after updation
        System.out.println(object5.toString());
        System.out.println(object6.toString());
        System.out.println(object7.toString());
    }
}

*/