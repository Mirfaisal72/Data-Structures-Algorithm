public class pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for (int row = 1; row <= n ; row++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
