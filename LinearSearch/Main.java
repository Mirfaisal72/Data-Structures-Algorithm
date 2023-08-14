public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,76,89,46,32,87,7,3};
        //int target = 3;
        int ans =linearsearch(arr ,1);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target){
        if (arr.length== 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;

            }

        }
        return -1;
    }
}