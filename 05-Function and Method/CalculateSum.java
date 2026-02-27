import java.util.*;
public class CalculateSum {
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a:");
        int a = sc.nextInt();
        System.out.println("enter number b:");
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("addition is " + add);
    }
    public static void main(String [] args){
        sum();
    }
}
