
/* 
*  This is my first application to test the application logic and the business logic for the program.
*  @author  :   Samarth Verma
*  @version :   1.0
*  @since   :   3rd August 2022 
*/

import java.util.*;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner scanInput = new Scanner(System.in);
        int numSubject, j;
        String studentName[] = new String[2];
        System.out.println("Enter the Name and password: ");
        studentName[0] = scanInput.nextLine();
        studentName[1] = scanInput.nextLine();
        System.out.println("Enter the number of Subjects: ");
        numSubject = scanInput.nextInt();
        System.out.println("Enter the marks of student: ");
        ArrayList<Integer> list = new ArrayList<Integer>(numSubject);
        for (int i = 0; i < numSubject; i++) {
            j = scanInput.nextInt();
            list.add(j);
        }
        Student object = new Student();
        object.checkCredentials(studentName);
        object.getGrade(list);
        scanInput.close();
    }

}
