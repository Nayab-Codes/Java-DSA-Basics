import java.util.*;
public class IncomeTaxCal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int income = sc.nextInt();
        if(income < 500000){
            System.out.println("Tax 0%.");
        }else
            if(income >= 500000 && income <= 1000000){
                System.out.println("Tax 20%.");
            }
            else{
                if(income > 1000000){
                    System.out.println("Tax 30%");
                }
            }
    }
}
