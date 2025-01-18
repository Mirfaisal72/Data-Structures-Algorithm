public class pattern4 {
    public static void main(String[] args) {
        pattern4(10);
    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
