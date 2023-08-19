public class SerachInrange {
    public static void main(String[] args) {
        int[] arr = {11, 23,45,67,8,3,54,675};
        int ans = search(arr, 54,1,5); //in range of 1 to 5
        System.out.println(ans);

    }
    static int search(int[] arr,int target, int start, int end ){ //range from start to end
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <end ; i++) {     //I would start from "Start" and I would run till "End"
            if (target == arr[i]) {
                return i;
            }

        }
        return -1;
    }
}
