import java.util.*;
public class PositiveNegative {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a:");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("number is positive:" + number);
        }else
            if(number < 0){
                System.out.println("number is negative:" + number);
            }
            else{
                System.out.println("you entered zero , which is neither positive or negative:" + number);
            }
    }
}
