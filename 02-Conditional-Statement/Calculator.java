import java.util.*;
public class Calculator {
    public static void main(String [] args){
        // Create scanner object to read input from users
        Scanner sc = new Scanner(System.in);
        // Ask users to enter first no.
        System.out.println("Enter a:");
        int a = sc.nextInt();
        // Ask users to enter second no.
        System.out.println("Enter b:");
        int b = sc.nextInt();
        // Ask user to enter an operator
        System.out.println("Enter operator (+,-,*,/,%):");
        char operator = sc.next().charAt(0);
        // Perform operation basaed on operator
        switch(operator){
            case '+': System.out.println(a + b); // Addition
            break;
            case '-' : System.out.println(a - b); // Subtraction
            break;
            case '*' : System.out.println(a * b); // Multiplication
            break;
            case '/' : System.out.println(a / b); // Division
            break;
            case '%' : System.out.println(a % b); // Modulus
            break;
            // Executes when operator is invalid
            default : System.out.println("Sorry! Not Valid");
        }
    }
}
