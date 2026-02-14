import java.util.*;
public class AreaOfCircle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius R:");
        double R = sc.nextDouble();
        double area = 3.14 * R * R;
        System.out.println(area);
    }
}
