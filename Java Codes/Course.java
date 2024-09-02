public class Course {
    String courseCode, courseName, venue, slot, faculty;
    int totalSeats, credits;
    static int availableSeats;
    Course()
    {
        this.courseCode="BCSE101E";
        this.courseName="Java Programming";
        this.venue="SJT316";
        this.faculty="RA K SARAVANAGURU";
        this.slot="L3+L4";
        this.credits = 3;
        this.totalSeats = 65;
        this.availableSeats = 2;
    }
    @Override
    public String toString() {
        return "courseCode=" + courseCode + "\ncourseName=" + courseName + "\ncredits=" + credits + "\nfaculty="
                + faculty + "\nslot=" + slot + "\ntotalSeats=" + totalSeats + "\nvenue=" + venue;
    } 
    
}
