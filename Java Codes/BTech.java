public class BTech extends Student2 {
    String courseCode, courseName, venue, slot, faculty, userName, password;
    int totalSeats, credits;
    static int availableSeats;
    Course object = new Course();
    BTech()
    {
        this.courseCode=object.courseCode;
        this.courseName=object.courseName;
        this.venue=object.venue;
        this.slot=object.venue;
        this.faculty=object.faculty;
        this.credits=object.credits;
        this.totalSeats=object.totalSeats;
        this.availableSeats=object.availableSeats;
        this.userName="Guest";
        this.password=null;
    }
    boolean bool=(availableSeats>0 && courseCode.equals("BCSE101E") && slot.equals("L3+L4"));
    public void registerCourse(String code, String slot1)
    {
        this.slot=slot1;
        this.courseCode=code;
        if(bool)
        availableSeats--;
    }
    public String displayRegistration()
    {
        if(bool)
        {
             return "Registration Details..."+"\nusername="+userName+"\ncourseCode="+courseCode+"\nstatus: Registered";
        }
        else
        return "Course is not registered...";
    }
    public String displayCourseDetails(String code)
    {
        this.courseCode=code;
        if(courseCode.equals("BCSE101E"))
        {
            return "Course Details..."+"\ncourseCode=" + courseCode + "\ncourseName=" + courseName + "\ncredits=" + credits + "\nfaculty="
                    + faculty + "\nslot=" + slot + "\ntotalSeats=" + totalSeats + "\nvenue=" + venue;
        }
        else
        return "Check course code...";
    }
}
