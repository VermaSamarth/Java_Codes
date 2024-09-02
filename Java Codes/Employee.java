import java.util.ArrayList;

public class Employee {
    public static ArrayList<Float> taxing(ArrayList<Double> list)
    {
        float f;
        ArrayList<Float> tax=new ArrayList<Float>(list.size());
        for(double sal:list)
        {
            if(sal>=2000000)
            {
               f=(float)(sal*40)/100; 
            }
            else if (sal < 2000000 && sal>= 1500000) {
                f = (float) (sal * 35) / 100;
            }
            else if (sal < 1500000 && sal>=1000000) {
                f = (float) (sal * 30) / 100;
            }
            else if (sal < 1000000 && sal>=600000) {
                f = (float) (sal *25 ) / 100;
            }
            else{
                f=0.0f;
            }
            tax.add(f);
        }
        return tax;
    }
}
