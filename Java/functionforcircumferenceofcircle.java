import java.util.*;

public class functionforcircumferenceofcircle {

    public static void circumferenceOfCircle(double r){
        double circumference;
        circumference = 2*3.14*r;
        System.out.println("The circumference of a circle is: "+circumference); 
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        sc.close();

        circumferenceOfCircle(r);
        
    }
}
