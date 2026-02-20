import java.util.*;
public class Print1ToN {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number from 1 to n:");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range){
            System.out.print(counter + " ");
            counter ++;
        }
        System.out.println("Done!");
    }
}
