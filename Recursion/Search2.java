import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search2 {
    public static void main(String[] args) {
    int [] arr = {1,3,2,4,5,6,5,8};
    ArrayList ans = check(arr,5,0);
        System.out.println(ans);
    }

    static ArrayList<Integer> check(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (arr[index] == arr.length) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans = check(arr,target,index + 1);
        list.addAll(ans);
        return list;
    }

}

