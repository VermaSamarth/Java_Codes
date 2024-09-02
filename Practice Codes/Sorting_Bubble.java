public class Sorting_Bubble{

    public static void main(String[] args) {
        int x1 = 4;
        int y1 = 14;
        int x2 = 10;
        int y2 = 7;
        
        // Calculate vector corresponding to segment p1->p2
        int dx = x2 - x1;
        int dy = y2 - y1;
        
        // Calculate dot product and angle with negative X axis
        double dotProductX = dx * -1;
        double angleX = Math.acos(dotProductX / Math.sqrt(dx * dx + dy * dy));
        
        // Calculate dot product and angle with positive Y axis
        double dotProductY = dy * 1;
        double angleY = Math.acos(dotProductY / Math.sqrt(dx * dx + dy * dy));
        
        // Check if moving counter-clockwise from p1 onto p2 along -ve X axis
        if (angleX > Math.PI / 2 && angleY < Math.PI / 2) {
            System.out.println("Moving counter-clockwise from p1 onto p2 along -ve X axis");
        } else {
            System.out.println("Not moving counter-clockwise from p1 onto p2 along -ve X axis");
        }
    }
}
