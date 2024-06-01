public class Reverse {
    public static void main(String[] args) {
    int ans = rev(12345,0);
    System.out.println(ans);
    }
    static int rev(int n,int reverse){
        if(n == 0){
            return reverse;
        }
        int rem = n % 10;
        reverse = reverse * 10 + rem;

        return rev(n/10,reverse);
    }
}
