import java.util.*;
public class Parameters {
    public static void CalculateSum(int a , int b){
        int sum = a + b;
        System.out.println("sum is :" +sum);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a");
        int a = sc.nextInt();
        System.out.println("enter number b");
        int b = sc.nextInt();
        CalculateSum(a , b);
    }
}
