import java.util.Arrays;

public class missingnumber {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]; // here correct number will be at index arr[i] because the number is missing
            if( arr[i] < arr.length && arr[correct] != arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}