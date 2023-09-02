import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            int lastindex = arr.length - i -1;
            int maxindex = max(arr, 0, lastindex);
            swap(arr,maxindex,lastindex);
        }
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int max(int[] arr, int start ,int end ){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(max < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
