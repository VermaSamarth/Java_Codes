package File_Handling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class File_Reader {
    public static void main(String[] args) throws Exception {
        try (BufferedReader data = new BufferedReader(
                new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\java\\File_Handling\\text.csv"))) {
            String line;
            ArrayList<Student> list = new ArrayList<Student>();
            while ((line = data.readLine()) != null) {
                String[] temp = line.split(",");
                Student object = new Student();
                object.name = temp[0];
                object.regno = temp[1];
                object.age = Integer.parseInt(temp[2]);
                object.marks = Integer.parseInt(temp[3]);
                list.add(object);
            }
            for (Student object : list) {
                System.out.println("Name: " + object.name);
                System.out.println("Register Number: " + object.regno);
                System.out.println("Age: " + object.age);
                System.out.println("Marks: " + object.marks);
            }
            System.out.println("Average Marks: " + averageMarks(list));
        }
    }

    public static double averageMarks(ArrayList<Student> data) {
        int count = 0;
        double total = 0.0;
        for (Student student : data) {
            total += student.marks;
            count++;
        }
        return (total / count);
    }
}

// BufferedReader data = new
// BufferedReader(newFileReader("C:\\Users\\hp\\OneDrive\\Desktop\\java\\File_Handling\\text.csv"));
// ArrayList<Integer> numberInput = new ArrayList<Integer>();
// String line;
// String splitChar = ",";
// String tempInput[];
// while ((line = readerInput.readLine()) != null) {
// if (!line.isEmpty()) {
// tempInput = line.split(splitChar);
// numberInput.add(Integer.parseInt(tempInput[0]));
// }
// }
// System.out.println(numberInput);
