public class NKnights_Count {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        CountWrapper counter = new CountWrapper(); //counter is the object of class CountWrapper
        Knights(board, 0, 0, 4, counter);
        System.out.println("The number of arrangements are: "+ counter.count);
    }

    static void Knights(boolean[][] board, int row, int col, int knights, CountWrapper counter) { //counter is the object of class CountWrapper
        if (knights == 0) {
            display(board);
            System.out.println();
            counter.count++;
            return;
        }
        if (row == board.length) {
            return;
        }
        if (col == board.length) {
            Knights(board, row + 1, 0, knights, counter);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            Knights(board, row, col + 1, knights - 1, counter);
            board[row][col] = false;
        }
        Knights(board, row, col + 1, knights, counter);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }
        if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }
        if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static class CountWrapper {
        int count = 0;
    }
}
