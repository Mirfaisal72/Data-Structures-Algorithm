public class MazeObstavle {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
                {false,true,true}
        };
        pathobs(0,0,"",board);
    }
    static void pathobs(int r, int c, String p, boolean[][] maze){
        if(r == maze.length - 1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathobs(r+1,c,p + "D",maze);
        }
        if(c<maze[0].length-1){
            pathobs(r,c+1,p + "R",maze);
        }
    }
}
