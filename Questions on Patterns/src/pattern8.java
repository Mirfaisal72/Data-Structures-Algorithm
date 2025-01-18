public class pattern8 {
    public static void main(String[] args) {
    pattern8(5);
    }
    static void pattern8(int n){
        n = 2*n;
        for (int row = 1; row < n ; row++) {
            for (int cols = 1; cols < n ; cols++) {
                 int ateveryindex = Math.min(Math.min(row,cols),Math.min(n-row,n-cols));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }
    }
}
