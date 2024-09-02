package ExceptionHandling;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

class exceptiontest {
    static double divide(int a, int b) throws MyException {
        if (b != 0) {
            return a / b;
        } else
            throw new MyException("Divide by zero!");
    }

    public static void main(String[] args) throws MyException {
        try {
            double a = divide(1, 0);
        } catch (MyException s) {
            System.out.println(s);
        }
    }
}