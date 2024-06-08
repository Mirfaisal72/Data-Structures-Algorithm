import java.util.ArrayList;

public class NQueens_Leetcode {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        ArrayList<ArrayList<String>> solutions = new ArrayList<>(); // an array which contains array of strings
        solve(board, 0, solutions);
        System.out.println(solutions);
        System.out.println();

        // Print the solutions
        for (ArrayList<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    private static void solve(boolean[][] board, int row, ArrayList<ArrayList<String>>  solutions) {
        if (row == board.length) {
            solutions.add(construct(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                solve(board, row + 1, solutions);
                board[row][col] = false;
            }
        }
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<String> construct(boolean[][] board) {
        ArrayList<String> path = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder(); //Creating a String builder which is mutable  so that we can add elements to it
            for (boolean cell : row) {
                if (cell) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            path.add(sb.toString());
        }
        return path;
    }
}
