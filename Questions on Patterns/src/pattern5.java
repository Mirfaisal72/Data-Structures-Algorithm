public class pattern5 {
    public static void main(String[] args) {
        pattern5(10);
    }
    static void pattern5(int n){
        for (int row = 1; row < 2 * n ; row++) {
             int totalcolsinrow = row > n ? 2 * n - row : row;
            for (int cols = 1; cols <= totalcolsinrow; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
