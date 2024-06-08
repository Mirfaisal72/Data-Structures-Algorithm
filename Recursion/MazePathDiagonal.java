import java.util.ArrayList;

public class MazePathDiagonal {
    public static void main(String[] args) {
        System.out.println(diagonalpath(3,3,""));
    }
    static ArrayList<String> diagonalpath(int r, int c, String p){
        ArrayList<String> list = new ArrayList<>();
        if(r==1 && c==1){
             list.add(p);
             return list;
        }
       // ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1 ){
            list.addAll(diagonalpath(r-1,c-1,p+'D'));
        }
        if(r>1){
            list.addAll(diagonalpath(r-1,c,p+'V'));
        }
        if(c>1){
            list.addAll(diagonalpath(r,c-1,p + "H"));
        }
        return list;

    }

}
