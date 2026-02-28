public class Product {
    public static int multiply(int a , int b){
        int  i = a * b;
        return i;
    }
    public static void main(String [] args){
        int a = 10;
        int b = 12;
        int prod = multiply(a , b);
        System.out.println("product of a & b is: " + prod);
    }
}
