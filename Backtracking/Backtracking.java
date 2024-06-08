public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        backtracking(0,0," ",board);
    }
    static void backtracking(int r , int c, String p, boolean[][] maze){
        if (r == maze.length -1  && c == maze[0].length -1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            backtracking(r+1,c,p + 'D',maze);
        }
        if (c < maze[0].length - 1) {
            backtracking(r,c+1,p + 'R',maze);
        }
        if (c > 0) {
            backtracking(r,c -1,p + 'L',maze);
        }
        if(r > 0){
            backtracking(r-1,c,p + 'U',maze);
        }
        // This line is where the function is over
        // so till this point all the cells are marked false
        // and before the next recursion call begins remove the false mark in the cells
        maze[r][c] = true;
    }
}
