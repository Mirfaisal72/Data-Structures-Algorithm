public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot be solved");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true; // true indicates there are empty cells to be filled

        // Find the first empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false; //this indicates that one empty cell has been found
                    break;// come out of the inner loop once an empty cell is found because we will solve it one cell at a time
                }
            }
            if (!emptyLeft) { // this is used to come out of the outer loop also
                break;
            }
        }

        // No empty cells left, puzzle is solved
        if (emptyLeft) { // if after traversing through whole board the empty left is still true it means that there are no empty cells left, otherwise they would have become false
            return true;
        }

        // Backtracking to solve the Sudoku
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;//  if it is safe to place the number in this cell than place it
                if (solve(board)) { // After placing the number, it recursively calls solve(board) to attempt to solve the rest of the board with that number in place.
                    //The recursive call works on the assumption that if the rest of the board can be solved with this number in the current cell, then placing the number here is part of the correct solution
                    return true; //this means one possible answer has been found
                } else {
                    board[row][col] = 0; // Reset the cell, if putting the number in that cell does not lead to a solution for the whole board than backtrack and check for next possible number
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the number is in the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check if the number is in the column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check if the number is in the inner 3x3 subgrid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
