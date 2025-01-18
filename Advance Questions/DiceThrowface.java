import java.util.ArrayList;

public class DiceThrowface {
    public static void main(String[] args) {
        ArrayList<String> ans1 = dice("",7,8);
        System.out.println(ans1);
    }
    static ArrayList<String> dice(String p, int target,int face){
        if ( target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face &&  i <= target ; i++) {
            ans.addAll(dice(p+i,target - i,face ));
        }
        return ans;
    }
}
