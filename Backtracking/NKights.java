public class NKights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        //Knights(board, 0, 0, 4);
        System.out.println("The number of possible arrangements are: "+ Knights(board,0,0,4));
    }

    static int Knights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return 1;
        }
        if (row == board.length) {
            return 0;
        }
        if (col == board.length) {
            return Knights(board, row + 1, 0, knights);

        }
        int count = 0;
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += Knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        // Move to the next column if its snot safe to place it here
        count += Knights(board, row, col + 1, knights);
        return count;
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
        return row >= 0 && row < board.length && col >= 0 && col < board.length;// this checks if the knight is within the bound
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
}
