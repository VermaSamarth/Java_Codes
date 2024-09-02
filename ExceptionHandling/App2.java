package ExceptionHandling;

class DBZException extends Exception {
    public DBZException(String str) {
        super(str);
    }
}

class App2 {
    static double divide(int a, int b) throws DBZException {
        if (b == 0) {
            throw new DBZException("Divide by Zero is Permitted.");
        } else {
            return (double) a / b;
        }
    }

    public static void main(String args[]) {
        try {
            double d = divide(10, 0);
        } catch (DBZException e) {
            System.out.println(e);
        }
    }
}