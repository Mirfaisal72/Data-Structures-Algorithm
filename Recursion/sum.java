public class sum {
    public static void main(String[] args) {
        int ans = sum(12345);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n%10 + sum(n/10);
        }
    }
}
