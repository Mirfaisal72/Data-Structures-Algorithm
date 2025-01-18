public class Main {
    public static void main(String[] args) {
pattern1(10);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}