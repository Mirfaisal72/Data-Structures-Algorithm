public class alpha {
    public static void alpha(String[] args) {
        String[][] board = new String[][]{
                {"A", "B", "C"},
                {"D", "E", "S"},
                {"T", "E", "F"}
        };
        String target = "S";
        boolean ans = main(board, target,0,0);
        System.out.println(ans);
    }
    static boolean main(String [][] board ,String target,int row, int col){
        for(row = 0; row <= board.length; row++){
            for(col = 0; col <= board[row].length; col++ ){
                if(board[row][col] == target ){
                    return true;
                }
            }
        }
        return false;
    }
}
