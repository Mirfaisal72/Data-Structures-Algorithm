public class pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for (int row = 1; row <= n ; row++) {

            for (int space = 1; space <= n - row ; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col);
            }

        }
        System.out.println();
    }
}
