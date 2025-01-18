import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        ArrayList<String> ans1 = dice("",4);
        System.out.println(ans1);
    }
    static ArrayList<String> dice(String p, int target){
        if ( target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 &&  i <= target ; i++) {
           ans.addAll(dice(p+i,target - i ));
        }
        return ans;
    }
}
