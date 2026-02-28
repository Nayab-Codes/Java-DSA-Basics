public class Fact {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i ++){
            f = f * i; // multiplying each number upto n
        }
         return f; // return final result after loop completion
    }
    public static void main(String [] args){
        int n = 4;
        int facts = factorial(n); // calling factorial method and storing the result
        System.out.println(facts);
    }
}
