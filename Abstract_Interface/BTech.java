package Abstract_Interface;

public class BTech extends Student implements Branch {
    String username, passcode, degree;
    int duration, credits;
    boolean x = true;

    BTech(String name, String pass) {
        this.username = name;
        this.passcode = pass;
        this.degree = "Bachelors in Technology";
        this.duration = 4;
        this.credits = 150;
    }

    public void studentInfo(String branchName) {
        login(username, passcode);
        if (x == true) {
            collegeBranch(branchName);
            getDetails();
            logout();
        }
    }

    public void login(String name, String pass) {
        if (name.equals(pass) == true) {
            x = false;
            System.out.println("Login Unsuccesful.... Incorrect Credentials");
        } else
            System.out.println("Login Successful.... Correct Credentials");
    }

    public void collegeBranch(String branch) {
        System.out.println("Branch of Study: " + branch);
    }

    public void getDetails() {
        System.out.println("Program: " + degree + "\nDuration: " + duration + "\nCredits: " + credits);
    }

    public void logout() {
        System.out.println("Logout Successful....");

    }
}
