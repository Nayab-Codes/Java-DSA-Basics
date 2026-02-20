public class ReverseOfNum {
    public static void main(String [] args){
        int n = 520574;
        while(n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
    }
}
