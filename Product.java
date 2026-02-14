import java.util.*;
public class Product {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Numbers A:");
        int A = sc.nextInt();
        System.out.println("Enter Second Numbers B:");
        int B = sc.nextInt();
        int product = A * B;
        System.out.println(product);
    }
}
