import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr, int low , int hi){
        // low and high is to know which part of the array we are at
        // start and end is for general swapping
         if(low>=hi){
             return;
         }
         int s = low;
         int e = hi;
         int m = s +(e-s)/2;
         int pivot = arr[m];

         while(s <= e){
             while(arr[s] < pivot){
                 s++;
             }
             while(arr[e] > pivot){
                 e--;
             }
             //here the condition violates i.e start is not less than pivot so swap
             // here we need to again check if s < e because s++ and e-- may have violated the s < e condition
             if(s <= e){
                 int temp = arr[s];
                 arr[s] = arr[e];
                 arr[e] = temp;
                 s++;
                 e--;
             }
             // At this point condition is violated i.e s>e and this means that pivot is at correct index
         }
         QuickSort(arr,low,e);
         QuickSort(arr,s,hi);
    }
}
