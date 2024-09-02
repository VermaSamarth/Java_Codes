package Serialization_Deserialization;

import java.io.*;
import java.util.*;
public class Serial_Example {
    
    public static void main(String args[]) throws Exception {
        Student object = new Student("Samarth", "21BCT0070");
        System.out.println(object.name + " " + object.regno + " " + object.marks);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.obj"));
        out.writeObject(object);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.obj"));
        Student object1 = (Student) in.readObject();
        System.out.println(object1.name + " " + object1.regno + " " + object1.marks);
    }
}

