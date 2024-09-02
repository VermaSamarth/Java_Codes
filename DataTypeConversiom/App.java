package DataTypeConversiom;

public class App {
    public static void main(String[] args) {
        String str = "50000";
        int sum = 0;
        int x = Integer.parseInt(str);
        sum = x + 1000;
        double y = Double.parseDouble(str);
        System.out.println("Sum: " + sum);
        System.out.println("Double: " + y);
        String str1 = Integer.toString(x);
        str1 = "samarth" + str1;
        System.out.println(str1);
    }
}
