package File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Writer {
    public static void input() {
        Student object = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        object.name = scan.nextLine();
        System.out.println("Enter the register number of the student:");
        object.regno = scan.nextLine();
        System.out.println("Enter the age of the student:");
        object.age = scan.nextInt();
        System.out.println("Enter the marks of the student:");
        object.marks = scan.nextInt();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student object = new Student();
        System.out.println("Enter the Details....");
        input();
        try {
            FileWriter studentUpdate = new FileWriter(
                    "C:\\Users\\hp\\OneDrive\\Desktop\\java\\File_Handling\\text_update.csv");
            String content = object.name + "," + object.regno + "," + object.age + "," + object.marks;
            studentUpdate.write(content);
            studentUpdate.close();
            System.out.println("Added to the file.");
        } catch (IOException e) {
            System.out.println("Can't add to the file.");
        }
        try (BufferedReader studentInput = new BufferedReader(
                new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\java\\File_Handling\\text_update.csv"))) {
            String line;
            ArrayList<Student> list = new ArrayList<Student>();
            while ((line = studentInput.readLine()) != null) {
                String[] temp = line.split(",");
                Student object1Student = new Student();
                object.name = temp[0];
                object.regno = temp[1];
                object.age = Integer.parseInt(temp[2]);
                object.marks = Integer.parseInt(temp[3]);
                list.add(object);
            }
            for (Student objec1Student : list) {
                System.out.println("Name: " + object.name);
                System.out.println("Register Number: " + object.regno);
                System.out.println("Age: " + object.age);
                System.out.println("Marks: " + object.marks);
            }
        }
    }
}
