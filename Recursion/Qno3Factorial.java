public class Qno3Factorial {
    public static void main(String[] args) {
        int ans = fun(5);
        System.out.println("The factorial of the number is: " + ans);
    }
    static int fun(int n){
        if(n <= 1){
            return 1;
        }
    return n * fun(n-1);
    }
}
