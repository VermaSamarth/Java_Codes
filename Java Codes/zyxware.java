import java.util.Scanner;

public class zyxware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, inc = 0;
        System.out.println("Enter the number of employees: ");
        num = sc.nextInt();
        String empId[] = new String[num];
        String empName[] = new String[num];
        String gender[] = new String[num];
        String des[] = new String[num];
        double salary[] = new double[num];
        int exp[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of the employee.");
            sc.next();
            empName[i] = sc.nextLine();
            System.out.println("Enter the id of the employee.");
            empId[i] = sc.nextLine();
            System.out.println("Enter the gender of the employee.(f for female and m for male)");
            gender[i] = sc.nextLine();
            System.out.println("Enter SE for Software Engineer, SD for Software Developer, SA for Software Architect");
            des[i] = sc.nextLine();
            System.out.println("Enter the salary of the employee.");
            salary[i] = sc.nextDouble();
            System.out.println("Enter the  experience of the employee.");
            exp[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) { 
            if (gender[i].equals("f")) {
                inc = 5;
            } else {
                inc = 0;
            }

            if (des[i].equals("SD")) {
                inc = inc + 10;
                des[i] = "Software Engineer";
            } else if (des[i].equals("SE")) {
                inc = inc + 12;
                des[i] = "Software Architect";
            } else if (des[i].equals("SA")) {
                inc = inc + 15;
                des[i] = "Senior Manager";
            } else {
                inc = inc + 8;
            }
            salary[i] = salary[i] + (double)(salary[i] * (inc / 100.0));
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (salary[j] < salary[j + 1]) {
                    double temp = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = temp;

                    String name = empName[j];
                    empName[j] = empName[j + 1];
                    empName[j + 1] = name;

                    String id = empId[j];
                    empId[j] = empId[j + 1];
                    empId[j + 1] = id;

                    String desg = des[j];
                    des[j] = des[j + 1];
                    des[j + 1] = des[j];

                    String gen = gender[j];
                    gender[j] = gender[j + 1];
                    gender[j + 1] = gen;

                    int ex = exp[j];
                    exp[j] = exp[j + 1];
                    exp[j + 1] = ex;

                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(empName[i]);
            System.out.println(empId[i]);
            System.out.println(gender[i]);
            System.out.println(des[i]);
            System.out.println(salary[i]);
            System.out.println(exp[i]);

        }
    }
}
