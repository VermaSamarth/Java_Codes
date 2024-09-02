package Abstract_Interface;

public abstract class Student {
    String username,passcode,degree;
    int duration, credits;
    public void studentInfo()
    {
        login(username,passcode);
        getDetails();
        logout();
    }
    public abstract void login(String name,String pass);

    public abstract void getDetails();

    public abstract void logout();
    

}
