import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path  = new int[board.length][board[0].length];
        allpath(0,0,board,path,1,"");

    }
    static void allpath(int r, int c, boolean[][] maze, int[][] path, int step, String p){

        if(r==maze.length-1 && c==maze[0].length -1){
            path[r][c] = step;
            for(int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r< maze.length-1){
            allpath(r+1,c,maze,path,step+1,p+ "D");
        }
        if(c< maze[0].length-1){
            allpath(r,c+1,maze,path,step+1,p+ "R");
        }
        if(c>0){
            allpath(r,c-1,maze,path,step+1,p+ "L");
        }
        if(r>0){
            allpath(r-1,c,maze,path,step+1,p+ "U");
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
