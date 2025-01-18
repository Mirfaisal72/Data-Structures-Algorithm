public class patterns6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for (int row = 1; row < 2 * n ; row++) {
            int totalcolsinrow = row > n ? 2 * n - row : row;
            int numberofspaces = n - totalcolsinrow;

            for (int s = 1; s <= numberofspaces ; s++) {
                System.out.print(" ");
            }

            for (int cols = 1; cols <= totalcolsinrow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
