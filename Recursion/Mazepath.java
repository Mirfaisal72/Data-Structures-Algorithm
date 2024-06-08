import java.util.ArrayList;

public class Mazepath {
    public static void main(String[] args) {
        ArrayList ans =  path(3,3," ");
        System.out.println(ans);
    }
    static ArrayList<String> path(int r, int c, String p){
        ArrayList<String> list = new ArrayList<>();
        if(r == 1 && c ==1){
            list.add(p);
            return list;
        }
        if(r > 1){
            list.addAll(path(r-1,c,p + "D"));
        }
        if(c > 1){
            list.addAll(path(r,c-1,p + "R"));
        }
        return list;
    }
}
