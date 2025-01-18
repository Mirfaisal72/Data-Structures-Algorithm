public class pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        for (int row = 1; row <= n ; row++) {
            for (int cols = 1; cols <= n - row +1; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
