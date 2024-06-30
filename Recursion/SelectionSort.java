import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int s, int e,int max){
        if(e==0){
            return;
        }
        if (s<e){
            if(arr[s]>arr[max]){
                sort(arr,s+1,e,s);
            }
            else{
                sort(arr,s+1,e,max);
            }
        }
        else{
            //Till now, we would have got the max element and now it's time to swap
            // By swap we mean to put it in the last index
            int temp = arr[max];
            arr[max] = arr[e-1];
            arr[e-1] = temp;
            sort(arr,0,e-1,0); //now check in the new array, excluding the last element
        }
    }
}
