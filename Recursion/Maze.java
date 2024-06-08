public class Maze {
    public static void main(String[] args) {
        System.out.println("The total paths are: "+maze(4,4));

    }
    static int maze(int r, int c){

        if(r==1||c==1){
            return 1;
        }
        int left = maze(r-1,c);
        int right = maze(r,c-1);
        return left + right;
    }
}
