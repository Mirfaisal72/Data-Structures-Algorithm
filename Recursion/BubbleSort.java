import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr,int s, int e){
        if(e==0){
            return;
        }
        if(s<e){
            if(arr[s] > arr[s+1]){
                //swap
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
            bubble(arr,s+1,e);
        }
        else{ //here s is not less than end this means we have reached the end and 1 check has been passed
            // therefore we'll do the next check, excluding the last element
            bubble(arr,0,e-1);
        }
    }

}
